/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

public class MatematikaBeraksi extends MatematikaCanggih {
    public double pecahan(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        MatematikaBeraksi matematika = new MatematikaBeraksi();

        System.out.println("Hasil pecahan: " + matematika.pecahan(12.5, 28.7, 14.2));
        System.out.println("Pertambahan 3 parameter: " + matematika.pertambahan(12, 28, 14));
        System.out.println("Pertambahan 2 parameter (double): " + matematika.pertambahan(3.4, 4.9));
        System.out.println("Pertambahan 2 parameter (int): " + matematika.pertambahan(23, 34));
        System.out.println("Pengurangan: " + matematika.pengurangan(50, 20));
        System.out.println("Perkalian: " + matematika.perkalian(5, 6));
        System.out.println("Pembagian: " + matematika.pembagian(50, 5));
        System.out.println("Modulus: " + matematika.modulus(17, 3));
    }
}
