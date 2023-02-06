// BUG: I couldn't test this code with my file input. I think it's because you made 2 Scanners. I don't think you ever need 2 scanners (you can and should use the original one to simply get more input). Please change this to only use one scanner, and make sure you can use it with files as input (LMK if you need help doing this from the terminal)
import java.util.Scanner;

public class FindTagContents {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("enter html: ");
        String html = a.nextLine();
        System.out.println("enter tag: ");
        String letter = a.nextLine();
        int indx1 = html.indexOf("<"+letter);
        if (indx1 == -1){
            System.out.println(" there are no '"+letter+"' tags in the entered HTML");
        }else{
            indx1 = indx1+2+letter.length();
            int indx2 = html.indexOf("</"+letter);
            String word = html.substring(indx1, indx2);
            System.out.println(word);
        }
        a.close();
    }
}