import java.util.Scanner;
import java.util.ArrayList;
public  class  AppMahasiswa2  {

	public static	ArrayList<String>  nomorInduks  	=  new  ArrayList<>();
	public static	ArrayList<String>  namaprogStudis  	=  new  ArrayList<>();
	public static	ArrayList<String>  namas  			=  new  ArrayList<>();
	public static	ArrayList<String>  alamatTinggals  	=  new  ArrayList<>();
	public static	ArrayList<String>  alamatAsals  	=  new  ArrayList<>();
	public static	ArrayList<String>  noTelps  		=  new  ArrayList<>();
	public static	ArrayList<String>  jenisKelamins  	=  new  ArrayList<>();
	public static   Scanner scan 						=  new  Scanner(System.in);
	public static	Scanner scanMenu 					=  new  Scanner(System.in);
	public static 	byte	menu						=  0;
	public static 	StringBuffer nomorInduk				=  new StringBuffer("");
	public static	StringBuffer kodeProgStudi			=  new StringBuffer("");
	public static	StringBuffer namaprogStudi			=  new StringBuffer("");
	public static	StringBuffer nama					=  new StringBuffer("");
	public static	StringBuffer alamatTinggal			=  new StringBuffer("");
	public static	StringBuffer alamatAsal				=  new StringBuffer("");
	public static	StringBuffer noTelp					=  new StringBuffer("");
	public static	StringBuffer jenisKelamin			=  new StringBuffer("");
	
	public  static  void  main(String...  args)  {
		showMenu();
 	}
	
	public static void showMenu()
	{
		System.out.println("==============================");
		System.out.println("=  Pilih Menu                =");
		System.out.println("=  1 : Entry Data Mahasiswa  =");
		System.out.println("=  2 : Cari Data Mahasiswa   =");
		System.out.println("=  3 : EXIT                  =");
		System.out.println("==============================");
		menu  			= scanMenu.nextByte();
		switch(menu)
		{
			case 1 : entryMahasiswa(); break;
			case 2 : cariMahasiswa(); break;
			case 3 : keluarAplikasi(); break;
		}
	}
	
	public static void entryMahasiswa()
	{
		System.out.println(" ==== Entry Data Mahasiswa ==== ");
		System.out.println(" Masukkan NIM :");
		nomorInduk.replace(0, nomorInduk.toString().length(), scan.nextLine());
		String[] splitNim 			= nomorInduk.toString().split("\\.");
		
		try{
			kodeProgStudi.replace(0, kodeProgStudi.toString().length(), splitNim[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Format Tidak Sesuai (XXX.YYYY.XX)");
			System.exit(0);
		}
		
		
		if (kodeProgStudi.toString().equals("A11")) {
			namaprogStudi.replace(0, namaprogStudi.toString().length(), "Tekhnik Informatika (S1)");
		}else if (kodeProgStudi.toString().equals("A12")) {
			namaprogStudi.replace(0, namaprogStudi.toString().length(), "Sistem Informasi (S1)");
		}else if (kodeProgStudi.toString().equals("A13")) {
			namaprogStudi.replace(0, namaprogStudi.toString().length(), "Tekhnik Informatika (D3)");
		}else if (kodeProgStudi.toString().equals("A14")) {
			namaprogStudi.replace(0, namaprogStudi.toString().length(), "Sistem Informasi (D3)");
		}
		
		System.out.println("Masukkan Nama Lengkap:");
		nama.replace(0, nama.toString().length(), scan.nextLine());
		
		System.out.println("Masukkan Alamat Tinggal (Jalan, Kota, Propinsi):");
		alamatTinggal.replace(0, alamatTinggal.toString().length(), scan.nextLine());
		
		System.out.println("Masukkan Alamat Asal Mahasiswa (Jalan, Kota, Propinsi):");
		alamatAsal.replace(0, alamatAsal.toString().length(), scan.nextLine());
		
		System.out.println("No Telp / Hp :");
		noTelp.replace(0, noTelp.toString().length(), scan.nextLine());
		
		System.out.println("Jenis Kelamin (Pria/Wanita) :");
		jenisKelamin.replace(0, jenisKelamin.toString().length(), scan.nextLine());
		
		nomorInduks.add(nomorInduk.toString());
		namaprogStudis.add(namaprogStudi.toString());
		namas.add(nama.toString());
		alamatTinggals.add(alamatTinggal.toString());
		alamatAsals.add(alamatAsal.toString());
		noTelps.add(noTelp.toString());
		jenisKelamins.add(jenisKelamin.toString());
		
		System.out.println("Data Berhasil disimpan...");
		showMenu();
	}
	
	public static void cariMahasiswa()
	{
		System.out.println(" ==== Cari Data Mahasiswa ==== ");
		System.out.println(" ====    Masukkan NIM     ==== ");
		String getNim = scan.nextLine();
		System.out.println("=========================================================");
		byte i = 0;
		for(String  x  : nomorInduks){
			if (x.equals(getNim)){
				System.out.println("Data ditemukan ....");
				System.out.println("=========================================================");
				System.out.println("NIM             :"+nomorInduks.get(i));
				System.out.println("Nama            :"+namas.get(i));
				System.out.println("Program Studi   :"+namaprogStudis.get(i));
				System.out.println("Alamat Tinggal  :"+alamatTinggals.get(i));
				System.out.println("Alamat Asal     :"+alamatAsals.get(i));
				System.out.println("Telp            :"+noTelps.get(i));
				System.out.println("Jenis Kelamin   :"+jenisKelamins.get(i));
				break;
			}
		i++;
		}
		System.out.println("=========================================================");
		showMenu();
		
	}
	
	public static void keluarAplikasi()
	{
		System.out.println("Bye Bye .....");
		System.exit(0);
	}
}
