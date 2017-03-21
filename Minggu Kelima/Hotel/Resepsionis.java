public class Resepsionis extends Karyawan{
	String ID = "Re01S05";
	String Jadwal;
	
	void TambahJadwal(String l){
		Jadwal=l;
	}
	void Tampil(){
		System.out.println("Tampilan Data Anggota Resepsionis");
		System.out.println("---------------------------------");
	}
	
	void DaftarKaryawan(){
		super.Tampil();
		System.out.println("ID Karyawan   = " + super.ID);
		System.out.println("Nama Karyawan = " + super.Nama);
		System.out.println("Alamat        = " + super.Alamat);
		System.out.println("Tanggl Lahir  = " + super.Tgl);
		System.out.println("Umur          = " + super.Umur);
		System.out.println("Jenis Kelamin = " + super.JK);
		System.out.println("=============================\n\n");
	}	
	void DaftarResepsionis(){
		Tampil();
		System.out.println("ID Resepsionis   = " + ID);
		System.out.println("Nama Resepsionis = " + super.Nama);
		System.out.println("Alamat           = " + super.Alamat);
		System.out.println("Tanggl Lahir     = " + super.Tgl);
		System.out.println("Umur             = " + super.Umur);
		System.out.println("Jenis Kelamin    = " + super.JK);
		System.out.println("Jadwal Piket     = " + Jadwal);
		System.out.println("==================================\n");
	}
}