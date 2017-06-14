package Hotel;
import Karyawan.interfaceHotel;
public class GenericBayar <T> implements interfaceHotel{
    T Bayar, HargaKmr;
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
        HargaKmr=l;
    }
    public T getHarga(){
        return HargaKmr;
    }
    
     public void setBayar(T l){
        Bayar=l;
    }
    public T Membayar(){
        return Bayar;
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
                System.out.println("Total       = " + Membayar());
                
    }

    @Override
    public void tampilBaris() {
        System.out.println("==============================================================");
    }


}
