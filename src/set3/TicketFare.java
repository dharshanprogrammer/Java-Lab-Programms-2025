package set3;

import java.util.Scanner;

class TicketFare {


    double calculateFare(double baseFare) {
        return baseFare;
    }


    double calculateFare(double baseFare, String child) {
        return baseFare * 0.5;
    }


    double calculateFare(double baseFare, int age) {
        return baseFare * 0.7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicketFare tb = new TicketFare();

        double baseFare = 1000;

        System.out.println("Select Passenger Type:");
        System.out.println("1. Adult");
        System.out.println("2. Child");
        System.out.println("3. Senior Citizen");

        int choice = sc.nextInt();
        double fare = 0;

        switch (choice) {
            case 1->{
                fare = tb.calculateFare(baseFare);
            }


            case 2->{
                fare = tb.calculateFare(baseFare, "child");
            }


            case 3->{
                fare = tb.calculateFare(baseFare, 60);
            }


            default->{
                System.out.println("Invalid choice");
                System.exit(0);
            }
        }

        System.out.println("Ticket Fare = ₹" + fare);
        sc.close();
    }
}
