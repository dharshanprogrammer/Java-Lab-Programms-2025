import java.util.Scanner;

public class Bank {
    int account_number;
    String name;
    float balance;
    Bank(int account_number,String name){
        this.account_number = account_number;
        this.name = name;
        this.balance = 0;
    }
    public void withdraw(float withdraw_amount){
        if(withdraw_amount>balance){
            System.out.print("\niSufficiant Balance in account");

        }
        balance-=withdraw_amount;
        System.out.println("Withdrawed Amount : " +withdraw_amount );
        display();

    }
    public void credit(float creditAmount){
        balance+=creditAmount;
        display();
    }
    public void  display(){
        System.out.print("\n Account Number : " + account_number +"\n Holder Name "+ name+"\nBalance"+balance);

    }

    static void main() {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter The Name :");
        String name = s.next();
        System.out.print("\nEnter The  account_Number : ");
        int account_number = s.nextInt();
        Bank b = new Bank(account_number,name);
        boolean decision1=true;
        while(decision1){
            System.out.print("\nEnter 1 for credit : " + "\nEnter 2 for withdraw " +"\nEnter 3 for Account Details");
            int decision2 = s.nextInt();

            switch (decision2)
            {
                case 1 ->{
                    System.out.print("\nEnter Credit Ammount : ");

                    float credit = s.nextFloat();
                    b.credit(credit);
                }
                case 2->{
                    System.out.print("\nEnter WithDraw Amount :");
                    float withdraw = s.nextFloat();
                    b.withdraw(withdraw);

                }
                case 3->{
                    b.display();
                }
                default -> {
                    decision1 = false;
                }
            }
        }


    }
}
