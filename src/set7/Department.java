package set7;

import java.util.Scanner;

abstract class Department {
    int Department_ID;
    String Department_Name;
    Department(int department_ID,String department_Name){
        this.Department_ID = department_ID;
        this.Department_Name = department_Name;

    }
}
class EmployeePayRoll extends Department{
    int Employee_ID;
    String Employee_Name;
    int Basic_Salary;
    final String companyName = "Google";

    EmployeePayRoll(int department_ID, String department_Name,int Employee_Id,String Employee_Name,int Basic_Salary) {
        super(department_ID, department_Name);
        this.Employee_ID = Employee_Id;
        this.Basic_Salary = Basic_Salary;
        this.Employee_Name = Employee_Name;
    }

}
class Main{
    static void main(String[] args) {

        int n=0;
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter The Number Of Emplyees");
        n = s.nextInt();
        EmployeePayRoll[] e = new EmployeePayRoll[n];
        for(int i=0;i<n;i++){
            System.out.print("\nEnter The Employee"+(i+1)+"Details");
            int tempD,employeeInd,BasicSalary;
            String departmentName,EmployeeName;
            System.out.print("\nEnter Department Id");
            tempD = s.nextInt();
            System.out.print("\nEnter Deparment Name");
            departmentName = s.nextLine();
            System.out.print("\nEnter Employee Id");
            employeeInd = s.nextInt();
            System.out.print("\nEnter EmployeeName");
            EmployeeName = s.nextLine();
            System.
        }
    }

}