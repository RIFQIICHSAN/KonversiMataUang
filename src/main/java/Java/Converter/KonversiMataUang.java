/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java.Converter;

/**
 *
 * @author Rifqi Ichsan A
 */
import java.util.Scanner;
public class KonversiMataUang {
public static void main(String[] args){    
Scanner sc = new Scanner (System.in);

        intro();
        System.out.println(" Selamat Datang di Aplikasi Konversi Mata Uang ");
        System.out.println(" --------------------------------------------- ");
        System.out.println(" 1. Dollar to Rupiah ");
        System.out.println(" 2. Rupiah to Dollar ");
        System.out.println(" 3. Ringgit to Rupiah ");
        System.out.println(" 4. Rupiah to Ringgit ");
        int pilihan = sc.nextInt();
        if (pilihan == 1){
                TukarDollarKeRupiah();
    }else {
            TukarRupiahKeDollar();
        }
         }
    public static void TukarDollarKeRupiah() {
        Scanner sc = new Scanner(System.in);
        batas();
        System.out.println(" Masukkan Nilai Dollar ");
            double dollar = sc.nextDouble();
            double hasil = dollar * 14500;
            System.out.println(" Hasil Tukar Rupiah = " + hasil);
            }
    public static void TukarRupiahKeDollar(){
        Scanner sc = new Scanner(System.in);
        batas();
        System.out.println(" Masukkan Nilai Rupiah ");
            double rupiah = sc.nextDouble();
            double hasil = rupiah / 14500;
            System.out.println(" Hasil Tukat Dollar = " + hasil);
            }

    private static void batas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void intro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        }
