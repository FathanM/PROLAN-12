public class Resepsionis extends Karyawan{
	String ID = "Re01S05";
	String Jadwal, tipe;
	
	Resepsionis(){
		System.out.println(super.tipe);
		this.tipe="C";
		System.out.println("Karyawan = " + tipe);
		
	}
	
	void TambahJadwal(String l){
		this.Jadwal=l;
	}
	
	@Override
	void Tampil(){
		System.out.println("Tampilan Data Anggota Resepsionis");
		System.out.println("---------------------------------");
	}
	
	void DaftarKaryawan(){
		super.Tampil();
		System.out.println("ID Karyawan    = " + super.ID);
		System.out.println("Nama Karyawan  = " + super.Nama);
		System.out.println("Alamat         = " + super.Alamat);
		System.out.println("Tanggl Lahir   = " + super.Tgl);
		TambahUmur(20);
		System.out.println("Jenis Kelamin  = " + super.JK);
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
		this.TambahJadwal("07.00-15.00");
		System.out.println("Jadwal Piket     = " + this.Jadwal);
		System.out.println("==================================\n");
	}
}