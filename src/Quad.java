import java.util.Scanner;

public class Quad {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter a "+"\nEnter B"+"\nEnter C");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int result = (b*b - 4 *a*c);
        if(result<0) {
                System.out.println("\nThere Is no Solution");

        }else if(result==0){
            double root = (-b+Math.sqrt(result))/(2*a);
            System.out.println("\nThere is One Real Solution");
        }
        else {
            double root1 = (-b+Math.sqrt(result))/(2*a);
            double root2 = (-b-Math.sqrt(result))/(2*a);

            System.out.println("There are Two Real Solutions "+"root1: = "+root1+"\nroot 2 :"+root2);
        }
    }
}
