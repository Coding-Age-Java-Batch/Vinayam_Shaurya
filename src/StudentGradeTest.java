class Student {

    // Private fields
    private String name;
    private int rollNumber;
    private double mathGrade;
    private double scienceGrade;
    private double englishGrade;

    // Constructor
    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Validation method
    private boolean isValidGrade(double grade) {
        return grade >= 0 && grade <= 100;
    }

    // Setter methods
    public void setMathGrade(double grade) {
        if (isValidGrade(grade))
            this.mathGrade = grade;
        else
            System.out.println("Invalid Math Grade!");
    }

    public void setScienceGrade(double grade) {
        if (isValidGrade(grade))
            this.scienceGrade = grade;
        else
            System.out.println("Invalid Science Grade!");
    }

    public void setEnglishGrade(double grade) {
        if (isValidGrade(grade))
            this.englishGrade = grade;
        else
            System.out.println("Invalid English Grade!");
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public double getScienceGrade() {
        return scienceGrade;
    }

    public double getEnglishGrade() {
        return englishGrade;
    }

    // Average
    public double getAverageGrade() {
        return (mathGrade + scienceGrade + englishGrade) / 3;
    }

    // Letter Grade
    public String getLetterGrade() {
        double avg = getAverageGrade();

        if (avg >= 90) return "A";
        else if (avg >= 80) return "B";
        else if (avg >= 70) return "C";
        else if (avg >= 60) return "D";
        else return "F";
    }
}

// Main class
public class StudentGradeTest {

    public static void main(String[] args) {

        Student s = new Student("Rahul", 101);

        s.setMathGrade(85);
        s.setScienceGrade(92);
        s.setEnglishGrade(78);

        System.out.println("Average Grade: " + s.getAverageGrade());
        System.out.println("Letter Grade: " + s.getLetterGrade());
    }
}