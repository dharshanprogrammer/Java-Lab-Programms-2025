package set6;

import java.util.Scanner;

abstract class vehicle {
    int ratePerDay;
    String vehicleNumber;
    vehicle(int ratePerDay, String vehicleNumber){
        this.vehicleNumber = vehicleNumber;
        this.ratePerDay = ratePerDay;
    }
    abstract double CalculateRent(int days);
}
class Car extends vehicle{
    Car(int ratePerDay, String vehicleNumber) {
        super(ratePerDay, vehicleNumber);
    }

    @Override
    double CalculateRent(int days) {
        return (days*ratePerDay)+500;
    }
}

class Truck extends vehicle{
    Truck(int ratePerDay, String vehicleNumber) {
        super(ratePerDay, vehicleNumber);
    }

    @Override
    double CalculateRent(int days) {
        return (days*ratePerDay) + 100;
    }
}

class Bike extends vehicle{
    Bike(int ratePerDay, String vehicleNumber) {
        super(ratePerDay, vehicleNumber);
    }

    @Override
    double CalculateRent(int days) {
        return (days*ratePerDay);
    }
}

class VehicleDemo{
    static void main(String[] args) {
        int daysCar,daysBike,daysTruck;
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter The No of Days for car"+"\nEnter The No of Days for Bike"+"\nNo of days for Truck");
        daysCar = s.nextInt();
        daysBike = s.nextInt();
        daysTruck = s.nextInt();
        vehicle v;
        v = new Car(500,"1234");
        System.out.print("\nRent For The Car = "+v.CalculateRent(daysCar));
        v = new Bike(300,"1235");
        System.out.print("\nRent For The Bike = "+v.CalculateRent(daysBike));
        v = new Truck(1000,"4577");
        System.out.print("\nRent For The Truck = "+v.CalculateRent(daysTruck));

    }
}