/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_2;

/**
 *
 * @author Yoga Andrian
 */
import java.util.Scanner;
import java.util.Random;

public class Tugas_2 {
    public static void main(String[] args) {
        int banyak = 0;
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Masukkan jumlah deret array : ");
        banyak = scan.nextInt();

        for (int i = 0; i <= banyak - 1; i++) {
            int[] acak = new int[banyak];
            acak[i] = random.nextInt(100);
            System.out.print(acak[i] + " ");
        }
        System.out.println("");
    }
}
