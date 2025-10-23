import java.util.Scanner;
public class Latihan1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nilaiMahasiswa;
		String namaMahasiswa;

		System.out.print("Input Nama Mahasaiswa :");
		namaMahasiswa = sc.nextLine();

		System.out.print("Inputkan Nilai Mahasaiswa :");
		nilaiMahasiswa = sc.nextInt();

		if(nilaiMahasiswa >= 90 && nilaiMahasiswa <= 100){
			System.out.println(namaMahasiswa + " Mendapatkan Nilai : A");
		}else if(nilaiMahasiswa < 90 && nilaiMahasiswa >= 80 ){
			System.out.println(namaMahasiswa + " Mendapatkan Nilai : B");
		}else if(nilaiMahasiswa < 80 && nilaiMahasiswa >= 70 ){
			System.out.println(namaMahasiswa + " Mendapatkan Nilai : C");
		}else if(nilaiMahasiswa < 70 && nilaiMahasiswa >= 60 ){
			System.out.println(namaMahasiswa + " Mendapatkan Nilai : D");
		}else if(nilaiMahasiswa < 60){
			System.out.println(namaMahasiswa + " Mendapatkan Nilai :F");
		}
        else 
        	System.out.println("Nilai Mahasaiswa Tidak Valid!!");

	}
}

