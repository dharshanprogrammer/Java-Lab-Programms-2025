import java.util.Scanner;

public class Number {
    int number;
    Number(int number){
        this.number = number;

    }
    public boolean isZero(){
        if(this.number==0) return true;
        return false;
    }
    public boolean isPositive(){
        if(this.number>0) return true;
        return false;
    }
    public boolean isNegative(){
        if(this.number<0) return true;
        return false;
    }
    public boolean isOdd(){
        if((this.number%2)!=0) return true;
        return false;
    }
    public boolean isEven(){
        if((this.number%2)==0) return true;
        return false;
    }
    public boolean isPrime(){
        if(this.number<0 || this.number ==2 ) return false;
        for(int i=2;i<number;i++)
        {
            if(this.number%i == 0) {
                return false;
            }
        }
        return true;
    }
    public boolean isArmStrong(){
        int temp=this.number;
        int digits=0;
        while (temp>0){
            digits++;
            temp = temp/10;

        }
        temp = number;
        int tempNumber = 0;
        while(temp>0){
            double temp2 = (temp%10);
            temp = temp/10;
            tempNumber+=Math.pow(temp2,digits);

        }
        if(tempNumber==number) return true;
        return false;
    }
    public int getFactorial(){
        int temp=1;
        for(int i=2;i<=number;i++){
            temp*=i;
        }
        return temp;
    }
    public int getSquare(){
        return (number*number);
    }
    public int SumofDigits(){
        int temp = number;
        int sumofdigit = 0;
        while(temp>0){
            sumofdigit+=(temp%10);
            temp = temp/10;
        }
        return sumofdigit;
    }
    public int Reverse(){
        int reversed = 0;
        int temp =  number;
        while(temp>0){
            reversed = reversed*10;
            reversed +=(temp%10);
            temp/=10;
        }
        return reversed;
    }
    public double getSqrt(){
        return (Math.sqrt(number));
    }

    public  static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter the Number");
        int num = s.nextInt();
        Number n = new Number(num);

        boolean decision = true;
        while (decision){
            System.out.print("\n1. isZero() " +"\n 2.isPositive()"+"\n3.isNegative()"+"\n4.isOdd()"+"\n5.isEven()"+"\n6.isPrime()"+"\n7.isArmstrong()"+"\n8.getfactorial"+"\n9.getSquare()"+"\n10.getSqart()"+"\n11.Reverse()"+"\n12.Sumofdigts");
            int decision1 = s.nextInt();
            switch(decision1){
                case 1->{
                    System.out.println(n.isZero()?"Zero":"Not Zero");

                }
                case 2->{
                    System.out.println(n.isPositive()?"Positive":"Not Positive");

                }
                case 3->{
                    System.out.println(n.isNegative()?"Negative":"Not Negative");
                }
                case 4->{
                    System.out.println(n.isOdd()?"Odd : "+n.number:"Not Odd"+n.number);
                }
                case 5->{
                    System.out.println(n.isEven()?"Even Number"+n.number:"Not Even Number"+n.number);

                }
                case 6-> {
                    System.out.println(n.isPrime() ? "Prime " + n.number:"Not Prime"+n.number);
                }
                case 7->{
                    System.out.println(n.isArmStrong()?"ArmStrong Number"+n.number:"Not Armstrong "+n.number);

                }
                case 8->{
                    System.out.println(n.getFactorial());
                }
                case 9->{
                    System.out.println(n.getSquare());

                }
                case 10->{
                    System.out.println(n.getSqrt());
                }
                case 11->{
                    System.out.println(n.Reverse());
                }
                case 12->{
                    System.out.print(n.SumofDigits());
                }
                default ->{
                    decision = false;
                }
            }
        }
    }

}
