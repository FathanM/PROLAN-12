public class GenericBayar <T> implements interfaceHotel{
    T bayar, hargakmr;
    String Nokmr;
    float Diskon=0.5f;
    int Lamasewa;
    
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
    
     public void setBayar(T l){
        bayar=l;
    }
    public T membayar(){
        return bayar;
    }
    public void setLama(int l){
        Lamasewa=l;
    }
    public int getLama(){
        return Lamasewa;
    }
            
    
    
    @Override
    public void tampiljudul() {
        System.out.println("\n==================Data Pembayaran Sewa Kamar=================");
    }

    @Override
    public void tampildaftar() {
                System.out.println("Nomor Kamar = " + getNokmr());
		System.out.println("Harga Kamar = " + getHarga());
                System.out.println("Lama Sewa   = " + getLama());
		System.out.println("Diskon      = " + Diskon);
                System.out.println("Total       = " + membayar());
                
    }

    @Override
    public void tampilBaris() {
        System.out.println("==============================================================");
    }


}
