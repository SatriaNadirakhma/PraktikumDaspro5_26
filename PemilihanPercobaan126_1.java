import java.util.Scanner;
public class PemilihanPercobaan126_1 {
    public static void main(String[] args) {
    
    Scanner input26 = new Scanner(System.in);

    System.out.print("Masukkan angka: ");
    int angka = input26.nextInt();
    String hasil;

    hasil = (angka % 2 == 0) ? "Bilangan Genap" : "Bilangan Ganjil";
    System.out.println(hasil + " adalah " + angka);
    }
}