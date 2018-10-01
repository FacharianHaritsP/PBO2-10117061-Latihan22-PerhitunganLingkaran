/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan22.perhitunganlingkaran;

import java.util.Scanner;

/**
 *Nama              :Fachrian Harits Pratama
 *NIM               :10117061  
 *kelas             :if2
 *Deskripsi program :menampilkan jari-jari,luas dan keliling lingkaran
 */
public class PBO210117061Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nilai;
        double nilai2, j;

        Scanner masuk = new Scanner(System.in);
        System.out.println("====Perhitungan Lingkaran===");
        do {
            System.out.print("Masukkan Nilai diameter lingkaran\t:");
            nilai = masuk.next();
        } while (!nilai.matches("[0-9]*"));

        nilai2 = Double.parseDouble(nilai);

        j = nilai2 / 2;
        System.out.println("jari jari\t: " + j);

        System.out.println("Luas lingkaran\t: " + Math.PI * j * j);

        System.out.println("keliling lingkaran\t: " + 2 * Math.PI * j);
    }

}
