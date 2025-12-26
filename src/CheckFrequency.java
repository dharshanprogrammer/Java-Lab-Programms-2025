import java.util.Scanner;

public class CheckFrequency {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter The String :");
        String st = s.nextLine();

        System.out.print("\nEnter The Character You Want To Check The Frequency");

        char character = s.next().charAt(0);
        int count = 0;
        for(int i=0;i<st.length();i++){
            if(character==st.charAt(i)){
                count++;
            }
        }
        System.out.print("\nFrequency Of The Character : "+character+"In The String = "+count+" Times");
    }
}
