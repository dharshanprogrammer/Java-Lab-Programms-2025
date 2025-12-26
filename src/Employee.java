import java.util.Scanner;

public class Employee {
    float salary;
    String name;
    int employee_id;

    Employee(float salary, String name, int employee_id) {
        this.salary = salary;
        this.name = name;
        this.employee_id = employee_id;
    }
    public void display(){
        System.out.println("\nName :" + name + "\nSalary : "+salary +"\nemployee_id"+employee_id);
    }

    static void main() {
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter The Salary");
        float salary = s.nextFloat();
        System.out.print("\nEnter The Name :");
        String name = s.next();
        System.out.print("\nEnter The employee_id");
        int employee_id = s.nextInt();
        Employee e = new Employee(salary,name,employee_id);
        e.display();
    }
}
