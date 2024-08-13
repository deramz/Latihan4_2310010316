/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

// Class MatematikaBeraksi
public class MatematikaBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih matematika = new MatematikaCanggih();

        // Uji method hitungPecahan dengan 3 parameter
        double hasilPecahan = matematika.hitungPecahan(12.5, 28.7, 14.2);
        System.out.println("Hasil pecahan (12.5 + 28.7 + 14.2): " + hasilPecahan);

        // Uji konsep overloading dengan berbagai kombinasi parameter
        System.out.println("Pertambahan (12.5 + 28.7 + 14.2): " + matematika.pertambahan(12.5, 28.7, 14.2));
        System.out.println("Pertambahan (12 + 28 + 14): " + matematika.pertambahan(12, 28, 14));
        System.out.println("Pertambahan (23 + 34): " + matematika.pertambahan(23, 34));
        System.out.println("Pertambahan (3.4 + 4.9): " + matematika.pertambahan(3.4, 4.9));
    }
}