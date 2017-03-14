
public class mainhotel
{
     public static void main(String[]args)
	 {
           //pemanggilan konstruktor
		   resepsionis fathan = new resepsionis();	
           tamu method = new tamu();		   
		   kamar satu = new kamar();
		   
	       System.out.println("Nama          : " +fathan.Nama);
		   System.out.println("ID            : " +fathan.ID);
		   System.out.println("Tgl           : " +fathan.Tgl_lahir);
		   System.out.println("Umur          : " +fathan.Umur);
		   System.out.println("Jenis Kelamin : " +fathan.JenisKel);
		   System.out.println("= = = = = = = = = = = = = = = = = = =");
		  
  		   method.Tampil_nama_Tamu("fathan");
		   method.Tampil_Data_Tamu("Alex", "Tasikmalaya");
		   method.Tampil_Data_Tamu("Essien", "Bandung","102d2");
		   
		   satu.tampil_kamar(10, 100000, 'A');
		   System.out.println("Nomor kamar  : " +satu.Nokmr);
		   System.out.println("Harga kamar  : " +satu.Hargakmr);
		   System.out.println("Tipe kamar   : " +satu.TipeKmr);

	 }
}