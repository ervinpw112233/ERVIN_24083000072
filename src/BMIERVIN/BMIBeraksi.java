/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMIERVIN;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class BMIBeraksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input
        System.out.print("Berat badan (kg): ");
        double berat = scanner.nextDouble();
        System.out.print("Tinggi badan (cm): ");
        double tinggi = scanner.nextDouble();

        //Objek
        BMIErvin bmi = new BMIErvin(berat, tinggi);

        //Hasil
        System.out.println("BMI Anda adalah : " + bmi.hasilBMI());
        System.out.println("Kategori Anda adalah : " + bmi.kategoriBMI());

        scanner.close();
    }
}