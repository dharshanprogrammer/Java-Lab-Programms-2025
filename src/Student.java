import java.util.Scanner;
//First Program
class Student {
    String name;
    int rollno;
    public void intialize(int rollno,String name){
        this.name = name;
        this.rollno = rollno;

    }
    public void display(){
        System.out.println("Name" + name);
        System.out.println("RollNode :"+ rollno);
    }
    public static void main(String[] args) {
        int n;
        String name;
        int rollono;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number Of Students");
        n=s.nextInt();
        Student[] students = new Student[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter The Student Details(i+1)");
            System.out.print("/nEnter THe Name");
            String tempName = s.next();
            System.out.print("/nEnter The Rollno ");
            int tempRollno = s.nextInt();
            students[i] = new Student();
            students[i].intialize(tempRollno,tempName);
        }
        System.out.println("Students Details");
        for(int k = 0;k<n;k++)
        {
            students[k].display();
        }
    }
}
