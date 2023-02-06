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
            if (endindx==-1){
                endindx = sentence.length();
            }
            String word = sentence.substring(startindx,endindx);
            System.out.println(word);
        }
        scanner.close();
    }
}
