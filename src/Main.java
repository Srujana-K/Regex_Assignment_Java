import  java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        Pattern pat = Pattern.compile("^\\p{Lu}.*\\.$");
        System.out.println("Enter the sentence");
        String sentence = sc.nextLine();
        Matcher match = pat.matcher(sentence);
        if(match.find())
            System.out.println("sentence matched with the format");
        else
            System.out.println("sentence not matched with the format");
    }
}
