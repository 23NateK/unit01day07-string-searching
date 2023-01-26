import java.util.Scanner;

public class FindTagContents {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("enter html: ");
        String html = a.nextLine();
        Scanner b = new Scanner(System.in);
        System.out.println("enter tag: ");
        String letter = b.nextLine();
        int indx1 = html.indexOf("<"+letter);
        if (indx1 == -1){
            System.out.println(" there are no '"+letter+"' tags in the entered HTML");
        }else{
            indx1 = indx1+2+letter.length();
            int indx2 = html.indexOf("</"+letter);
            String word = html.substring(indx1, indx2);
            System.out.println(word);
        }

    }
}