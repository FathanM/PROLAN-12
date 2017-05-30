public class GenericBayar <T> implements interfaceHotel{
    private T bayar, hargakmr;
    String Nokmr;
    float Diskon=0.5f;
    
    public void setNokmr(String l){
        Nokmr=l;
    }
    public String getNokmr(){
        return Nokmr;
    }
   public void setharga(T l){
        hargakmr=l;
    }
    public T getHarga(){
        return hargakmr;
    }
    
    public T membayar(){
        return bayar;
    }
    
            
    
    
    @Override
    public void tampiljudul() {
        System.out.println("\n==================Data Pembayaran Sewa Kamar=================");
    }

    @Override
    public void tampildaftar() {
                System.out.println("Nomor Kamar = " + getNokmr());
		System.out.println("Harga Kamar = " + getHarga());
		System.out.println("Diskon      = " + Diskon);
                this.bayar= hargakmr;
                System.out.println("Total       = " + membayar());
                
    }

    @Override
    public void tampilBaris() {
        System.out.println("==============================================================");
    }


}
