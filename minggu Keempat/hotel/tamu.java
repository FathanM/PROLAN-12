class tamu
{
	 
   //method mengembalikan nilai dengan menggunakan parameter
   public String Tampil_nama_Tamu(String Nama_tamu)
   {
        return Nama_tamu;
   }
    
	
	
	//method overloading dan penggunaan
    public void Tampil_Data_Tamu(String Nama_tamu, String alamat)	
	{
		System.out.println("Nama   : " +Nama_tamu);
		System.out.println("Alamat : " +alamat);
		System.out.println("= = = = = = = = = = = = = = = = = =");
	}
	
	public void Tampil_Data_Tamu(String Nama_tamu, String alamat, String ID)	
	{
	    System.out.println("Nama   : "+Nama_tamu);
		System.out.println("Alamat : "+alamat);
		System.out.println("ID     : "+ID);
		System.out.println("= = = = = = = = = = = = = = = = = =");
	}
}
