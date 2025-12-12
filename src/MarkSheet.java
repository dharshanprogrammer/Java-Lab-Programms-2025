import java.util.Scanner;

public class MarkSheet {
    int tamil,english,maths,science,social_science,rollno;
    String studentName;
    MarkSheet(String studentName,int rollno, int tamil,int english,int maths,int science,int social_science){
        this.studentName = studentName;
        this.rollno =  rollno;
        this.tamil = tamil;
        this.english = english;
        this.maths = maths;
        this.science = science;
        this.social_science = social_science;

    }
    public void displayMarkSheet(){
        int total = tamil+english+maths+science+social_science;
        int average = total/5;
        System.out.print("\nStudent Name : "+studentName+"\nRoll No : " + rollno+"\nEnglish:"+english+"\nMaths : "+maths+"\nScience :" + science +"\nSocial _Science "+social_science+"\nAverage : "+average + "\nTotal Marks : " +total);

    }

    static void main() {

        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter Number Of Students :");
        int n = s.nextInt();
        MarkSheet members[] =  new MarkSheet[n];
        for(int i =0;i<n;i++){
            System.out.print("\n  Enter Student Name "+"\n  Enter Roll No" +"\nEnter Tamil Mark"+ "\n Enter English:"+"\nEnter Maths : "+" \nEnter Science :"  +" \n Enter Social _Science ");
             String Studentname = s.next();
             int rollono = s.nextInt();
             int tamil = s.nextInt();
             int english=s.nextInt();
             int maths=s.nextInt();
             int science = s.nextInt();
             int social_science = s.nextInt();
             members[i] = new MarkSheet(Studentname,rollono,tamil,english,maths,science,social_science);
             members[i].displayMarkSheet();


        }

    }
}
