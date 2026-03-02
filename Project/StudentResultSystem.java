import java.util.*;

// Custom Exception for Invalid Marks
class InvalidMarksException extends Exception {
    public InvalidMarksException(String msg) {
        super(msg);
    }
}

// Custom Exception for Student Not Found
class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String msg) {
        super(msg);
    }
}

// Subject Class
class Subject {
    private String subjectName;
    private int marks;
    private double attendance;

    public Subject(String subjectName, int marks, double attendance) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100");
        }
        this.subjectName = subjectName;
        this.marks = marks;
        this.attendance = attendance;
    }

    public String getSubjectName() { return subjectName; }
    public int getMarks() { return marks; }
    public double getAttendance() { return attendance; }

    public String getGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 75) return "A";
        else if (marks >= 60) return "B";
        else if (marks >= 50) return "C";
        else return "Fail";
    }
}

// Student Class
class Student {
    private int studentId;
    private String name;
    private String course;
    private ArrayList<Subject> subjects = new ArrayList<>();

    public Student(int id, String name, String course) {
        this.studentId = id;
        this.name = name;
        this.course = course;
    }

    public void addSubject(Subject s) {
        subjects.add(s);
    }

    public int getStudentId() { return studentId; }
    public String getName() { return name; }
    public String getCourse() { return course; }
    public ArrayList<Subject> getSubjects() { return subjects; }

    public double calculateCGPA() {
        double total = 0;
        for (Subject s : subjects) {
            total += s.getMarks();
        }
        return subjects.size() == 0 ? 0 : (total / subjects.size()) / 10;
    }
}

// Database Class
class StudentDatabase {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public Student findStudent(int id) throws StudentNotFoundException {
        for (Student s : students) {
            if (s.getStudentId() == id) return s;
        }
        throw new StudentNotFoundException("Student with ID " + id + " not found");
    }
}

// Thread Class
class ReportThread implements Runnable {
    private Student student;

    public ReportThread(Student student) {
        this.student = student;
    }

    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n===== RESULT CARD =====");
        System.out.println("Name : " + student.getName());
        System.out.println("Course : " + student.getCourse());

        for (Subject s : student.getSubjects()) {
            System.out.printf("%-15s: %d marks | %s%n",
                    s.getSubjectName(), s.getMarks(), s.getGrade());

            if (s.getAttendance() < 75) {
                System.out.println("⚠ Low Attendance in " + s.getSubjectName());
            }
        }

        System.out.printf("CGPA : %.2f%n", student.calculateCGPA());
        System.out.println("=======================\n");
    }
}

// Main Class
public class StudentResultSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDatabase db = new StudentDatabase();

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Add Subject");
            System.out.println("3. Generate Result");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();

            try {
                switch (choice) {

                    case 1:
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Course: ");
                        String course = sc.nextLine();

                        db.addStudent(new Student(id, name, course));
                        System.out.println("Student Added!");
                        break;

                    case 2:
                        System.out.print("Enter Student ID: ");
                        int sid = sc.nextInt();
                        sc.nextLine();

                        Student st = db.findStudent(sid);

                        System.out.print("Enter Subject: ");
                        String sub = sc.nextLine();

                        System.out.print("Enter Marks: ");
                        int marks = sc.nextInt();

                        System.out.print("Enter Attendance: ");
                        double att = sc.nextDouble();

                        st.addSubject(new Subject(sub, marks, att));
                        System.out.println("Subject Added!");
                        break;

                    case 3:
                        System.out.print("Enter Student ID: ");
                        int rid = sc.nextInt();

                        Student s = db.findStudent(rid);

                        Thread t = new Thread(new ReportThread(s));
                        t.start();
                        break;

                    case 4:
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice!");
                }

            } catch (InvalidMarksException | StudentNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}