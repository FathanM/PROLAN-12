public class Hotel {

   public <T> void NamaKaryawan(T Nama){
        System.out.println("Nama Karyawan : " + Nama);
    }  
   public <T> void Alamat(T d){
        System.out.println("Alamat Karyawan : " + d);
    }
   public <N> void Kamar(N v){
        System.out.println("Nomor Kamar : " + v);
    }  
   public <T, N> void Harga(T x, N y){
        System.out.println("Harga Kamar          : " + y);
        System.out.println("Harga dalam bilangan : " + x);
    }  
   
   public static void main(String[] args) {
        Hotel Nilon = new Hotel();
        
        Nilon.NamaKaryawan("Mohamad Fathan Mustaqim");
        Nilon.Alamat("Bandung");
        Nilon.Kamar(96);
        Nilon.Harga("Lima ratus ribu",500000);
   }
}
