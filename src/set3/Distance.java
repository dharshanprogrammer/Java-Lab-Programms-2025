package set3;

import java.util.Scanner;

class RanchiDistance {


    static int binarySearch(String[] cities, String key) {
        int low = 0;
        int high = cities.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = key.compareToIgnoreCase(cities[mid]);

            if (cmp == 0)
                return mid;
            else if (cmp > 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String[] cities = {
                "Bangalore",
                "Chennai",
                "Delhi",
                "Hyderabad",
                "Kolkata",
                "Mumbai"
        };


        int[] distance = {
                1700, // Bangalore
                1600, // Chennai
                1300, // Delhi
                1400, // Hyderabad
                400,  // Kolkata
                1800  // Mumbai
        };

        System.out.print("Enter city name: ");
        String city = sc.nextLine();

        int index = binarySearch(cities, city);

        if (index != -1) {
            System.out.println("Distance from Ranchi to " + cities[index] +
                    " is " + distance[index] + " km");
        } else {
            System.out.println("City not found in the list");
        }

        sc.close();
    }
}
