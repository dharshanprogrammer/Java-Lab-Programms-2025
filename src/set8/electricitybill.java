package set8;

import java.sql.SQLData;
import java.util.Scanner;

class invalidMonthException extends Exception{
    public invalidMonthException(String message){
        super(message);

    }
}
class NegativeunitsException extends Exception{
    public NegativeunitsException(String message){
        super(message);
    }
}
public class electricitybill {



    static void main(String[] args) {
        int n;
        int[] units;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Number of Months");
        String Months = s.nextLine().trim();
        n=0;
        try{
            n = Integer.parseInt(Months);
            if(n<=0){
                throw new invalidMonthException(
                        "It is Invalid Month Negative / Zero"
                );

            }
        }
        catch (NumberFormatException e){
            System.out.println("Error : " + e.getMessage());
            s.close();
            return;
        }
        catch (invalidMonthException e) {
            System.out.println("Error" + e.getMessage());
            s.close();
            return;
        }


    }
}
