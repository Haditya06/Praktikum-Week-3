import java.util.Scanner;

public class LatihanAkhir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double penghasilan, totalPajak;

        System.out.print("Masukkan total penghasilan (dalam juta): ");
        penghasilan = sc.nextDouble();

        if (penghasilan <= 50) {
            totalPajak = penghasilan * 0.05;
        } else if (penghasilan > 50 && penghasilan <= 100) {
            totalPajak = (50 * 0.05) + ((penghasilan - 50) * 0.10);
        } else if (penghasilan > 100 && penghasilan <= 200) {
            totalPajak = (50 * 0.05) + (50 * 0.10) + ((penghasilan - 100) * 0.15);
        } else {
            totalPajak = (50 * 0.05) + (50 * 0.10) + (100 * 0.15) + ((penghasilan - 200) * 0.20);
        }

        if (totalPajak % 1 == 0) {
            System.out.print("Total pajak yang harus dibayar: " + (int)totalPajak + " juta");
        } else {
            System.out.print("Total pajak yang harus dibayar: " + totalPajak + " juta");
        }
    }
}
