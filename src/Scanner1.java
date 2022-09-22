/*
 * Created by 21343080_Andi Sultan Al Ayyubi
 */

import java.util.Scanner;

public class Scanner1 {
    public static void main (String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Masukan nama lengkap : ");
            String nama = in.nextLine();

            System.out.print("Masukan NIM : ");
            int NIM = in.nextInt();

            System.out.print("Masukan nilai : ");
            float nilai = in.nextFloat();

            System.out.println(
                "\nNama : " + nama + "\nNIM : " + NIM + "\nNilai : " + nilai
            );
        }
    }
}
