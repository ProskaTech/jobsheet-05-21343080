/*
 * Created by 21343080_Andi Sultan Al Ayyubi
 */

import java.util.Scanner;

public class TugasScanner {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Word 1 : ");
        String word1 = in.nextLine();

        System.out.print("Enter Word 2 : ");
        String word2 = in.nextLine();

        System.out.print("Enter Word 3 : ");
        String word3 = in.nextLine();

        System.out.println(word1+" " + word2+" " +word3);

    }
}
