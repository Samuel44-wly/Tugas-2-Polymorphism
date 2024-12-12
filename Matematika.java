/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

class Matematika {
    public int pertambahan(int a, int b) {
        return a + b;
    }

    public int pengurangan(int a, int b) {
        return a - b;
    }

    public int perkalian(int a, int b) {
        return a * b;
    }

    public double pembagian(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Tidak bisa membagi dengan nol!");
        }
    }

    public int modulus(int a, int b) {
        return a % b;
    }
}
