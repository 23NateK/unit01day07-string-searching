// BUG: searching for "d" in "the quick brown fox jumped" caused the following output:
/* 
 * Exception in thread "main" java.lang.StringIndexOutOfBoundsException: begin 20, end -1, length 26
        at java.base/java.lang.String.checkBoundsBeginEnd(String.java:3319)
        at java.base/java.lang.String.substring(String.java:1874)
        at FindWord.main(FindWord.java:17)
 */
import java.util.Scanner;
public class FindWord {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("Enter letter: ");
        String letter = scanner.nextLine();
        int Lindx = sentence.indexOf(letter);
        if (Lindx == -1){
            System.out.println("letter not in sentence, big L");
        }else{
            int startindx = sentence.lastIndexOf(" ", Lindx)+1;
            int endindx = sentence.indexOf(" ", Lindx);
            String word = sentence.substring(startindx,endindx);
            System.out.println(word);
        }
        scanner.close();
    }
}
