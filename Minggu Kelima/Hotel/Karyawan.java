public class Karyawan{
	String  ID = "1001";
	String Nama, Alamat, Tgl;
	int Umur;
	char JK;
 
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
		Umur=j;	
	}
 
	void TambahJK(char k){
		JK=k;
	}
}