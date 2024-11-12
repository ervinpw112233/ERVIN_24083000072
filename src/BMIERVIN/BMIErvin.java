/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMIERVIN;

/**
 *
 * @author ASUS
 */
public class BMIErvin {
    private double berat;  // kg
    private double tinggi; // cm

    // Konstruktor
    public BMIErvin(double berat, double tinggi) {
        this.berat = berat;
        this.tinggi = tinggi;
    }

    // Setter (mutator)
    public void setBerat(double berat) {
        this.berat = berat;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    // Getter (accessor)
    public double getBerat() {
        return berat;
    }
    public double getTinggi() {
        return tinggi;
    }

    // Rumus menghitung BMI
    public double hitungBMI() {
        double konversi = tinggi / 100;
        return berat / (konversi * konversi);
    }

    // Mencari kategori BMI
    public String kategoriBMI() {
        double bmi = hitungBMI();
        if (bmi < 18.5) {
            return "Kurus";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Kelebihan Berat";
        } else {
            return "Obesitas";
        }
    }

    // Menampilkan hasil 2 angka di belakang koma
    public String hasilBMI() {
        return String.format("%.2f", hitungBMI());
    }
}


