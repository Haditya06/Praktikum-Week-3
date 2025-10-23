import java.util.Scanner;

public class Latihan4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double nilaiUjian, kehadiran;

		System.out.print("Masukan Nilai Ujian : ");
		nilaiUjian = sc.nextDouble();
		System.out.print("Masukan Presentasi Kehadiran: ");
		kehadiran = sc.nextDouble();

		if(nilaiUjian >= 85 && kehadiran >= 90){
			System.out.println("Lulus Dengan Baik");
		}else if(nilaiUjian >= 70 && nilaiUjian >= 85 && kehadiran >= 75){
			System.out.println("Lulus");
		}else if(nilaiUjian >= 50 && nilaiUjian <= 70 && kehadiran < 75){
			System.out.println("Remedial Karena Kehadiran Rendah");
		}else if(nilaiUjian < 50 ){
			System.out.println("Tidak Lulus Karena Nilai Rendah");
		}else if(nilaiUjian > 70 && kehadiran < 75){
			System.out.println("Tidak Lulus Karena Kehadiran Rendah");
		}
		else{
			System.out.println("Nilai Mahasiswa Tidak Valid");
		}
	}
}