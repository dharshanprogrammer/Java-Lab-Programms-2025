package set6;

import java.util.Scanner;

abstract  class ShopingApplication {
    int productId;
    String productName;
    int price;
    int quantity;
    ShopingApplication(int productId,String productName,int price,int quantity){
        this.price = price;
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
    }
    abstract int calCulateDiscount();

}

class Electronics extends ShopingApplication{
    Electronics(int productId,String productName,int price,int quantity){
        super(productId,productName,price,quantity);
    }

    @Override
    int calCulateDiscount() {
        int total = price*quantity;
        int discount = (total/100)*90;
        return discount;
        
    }


}
class Clothing extends ShopingApplication{
    Clothing(int productId,String productName,int price,int quantity){
        super(productId,productName,price,quantity);
    }

    @Override
    int calCulateDiscount() {
        int total = price*quantity;
        int discount = (total/100)*95;
        return discount;
    }

}
class Grocery extends ShopingApplication{
    Grocery(int productId, String productName, int price,int quantity){
        super(productId,productName,price,quantity);
    }

    @Override
    int calCulateDiscount() {
        int total = price*quantity;
        int discount = (total/100)*80;
        return discount;
    }
}
class Main{
    static void main(String[] args) {
//        int productId1;
//        String productName1;
//        int price1;
//        int quantity1;
//        int productId2;
//        String productName2;
//        int price2;
//        int quantity3;
//        int productId3;
//        String productName;
//        int price;
//        int quantity;
//        Scanner s = new Scanner(System.in);

        Electronics e = new Electronics(1,"Laptop",100000,1);
        System.out.println("Total Discount For Electronics"+e.calCulateDiscount());
        Grocery g = new Grocery(2,"Tea Powder",100,2);
        System.out.println("Total Discount For Grocery"+g.calCulateDiscount());
        Clothing c = new Clothing(3,"Shirt",7000,3);
        System.out.println("Total Discount For clothing"+c.calCulateDiscount());
    }
}