class resepsionis
{
   String Nama, ID, Tgl_lahir;
   byte Umur;
   char JenisKel = 'L';
   
   void Tampil_data_Karyawan()
   {
        System.out.println("Nama          : " + Nama);
		System.out.println("ID            : " + ID);
		System.out.println("Tgl_lahir     : " + Tgl_lahir);
		System.out.println("Umur          : " + Umur);
		System.out.println("Jenis Kelamin : " + JenisKel);
		System.out.println("============================\n");
   }   
}

class kamar
{
   byte Nokmr; 
   int Hargakmr;
   char TipeKmr;
   
   void Tampil_data_Kamar()
   {
        System.out.println("Nomor Kamar : " + Nokmr);
		System.out.println("Harga Kamar : " + Hargakmr);
		System.out.println("Tipe Kamar  : " + TipeKmr);
		System.out.println("============================\n");
   }
}

class tamu
{
   String Nama_tamu, alamat, Tgl_tamu;
   byte Umur_tamu;
   char JenisKel_tamu = 'L';
   
    void Tampil_data_Tamu()
   {
        System.out.println("Nama Tamu     : " + Nama_tamu);
		System.out.println("Alamat        : " + alamat);
		System.out.println("Tanggal lahir : " + Tgl_tamu);
	    System.out.println("Jenis Kelamin : " + JenisKel_tamu);
		System.out.println("============================\n");
   }
      
}

public class mainhotel
{
     public static void main(String[]args)
	 {
           resepsionis fathan = new resepsionis();
	       kamar satu = new  kamar();
		   tamu bos = new  tamu();
		   
		   fathan.Nama = "Mohamad Fathan Mustaqim";
		   fathan.ID = "10115264";
		   fathan.Tgl_lahir = "06 september 1996";
		   fathan.Umur = 20;
		   fathan.JenisKel = 'L';
		   
		   satu.Nokmr = 01;
		   satu.Hargakmr = 200000;
		   satu.TipeKmr = 'A';
		   
		   bos.Nama_tamu = "Alex Sandro";
		   bos.alamat = "Tasikmalaya";
		   bos.Tgl_tamu = "01 januari 1989";
		   bos.Umur_tamu = 30;
		   bos.JenisKel_tamu = 'L';
		   
		   fathan.Tampil_data_Karyawan();
		   satu.Tampil_data_Kamar();
		   bos.Tampil_data_Tamu();

	 }
}