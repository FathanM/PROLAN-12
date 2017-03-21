public class MainHotel extends Resepsionis{
	String Nama, WktCI, WktCO;
	
	void Tampil_t(){
		System.out.println("Daftar Pengunjung");
		System.out.println("-----------------");
	}
	
	void TambahTamu(String m, String n, String o){
		Nama=m;
		WktCI=n;
		WktCO=o;
		Tampil_t();
		System.out.println("Nama Pengunjung = " + Nama);
		System.out.println("Waktu Check In  = " + WktCI);
		System.out.println("Waktu Check Out = " + WktCO);
		System.out.println("=================\n\n");
	}
	
	public static void main(String argd[]){
	
		MainHotel Newton = new MainHotel();
		Newton.TambahData("Fathan", "Tasikmalaya", "06-09-1996");
		Newton.TambahUmur(20);
		Newton.TambahJK('L');
		Newton.TambahJadwal("07.00-14.00");
		Newton.TambahTamu("Rudi", "08.00", "15.00");
		Newton.DaftarKaryawan();
		Newton.DaftarResepsionis();
	}
}
