interface RemoteControl {
    void pressButton(int code);
}

// TV Remote class
class TVRemote implements RemoteControl {

    public void pressButton(int code) {
        if (code == 1) {
            System.out.println("TV: Power ON");
        } else if (code == 2) {
            System.out.println("TV: Volume UP");
        } else {
            System.out.println("TV: Invalid Button");
        }
    }
}

// AC Remote class
class ACRemote implements RemoteControl {

    public void pressButton(int code) {
        if (code == 1) {
            System.out.println("AC: Power ON");
        } else if (code == 2) {
            System.out.println("AC: Temperature DOWN");
        } else {
            System.out.println("AC: Invalid Button");
        }
    }
}

// Main Class
public class RemoteTest {

    public static void main(String[] args) {

        RemoteControl tv = new TVRemote();
        RemoteControl ac = new ACRemote();

        System.out.println("TV Remote:");
        tv.pressButton(1);
        tv.pressButton(2);

        System.out.println();

        System.out.println("AC Remote:");
        ac.pressButton(1);
        ac.pressButton(2);
    }
}