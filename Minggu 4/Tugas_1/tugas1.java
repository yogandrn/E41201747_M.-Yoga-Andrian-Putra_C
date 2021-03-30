/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_1;
import java.util.Scanner;

/**
 *
 * @author Yoga Andrian
 */
public class tugas1 {
     public static void main(String[] args) {
        int awal, akhir;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan batas awal bilangan : ");
        awal = scan.nextInt();
        System.out.print("Masukkan batas akhir bilangan : ");
        akhir = scan.nextInt();
        System.out.print("\n");

        if (awal > akhir) {
            System.out.print("Batas awal bilangan tidak boleh lebih dari batas bilangan akhir !");
        } else if (awal % 2 == 1 & awal == akhir) {
            System.out.print("Tidak ada bilangan genap");
        } else {
            for (int i = awal; awal <= akhir; awal++) {
                if (awal % 2 == 0) {
                    System.out.print(awal + " ");
                }
            }
        }
        System.out.println("\n");
    }
}
