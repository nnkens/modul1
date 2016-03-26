package app;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class  Karyawan  {
	public String nik;
    public String nama;
    public String jenisKelamin;
    public String departemen;
	public static 	List<Karyawan> list = new ArrayList<Karyawan>();
	
	public static void simpanKaryawan(String nik,String nama,String jenisKelamin,String departemen)
	{
		Karyawan karyawan = new Karyawan();
        karyawan.nik = nik;
        karyawan.nama = nama;
        karyawan.jenisKelamin = jenisKelamin;
        karyawan.departemen = departemen;
        list.add(karyawan);
		System.out.println("Data Berhasil disimpan...");
	}
	
	public static void cariKaryawan(String nik)
	{
		System.out.println("=========================================================");
		boolean sukses = false; 
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
            Karyawan karyawan = (Karyawan) iterator.next();
            if (karyawan.nik.equals(nik)){
				System.out.println("Data ditemukan ....");
				System.out.println("=========================================================");
				System.out.println("NIM           = " + karyawan.nik);
				System.out.println("Nama          = " + karyawan.nama);
				System.out.println("Jenis Kelamin = " + karyawan.jenisKelamin);
				System.out.println("Departemen    = " + karyawan.departemen);
				sukses = true;
				break;
			}
		}
		if (!sukses)
		{
			System.out.println("Data Tidak ditemukan ....");
		}
		System.out.println("=========================================================");	
	}
}
