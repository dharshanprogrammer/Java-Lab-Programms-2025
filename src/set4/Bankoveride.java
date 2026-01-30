package set4;


class Bankoverride {


    double calculateSI(double principal, double time) {
        return 0;
    }
}


class BankA extends Bankoverride {


    @Override
    double calculateSI(double principal, double time) {
        return (principal * time * 10) / 100;
    }
}


class BankB extends Bankoverride {


    @Override
    double calculateSI(double principal, double time) {
        return (principal * time * 9) / 100;
    }
}


class BankC extends Bankoverride {


    @Override
    double calculateSI(double principal, double time) {
        return (principal * time * 7) / 100;
    }
}


class BankDemo {
    public static void main(String[] args) {

        Bankoverride bank;

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
