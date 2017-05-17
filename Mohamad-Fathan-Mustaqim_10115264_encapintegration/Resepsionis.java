public class Resepsionis extends Karyawan{
String ID ="R1231KYA";
	String Jadwal,tipe;
	
	Resepsionis(){
		this.tipe="Resepsionis";
	}
	
	public void TambahJadwal(String l){
		this.Jadwal=l;
	}
	@Override
        protected void DaftarKaryawan(){
		System.out.println("Tampilan Data Anggota Karyawan");
		System.out.println("------------------------------");
		System.out.println("ID Karyawan    = " + getID());
		System.out.println("Nama Karyawan  = " + getNama());
		System.out.println("Alamat         = " + getAlamat());
		System.out.println("Tanggl Lahir   = " + getTgl());
                System.out.println("Umur           = " + getUmur());
		System.out.println("Jenis Kelamin  = " + getJK());
		System.out.println("==============================\n\n");
	}	
	@Override
           protected void DaftarResepsionis(){
		System.out.println("Tampilan Data Anggota Resepsionis");
		System.out.println("---------------------------------");
		System.out.println("ID Karyawan    = " + getID());
		System.out.println("ID Resepsionis = " + ID);
		System.out.println("Nama Karyawan  = " + getNama());
		System.out.println("Alamat         = " + getAlamat());
		System.out.println("Tanggl Lahir   = " + getTgl());
		System.out.println("Jenis Kelamin  = " + getJK());
		System.out.println("Umur           = " + getUmur());
		TambahJadwal("07.00-15.00");
		System.out.println("Jadwal Piket   = " + this.Jadwal);
		System.out.println("===============================\n");
	}
}
