public class MainHotel extends Resepsionis{
    String Nama, jam;
    int Umur;
    
    public void TambahJam(String l){
		jam=l;
                System.out.println("Waktu Check In - Check Out= " + jam);
	}
	
	public void TambahUmur(int j){
		Umur=j;
		System.out.println("Umur           = " + this.Umur);	
	}
	
        public void Tampil(){
		System.out.println("Daftar Pengunjung");
		System.out.println("-----------------");
	}
	
	public void TambahTamu(String m){
		Nama=m;
		this.Tampil();
		System.out.println("Nama Tamu      = " + Nama);
		this.TambahUmur(40);
                this.TambahJam("09.00 - 13.00");	
		System.out.println("=================\n\n");
	}
	
	public static void main(String argd[]){
		MainHotel Newton = new MainHotel();
		Newton.TambahTamu("Rudi");
                Newton.setID("K1011A");
                Newton.setNama("Mohamad fathan");
                Newton.setAlamat("Tasikmalaya");
                Newton.setJK('L');
                Newton.setTgl("06 September 1996");
                Newton.setTipe("Resepsionis");
                Newton.setUmur(21);
		Newton.DaftarKaryawan();
		Newton.DaftarResepsionis();
		
	}
}