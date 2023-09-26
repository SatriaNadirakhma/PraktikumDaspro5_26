import java.util.Scanner;
public class PemilihanPercobaan326_3 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        double angka1, angka2, hasil;
        char operator;

        System.out.println("Masukkan Angka Pertama: ");
        angka1 = input26.nextDouble();
        System.out.println("Masukkan Angka Kedua: ");
        angka2 = input26.nextDouble();
        System.out.println("Masukkan Operator (+ - * /): ");
        operator = input26.next().charAt(0);

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " + " + angka2 + "=" + hasil);

            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + " - " + angka2 + "=" + hasil);
                break;

            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + " * " + angka2 + "=" + hasil);
                break;
                
            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + " / " + angka2 + "=" + hasil);
                break;
        }

    }
}
