/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;
import java.util.Scanner;
/**
 *
 * @author Yoga Andrian
 */
public class Latihan_4 {
    public static void main(String[] args) {
        Scanner sl = new Scanner(System.in);

        System.out.print("Masukkan nilai 1 = ");
        int nilai1 = sl.nextInt();
        System.out.print("Masukkan nilai 2 = ");
        int nilai2 = sl.nextInt();

        int jumlah = nilai1 + nilai2;
        System.out.println("Jumlah = " + jumlah);
    }
}
