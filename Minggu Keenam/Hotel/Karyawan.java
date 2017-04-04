public class Karyawan{
	String  ID = "1001";
	String Nama, Alamat, Tgl, tipe;
	int Umur;
	char JK;
	
	public Karyawan(){
		System.out.println("Tipe Karyawan");
		System.out.println("--------------");
		System.out.println("A. Manager");
		System.out.println("B. Resepsionis");
		System.out.println("C. Ofice Boy");
		tipe="A";
		System.out.println("Tipe yang dipilih = " + tipe);
		System.out.println("==============\n");	
	}
	void Tampil(){
		System.out.println("Tampilan Data Anggota Karyawan");
		System.out.println("------------------------------");	
	}
	void TambahData(String x, String y, String z){
		Nama=x;
		Alamat=y;
		Tgl=z;
	}
 
	void TambahUmur(int j){
		this.Umur=j;	
	}
 
	void TambahJK(char k){
		JK=k;
	}
}