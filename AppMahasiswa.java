import java.util.Scanner;
import java.util.ArrayList;
public  class  AppMahasiswa  {
	public  static  void  main(String...  args)  {
		ArrayList<String>  nomorInduks  	=  new  ArrayList<>();
		ArrayList<String>  namaprogStudis  	=  new  ArrayList<>();
		ArrayList<String>  namas  			=  new  ArrayList<>();
		ArrayList<String>  alamatTinggals  	=  new  ArrayList<>();
		ArrayList<String>  alamatAsals  	=  new  ArrayList<>();
		ArrayList<String>  noTelps  		=  new  ArrayList<>();
		ArrayList<String>  jenisKelamins  	=  new  ArrayList<>();
		Scanner scanMenu 					=  new  Scanner(System.in);
		Scanner scan 						=  new  Scanner(System.in);
		StringBuffer nomorInduk				=  new StringBuffer("");
		StringBuffer kodeProgStudi			=  new StringBuffer("");
		StringBuffer namaprogStudi			=  new StringBuffer("");
		StringBuffer nama					=  new StringBuffer("");
		StringBuffer alamatTinggal			=  new StringBuffer("");
		StringBuffer alamatAsal				=  new StringBuffer("");
		StringBuffer noTelp					=  new StringBuffer("");
		StringBuffer jenisKelamin			=  new StringBuffer("");
		byte menu = 0;
        do
        {
			switch(menu)
            {
			case 0 : 
				System.out.println("==============================");
				System.out.println("=  Pilih Menu Berikut        =");
				System.out.println("=  1 : Entry Data Mahasiswa  =");
				System.out.println("=  2 : Cari Data Mahasiswa   =");
				System.out.println("=  3 : EXIT                  =");
				System.out.println("==============================");
				menu  			= scanMenu.nextByte();
				continue;
				
			case 1 :
				System.out.println(" ==== Entry Data Mahasiswa ==== ");
				System.out.println("Masukkan NIM :");
				nomorInduk.replace(0, nomorInduk.toString().length(), scan.nextLine());
				String[] splitNim 		= nomorInduk.toString().split("\\.");
				try{
					kodeProgStudi.replace(0, kodeProgStudi.toString().length(), splitNim[0]);
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Format Tidak Sesuai (XXX.YYYY.XX)");
					menu  			= 0;
					continue;
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
				
				System.out.println(nomorInduk+" Berhasil disimpan...");
				menu = 0;
				continue;
				
			case 2 :
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
				menu = 0;
				continue;
				
			case 3 :
				System.out.println("Bye Bye .....");
				System.exit(0);
				
			default :
				menu = 0;
				continue;
			}
		}while(true);
 	}
}
