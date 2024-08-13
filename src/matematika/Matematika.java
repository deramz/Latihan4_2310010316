/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matematika;

// Class Matematika
class Matematika {
    // Overloading method untuk pertambahan
    public int pertambahan(int a, int b) {
        return a + b;
    }

    public int pertambahan(int a, int b, int c) {
        return a + b + c;
    }

    public double pertambahan(double a, double b) {
        return a + b;
    }

    public double pertambahan(double a, double b, double c) {
        return a + b + c;
    }

    // Overloading method untuk pengurangan
    public int pengurangan(int a, int b) {
        return a - b;
    }

    public double pengurangan(double a, double b) {
        return a - b;
    }

    // Overloading method untuk perkalian
    public int perkalian(int a, int b) {
        return a * b;
    }

    public double perkalian(double a, double b) {
        return a * b;
    }

    // Overloading method untuk pembagian
    public int pembagian(int a, int b) {
        return a / b;
    }

    public double pembagian(double a, double b) {
        return a / b;
    }

    // Overloading method untuk modulus
    public int modulus(int a, int b) {
        return a % b;
    }

    public double modulus(double a, double b) {
        return a % b;
    }
}

// Class MatematikaCanggih yang mewarisi class Matematika
class MatematikaCanggih extends Matematika {
    // Method baru dengan tipe data double dan memiliki 3 parameter
    public double hitungPecahan(double a, double b, double c) {
        return a + b + c;
    }
}
