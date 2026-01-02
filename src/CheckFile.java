import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CheckFile {

    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.print("\nEnter The FileName");
            String filename = s.nextLine();
            FileReader fl = new FileReader(filename);

            BufferedReader br = new BufferedReader(fl);
            int characters=0 , lines=0,words=0;
            String line = "";
            while((line = br.readLine())!=null){
                characters+=line.length();
                lines+=1;
                String[] wordArray = line.trim().split("\\s+");
                if(!line.trim().isEmpty()){
                    words +=wordArray.length;
                }


            }
            System.out.print("\nNumber of Characters "+characters+"\nNumber Of Lines"+lines+"\nNumber of Words"+words);

        }
        catch(IOException o){
            System.out.print("\nError In Reading File");
        }
    }
}
