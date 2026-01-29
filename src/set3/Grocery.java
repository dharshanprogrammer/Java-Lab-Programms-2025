package set3;

import java.util.Scanner;

class Grocery {
    String itemName;
    double price;

    // Constructor
    Grocery(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    // Calculate total price with quantity
    double calculateTotal(int quantity) {
        return price * quantity;
    }

    // Calculate total price with quantity and discount
    double calculateTotal(int quantity, double discountPercent) {
        double total = price * quantity;
        return total - (total * discountPercent / 100);
    }
}

class GroceryBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter item name: ");
        String name = sc.nextLine();

        System.out.print("Enter price per item: ");
        double price = sc.nextDouble();

        Grocery item = new Grocery(name, price);

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        System.out.print("Enter discount percentage (0 if none): ");
        double discount = sc.nextDouble();

        double total;

        if (discount > 0) {
            total = item.calculateTotal(qty, discount);
        } else {
            total = item.calculateTotal(qty);
        }

        System.out.println("\nItem: " + name);
        System.out.println("Total Bill Amount = ₹" + total);

        sc.close();
    }
}
