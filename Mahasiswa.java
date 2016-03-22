import java.util.Scanner;
public  class  Mahasiswa  {
	public  static  void  main(String...  args)  {
		System.out.println("Masukkan Nomor Induk Mahasiswa:");
		Scanner scan 			=  new  Scanner(System.in);
		String nomorInduk  		= scan.nextLine();
		String[] array 			= nomorInduk.split("\\.");
		String kodeProgStudi	= "";
		String tahunMasuk  		= "";
		String nomorUrut  		= "";
		String namaprogStudi 	= "";
		try{
			kodeProgStudi  	= array[0];
			tahunMasuk  	= array[1];
			nomorUrut  		= array[2];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Format Tidak Sesuai (XXX.YYYY.XX)");
			System.exit(0);
		}
		
		
		if (kodeProgStudi.equals("A11")) {
			namaprogStudi = "Tekhnik Informatika (S1)";
		}else if (kodeProgStudi.equals("A12")) {
			namaprogStudi = "Sistem Informasi (S1)";
		}else if (kodeProgStudi.equals("A13")) {
			namaprogStudi = "Teknik Informatika (D3)";
		}else if (kodeProgStudi.equals("A14")) {
			namaprogStudi = "Sistem Informasi (D3)";
		}
		
		System.out.println("Masukkan Nama Lengkap:");
		String nama  =  scan.nextLine();
		
		System.out.println("Masukkan Alamat Tinggal (Jalan, Kota, Propinsi):");
		String alamatTinggal  =  scan.nextLine();
		
		System.out.println("Masukkan Alamat Asal Mahasiswa (Jalan, Kota, Propinsi):");
		String alamatAsal  =  scan.nextLine();
		
		System.out.println("No Telp / Hp :");
		String noTelp  =  scan.nextLine();
		
		System.out.println("Jenis Kelamin (Pria/Wanita) :");
		String jenisKelamin  =  scan.nextLine();;
		
		System.out.println("============================================");
		System.out.println("= Nomor Induk Mahasiswa :"+nomorInduk);
		System.out.println("= Program Studi         :"+namaprogStudi);
		System.out.println("= Tahun Masuk           :"+tahunMasuk);
		System.out.println("= Nomor Urut            :"+nomorUrut);
		System.out.println("= Nama Lengkap          :"+nama);
		System.out.println("= Alamat Tinggal        :"+alamatTinggal);
		System.out.println("= Alamat Asal           :"+alamatAsal);
		System.out.println("= No Telp / Hp          :"+noTelp);
		System.out.println("= Jenis Kelamin         :"+jenisKelamin);
		System.out.println("=============================================");
 	}
}
