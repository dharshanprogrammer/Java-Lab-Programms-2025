package set8;

import java.util.Scanner;

class invalidAgeException extends Exception{
    public invalidAgeException(String Message){
        super(Message);
    }
}
class invalidNameException extends Exception{
    public invalidNameException(String Message){
        super(Message);
    }
}
class invalidCompanyException extends Exception{
    public invalidCompanyException(String Message){
        super(Message);
    }
}
public class Employee {
    String employeeName;
    int employeeAge;
    String company;
    Employee(String employeeName,int   employeeAge,String company){
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.company = company;
    }
    private void display(){
        System.out.println(
                "\nName Of The Employee "+this.employeeName+"\nAge of The Employee"
                        +this.employeeAge+"\nCompany Name"+this.company);
    }

    public static void main()  {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter The Number Of Employees");
        int n = s.nextInt();
        s.nextLine();
        Employee[] e = new Employee[n];
        for(int i=0;i<n;i++) {
            System.out.print("\nEnter The Employee Name");
            String tempName = s.nextLine();

            System.out.print("\nEnter The Age Of The Employee");
            String tempAge = s.nextLine();
            System.out.print("\nEnter The Name Of The Company");
            String tempCompany = s.nextLine();
            try{
                if(!tempName.matches("[a-zA-Z]+")){
                    throw new invalidNameException("inValid Contains Unknown Characters");

                }
                if(!tempAge.matches("[0-9]+")){
                    throw new invalidAgeException("Enter A Valid Age");

                }
                if(!tempCompany.matches("[a-zA-z]+")){
                    throw new invalidCompanyException("Enter Valid Company");
                }
            }
            catch (invalidNameException exception){
                System.out.println("Error "+exception.getMessage());
                return;
            }
            catch (invalidAgeException | invalidCompanyException exception){
                System.out.println("Error : "+exception.getMessage());
                return;
            }
            int Age = Integer.parseInt(tempAge);
            e[i] = new Employee(tempName,Age,tempCompany);

        }
        for(int op=0;op<n;op++){
            e[op].display();
        }



    }
}
