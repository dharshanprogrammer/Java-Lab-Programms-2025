package set7;

import java.util.Scanner;

abstract class Department {
    int Department_ID;
    String Department_Name;

    Department(int department_ID, String department_Name) {
        this.Department_ID = department_ID;
        this.Department_Name = department_Name;
    }
}

class EmployeePayRoll extends Department {
    int Employee_ID;
    String Employee_Name;
    int Basic_Salary;
    final String companyName = "Google";

    EmployeePayRoll(int department_ID, String department_Name,
                    int employee_ID, String employee_Name, int basic_Salary) {
        super(department_ID, department_Name);
        this.Employee_ID = employee_ID;
        this.Employee_Name = employee_Name;
        this.Basic_Salary = basic_Salary;
    }

    void display() {
        System.out.println(Department_ID + " " + Department_Name + " " +
                Employee_ID + " " + Employee_Name + " " +
                Basic_Salary + " " + companyName);
    }
}

class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter The Number Of Employees: ");
        int n = s.nextInt();

        EmployeePayRoll[] e = new EmployeePayRoll[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter Employee " + (i + 1) + " Details");

            System.out.print("Enter Department Id: ");
            int deptId = s.nextInt();
            s.nextLine();

            System.out.print("Enter Department Name: ");
            String deptName = s.nextLine();

            System.out.print("Enter Employee Id: ");
            int empId = s.nextInt();
            s.nextLine();

            System.out.print("Enter Employee Name: ");
            String empName = s.nextLine();

            System.out.print("Enter Basic Salary: ");
            int basicSalary = s.nextInt();

            e[i] = new EmployeePayRoll(deptId, deptName, empId, empName, basicSalary);
        }

        System.out.println("\nEmployee Details:");
        for (int i = 0; i < n; i++) {
            e[i].display();
        }
    }
}