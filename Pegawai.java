import java.util.Scanner;
public  class  Pegawai  {
	public  static  void  main(String...  args)  {
		System.out.println("Masukkan Nomor Induk Pegawai:");
		Scanner scan =  new  Scanner(System.in);
		String nomorInduk  = scan.nextLine();
		String[] array = nomorInduk.split("\\.");
		String departemen  = array[0];
		
		System.out.println("Masukkan Nama Lengkap:");
		String namaPegawai  =  scan.nextLine();
		
		Scanner scanUsia =  new  Scanner(System.in);
		System.out.println("Masukkan Usia:");
		int usiaPegawai  =  scanUsia.nextInt();
		
		System.out.println("Masukkan Jenis Kelamin:");
		String jenisKelamin  =  scan.nextLine();
		
		System.out.println("Nilai IPK Pegawai :");
		float ipkPegawai  =  scan.nextFloat();
		
		System.out.println("======================================");
		System.out.println("Nomor Induk Pegawai :"+nomorInduk);
		System.out.println("Departeman          :"+departemen);
		System.out.println("Nama Lengkap        :"+namaPegawai);
		System.out.println("Usia                :"+usiaPegawai);
		System.out.println("Jenis Kelamin       :"+jenisKelamin);
		System.out.println("IPK                 :"+ipkPegawai);
		System.out.println("======================================");
 	}
}
