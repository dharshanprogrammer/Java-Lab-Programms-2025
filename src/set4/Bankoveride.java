package set4;

// Base class
class Bankoverride {

    // Method to calculate simple interest
    double calculateSI(double principal, double time) {
        return 0; // To be overridden
    }
}

// Derived class set4.BankA
class BankA extends Bankoverride {

    // Interest rate = 10%
    @Override
    double calculateSI(double principal, double time) {
        return (principal * time * 10) / 100;
    }
}

// Derived class set4.BankB
class BankB extends Bankoverride {

    // Interest rate = 9%
    @Override
    double calculateSI(double principal, double time) {
        return (principal * time * 9) / 100;
    }
}

// Derived class set4.BankC
class BankC extends Bankoverride {

    // Interest rate = 7%
    @Override
    double calculateSI(double principal, double time) {
        return (principal * time * 7) / 100;
    }
}

// Main class
class BankDemo {
    public static void main(String[] args) {

        Bankoverride bank;   // Base class reference

        double principal = 10000;
        double time = 2; // years

        bank = new BankA();
        System.out.println("Simple Interest from set1.Bank A = ₹" +
                bank.calculateSI(principal, time));

        bank = new BankB();
        System.out.println("Simple Interest from set1.Bank B = ₹" +
                bank.calculateSI(principal, time));

        bank = new BankC();
        System.out.println("Simple Interest from set1.Bank C = ₹" +
                bank.calculateSI(principal, time));
    }
}
