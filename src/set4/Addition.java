package set4;

class Addition {


    int add(int a, int b) {
        return a + b;
    }


    int add(int a, int b, int c) {
        return a + b + c;
    }


    float add(int a, float b) {
        return a + b;
    }
}

class AdditionDemo {
    public static void main(String[] args) {

        Addition obj = new Addition();

        int sum1 = obj.add(10, 20);
        int sum2 = obj.add(5, 10, 15);
        float sum3 = obj.add(10, 5.5f);

        System.out.println("set4.Addition of two integers = " + sum1);
        System.out.println("set4.Addition of three integers = " + sum2);
        System.out.println("set4.Addition of integer and float = " + sum3);
    }
}
