package app;
import java.util.Scanner;
public class  Application  {

	public static   Scanner scan 						= new  Scanner(System.in);
	public static	Scanner scanMenu 					= new  Scanner(System.in);
	public static 	byte	menu						= 0;
	public static 	StringBuffer nik					= new StringBuffer("");
	public static	StringBuffer nama					= new StringBuffer("");
	public static	StringBuffer jenisKelamin			= new StringBuffer("");
	public static	StringBuffer departemen				= new StringBuffer("");
	
	public  static  void  main(String[]  args)  {
		showMenu();
 	}
	
	public static void showMenu()
	{
		System.out.println("================================");
		System.out.println("=  Pilih Menu                  =");
		System.out.println("=  1 : Entry Data Karyawan     =");
		System.out.println("=  2 : Searching Data Karyawan =");
		System.out.println("=  3 : EXIT                    =");
		System.out.println("================================");
		menu  			= scanMenu.nextByte();
		switch(menu)
		{
			case 1 : entryKaryawan(); break;
			case 2 : searchKaryawan(); break;
			case 3 : keluarAplikasi(); break;
		}
	}
	
	public static void entryKaryawan()
	{
		System.out.println(" ==== Entry Data Karyawan ==== ");
		System.out.println(" Masukkan NIK :");
		nik.replace(0, nik.toString().length(), scan.nextLine());
		System.out.println("Masukkan Nama Lengkap:");
		nama.replace(0, nama.toString().length(), scan.nextLine());
		System.out.println("Jenis Kelamin (Pria/Wanita) :");
		jenisKelamin.replace(0, jenisKelamin.toString().length(), scan.nextLine());
		System.out.println("Masukkan Departemen:");
		departemen.replace(0, departemen.toString().length(), scan.nextLine());

		Karyawan karyawan = new Karyawan();
		karyawan.simpanKaryawan(nik.toString(),nama.toString(),jenisKelamin.toString(),departemen.toString());
		showMenu();
	}
	
	public static void searchKaryawan()
	{
		System.out.println(" ==== Search Data Karyawan ==== ");
		System.out.println(" ====    Masukkan NIK     ==== ");
		String getNik = scan.nextLine();
		Karyawan karyawan = new Karyawan();
		karyawan.cariKaryawan(getNik);
		showMenu();
	}
	
	public static void keluarAplikasi()
	{
		System.out.println("Bye Bye .....");
		System.exit(0);
	}
}
