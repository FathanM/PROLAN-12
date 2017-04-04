public class MainHotel extends Resepsionis{
	String Nama;
	
	
	@Override  
    void TambahJadwal(String l){
		Jadwal=l;
	}
	
	@Override
	void TambahUmur(int j){
		Umur=j;
		System.out.println("Umur           = " + this.Umur);	
	}
	
	@Override
	void Tampil(){
		System.out.println("Daftar Pengunjung");
		System.out.println("-----------------");
	}
	
	void TambahTamu(String m){
		Nama=m;
		Tampil();
		System.out.println("Nama Tamu      = " + Nama);
		this.TambahUmur(40);
        this.TambahJadwal("09.00 - 13.00");	
		System.out.println("Waktu Check In - Check Out= " + Jadwal);
		System.out.println("=================\n\n");
	}
	
	public static void main(String argd[]){
	
		MainHotel Newton = new MainHotel();
		Resepsionis Cvv = new Resepsionis();
		Newton.TambahData("Fathan", "Tasikmalaya", "06-09-1996");
		Newton.TambahJK('L');
		Newton.TambahTamu("Rudi");
		Newton.DaftarKaryawan();
		Newton.DaftarResepsionis();
		
	}
}
