import java.util.Scanner;

public class Number {
    double number;
    Number(double number){
        this.number = number;

    }
    public boolean isZero(){
        if(number==0) return true;
        return false;
    }
    public boolean isPositive(){
        if(number>0) return true;
        return false;
    }
    public boolean isNegative(){
        if(number<0) return true;
        return false;
    }
    public boolean isOdd(){
        if((number%2)!=0) return true;
        return false;
    }
    public boolean isEven(){
        if((number%2)==0) return true;
        return false;
    }
    public boolean isPrime(){
        if(number<0 || number ==2 ) return false;
        for(int i=2;i<number;i++)
        {
            if(number%i == 0) {
                return false;
            }
        }
        return true;
    }
    public boolean isArmStrong(){
        double temp=number;
        int digits=0;
        while (temp>0){
            digits++;
            temp = temp/10;

        }
        temp = number;
        double tempNumber = 0;
        while(temp>0){
            double temp2 = (temp%10);
            temp = temp/10;
            tempNumber+=Math.pow(temp2,digits);

        }
        if(tempNumber==number) return true;
        return false;
    }
    public double getFactorial(){
        double temp=1;
        for(int i=2;i<=number;i++){
            temp*=i;
        }
        return temp;
    }
    public double getSquare(){
        return (number*number);
    }
    public double SumofDigits(){
        double temp = number;
        double sumofdigit = 0;
        while(temp>0){
            sumofdigit+=(temp%10);
            temp = temp/10;
        }
        return sumofdigit;
    }
    public double Reverse(){
        double reversed = 0;
        double temp =  number;
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

    public  void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter Number");
        double number = s.nextDouble();
        boolean decision = true;
        while (decision){
            System.out.print("\n1. isZero() " +"\n isPositive()"+"\nisNegative()"+"\n");
        }
    }





}
