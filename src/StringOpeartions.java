import java.util.Locale;
import java.util.Scanner;

public class StringOpeartions {
    static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("\nEnter The String");

        String st = s.next();

        System.out.print("\nUpper Case : " +st.toUpperCase(Locale.ROOT));
        System.out.print("\nLower Case : "+st.toLowerCase(Locale.ROOT));

        System.out.print("\nLength Of The String :"+st.length());

        System.out.print("\nSubstring from 1 to 5 th index : "+st.substring(0,6));
        System.out.print("\nContains Java Word In String :"+st.contains("Java"));
        System.out.print("\nEnter The String For String Buffer Datatype");

        StringBuffer sb = new StringBuffer(s.next());

        System.out.print("\nAppending Java The Goat To String Buffer"+sb.append("Java The Goat"));
        System.out.print("\nCapacity Of The String Buffer Variable"+sb.capacity());
        System.out.println("\nAfter Inserting Leo in 5th  Index : "+sb.insert(5,"Leo "));
        System.out.print("\nReversing The variable :"+sb.reverse());

        System.out.print("\nDeleting 1 to 5 index Characters :"+sb.delete(0,5));

        StringBuilder sbuilder = new StringBuilder(s.next());
        System.out.print("\nAppending Java :" + sbuilder.append("Java Goat"));
        System.out.print("\nDeleting Characters 0 to 5 index :"+sbuilder.delete(0,5));
        System.out.print("\nInserting Dharshan Programmer At 5 th Index :"+sbuilder.insert(5,"Dharshan Programmer"));
        System.out.print("\nReversing The String Builder :" +sbuilder.reverse());


    }
}
