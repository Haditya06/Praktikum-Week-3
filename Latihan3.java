import java.util.Scanner;

public class Latihan3{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int usia, gajiTahunan;


    System.out.print("Input Usia (Dalam Tahun) : ");
    usia = sc.nextInt();

    System.out.print("Inputkan Gaji Tahunan (Satuan Juta) : ");
    gajiTahunan = sc.nextInt();

    if (usia < 18 ){
    	System.out.println("Masih Bersekolah");
    }else if(usia >= 18 && usia <= 25 ){
    	if(gajiTahunan >= 50){
    		System.out.println("Muda Sukses Banget");
    	
    	}else if(gajiTahunan < 50){
    		System.out.println("Masih Belajar");
    	}
    }else if(usia >= 26 && usia <= 40){
    	if(gajiTahunan >= 100){
    		System.out.println("Pekerja Mapan");
    	}else if(gajiTahunan < 100){
    		System.out.println("Perlu Perbaiki Karir");
    	}
    }else if(usia > 40){
    	if(gajiTahunan >= 150){
    		System.out.println("Profesional Berpengalaman");
    	}else if(gajiTahunan < 150){
    		System.out.println("Perlu Di Evaluasi Finalsialnya");
    	}
    }


    }
}