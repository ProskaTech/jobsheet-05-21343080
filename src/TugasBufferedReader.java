/*
 * Created by 21343080_Andi Sultan Al Ayyubi
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class TugasBufferedReader {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        String word1 = "", word2 = "", word3 = "";

        try{
            System.out.print("Enter word 1 : ");
            word1 = dataIn.readLine();
            System.out.print("Enter word 2 : ");
            word2 = dataIn.readLine();
            System.out.print("Enter word 3 : ");
            word3 = dataIn.readLine();
            
        }

        catch (IOException e){
            System.out.println("gagal membaca keyboard");
        }

        System.out.println(word1+" "+word2+" "+word3);
    }
}
