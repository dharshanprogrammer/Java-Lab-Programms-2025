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



    public static void main(String[] args) {
        int n;

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
        int[] units = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter The Unit For Month"+(i+1));
            String unitinString = s.nextLine().trim();
            try{
                int unit = Integer.parseInt(unitinString);
                if(unit<0){
                    System.out.println("Unit Cannot Be Negative Value");
                    throw  new NegativeunitsException("Negative Value");

                }
                units[i] = unit;


            }
            catch (NumberFormatException e){
                System.out.println("Error "+ e.getMessage());
                units[i] = 0;

            }
            catch (NegativeunitsException e){
                System.out.println("Error : "+e.getMessage());
                units[i] = 0;
            }






        }
        long totalunits = 0;
        for(int u : units){
            totalunits+=u;
        }
        double average = (double) totalunits/n;
        System.out.println("\n=============Electricity Consumption ==========");
        System.out.print("\n--------------------------------------------------\n");
        System.out.printf("%-10s %-20s%n","Month","Units Consumed");
        for(int k = 0;k<n;k++){
            System.out.printf("%-10s %-10s%n",(k+1),units[k]);
        }
        System.out.println("\n-------------------------------------------------");
        System.out.println("\nTotal Units Consumed"+totalunits);
        System.out.printf("\nAverage Units %.2f Units/Month%n",average);
        System.out.println("==================================================");



    }
}
