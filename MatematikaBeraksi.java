package pertemuan4.praktikum;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        // Create an instance of the Matematika class
        Matematika matematika = new Matematika();

        // Perform operations and display results
        int hasilPertambahan = matematika.pertambahan(20, 10);
        int hasilPengurangan = matematika.pengurangan(10, 5);
        int hasilPerkalian = matematika.perkalian(10, 3);
        double hasilPembagian = matematika.pembagian(21, 2);

        // Print the results
        System.out.println("Pertambahan: 20 + 10 = " + hasilPertambahan);
        System.out.println("Pengurangan: 10 - 5 = " + hasilPengurangan);
        System.out.println("Perkalian  : 10 * 3 = " + hasilPerkalian);
        System.out.println("Pembagian  : 21 / 2 = " + (int)hasilPembagian);
    }
}
