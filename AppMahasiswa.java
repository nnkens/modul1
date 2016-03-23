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
		Scanner scanMenu 	=  new  Scanner(System.in);
		Scanner scan 		=  new  Scanner(System.in);
		String nomorInduk		= "";
		String kodeProgStudi	= "";
		String namaprogStudi 	= "";
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
				nomorInduk 			= scan.nextLine();
				String[] splitNim 		= nomorInduk.split("\\.");
				try{
					kodeProgStudi  	= splitNim[0];
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Format Tidak Sesuai (XXX.YYYY.XX)");
					menu  			= 0;
					continue;
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
				
				nomorInduks.add(nomorInduk);
				namaprogStudis.add(namaprogStudi);
				namas.add(nama);
				alamatTinggals.add(alamatTinggal);
				alamatAsals.add(alamatAsal);
				noTelps.add(noTelp);
				jenisKelamins.add(jenisKelamin);
				
				System.out.println(nomorInduk+" Berhasil disimpan...");
				menu = 0;
				continue;
				
			case 2 :
				System.out.println(" ==== Cari Data Mahasiswa ==== ");
				System.out.println(" ====    Masukkan NIM     ==== ");
				nomorInduk = scan.nextLine();
				System.out.println("=========================================================");
				byte i = 0;
				for(String  x  : nomorInduks){
					if (x.equals(nomorInduk)){
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
