import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        try{
            Scanner s = new Scanner(System.in);
            System.out.print("\nEnter The FileName");
            String filename = s.nextLine();
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String longestLengthWord="";
            String line="";
            while(( line= br.readLine())!=null){
                String[] wordArray  = line.trim().split("\\s+");
                if(!line.trim().isEmpty()){
                    for(int i=0;i<wordArray.length;i++){
                        if(wordArray[i].length()>longestLengthWord.length()){
                            longestLengthWord  = wordArray[i];
                        }
                    }
                }
            }
            System.out.print("\nLongest Word In The Paragraph "+longestLengthWord);
        }
        catch (IOException error){
            System.out.print("Error in Reading File");
        }

    }
}
