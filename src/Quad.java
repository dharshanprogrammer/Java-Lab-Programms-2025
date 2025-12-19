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
            System.out.println("\nThere is One Real Solution");
        }
        else {
            System.out.println("There are Real Solutions");
        }
    }
}
