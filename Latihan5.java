import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pilihan;
        String namaMahasiswa;
        int nilaiMahasiswa;

        System.out.println("Menu:");
        System.out.println("1. Input Nilai Mahasiswa");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu: ");
        pilihan = sc.nextInt();
        sc.nextLine(); 

        switch (pilihan) {
            case 1:
                System.out.print("Input Nama Mahasiswa: ");
                namaMahasiswa = sc.nextLine();

                System.out.print("Inputkan Nilai Mahasiswa: ");
                nilaiMahasiswa = sc.nextInt();

                if (nilaiMahasiswa >= 90 && nilaiMahasiswa <= 100) {
                    System.out.println(namaMahasiswa + " Mendapatkan Nilai : A");
                } else if (nilaiMahasiswa >= 80 && nilaiMahasiswa < 90) {
                    System.out.println(namaMahasiswa + " Mendapatkan Nilai : B");
                } else if (nilaiMahasiswa >= 70 && nilaiMahasiswa < 80) {
                    System.out.println(namaMahasiswa + " Mendapatkan Nilai : C");
                } else if (nilaiMahasiswa >= 60 && nilaiMahasiswa < 70) {
                    System.out.println(namaMahasiswa + " Mendapatkan Nilai : D");
                } else if (nilaiMahasiswa >= 0 && nilaiMahasiswa < 60) {
                    System.out.println(namaMahasiswa + " Mendapatkan Nilai : F");
                } else {
                    System.out.println("Nilai Mahasiswa Tidak Valid!!");
                }
                break;

            case 0:
                System.out.println("Exiting app.");
                break;

            default:
                System.out.println("Input Tidak Valid!");
                break;
        }
    }
}
