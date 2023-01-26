import java.util.Scanner;
public class FindWord {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("Enter letter: ");
        String letter = scanner.nextLine();
        int Lindx = sentence.indexOf(letter);
        int startindx = sentence.lastIndexOf(" ", Lindx)+1;
        int endindx = sentence.indexOf(" ", Lindx);
        String word = sentence.substring(startindx,endindx);
        System.out.println(word);




        scanner.close();
    }
}
