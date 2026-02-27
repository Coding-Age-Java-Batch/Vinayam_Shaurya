class Bank {
    int getInterestRate() {
        return 0;
    }
}

class SBI extends Bank {
    int getInterestRate() {
        return 5;
    }
}

class HDFC extends Bank {
    int getInterestRate() {
        return 6;
    }
}

class ICICI extends Bank {
    int getInterestRate() {
        return 7;
    }
}

public class BankInterest {
    public static void main(String[] args) {

        SBI s = new SBI();
        HDFC h = new HDFC();
        ICICI i = new ICICI();

        System.out.println("SBI Interest Rate: " + s.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + h.getInterestRate() + "%");
        System.out.println("ICICI Interest Rate: " + i.getInterestRate() + "%");
    }
}