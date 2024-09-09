package pertemuan4.praktikum;

public class Matematika {
    
    // Method for addition
    public int pertambahan(int a, int b) {
        return a + b;
    }

    // Method for subtraction
    public int pengurangan(int a, int b) {
        return a - b;
    }

    // Method for multiplication
    public int perkalian(int a, int b) {
        return a * b;
    }

    // Method for division
    public double pembagian(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }
}