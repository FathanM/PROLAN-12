public class GenSewa <T>{
    T luas;
    int harga;
    
    public <T> void TipeKamar(T x){
        System.out.println("Tipe Kamar  : " + x);
    }  
    public <N> void Lama(N y){
        System.out.println("Lama sewa   : " + y);
    }
    
    public void Luas(T l){
        luas=l;
        System.out.println("Luas Kamar  : " +luas);
    }
    
    public void Harga(int m){
        harga=m;
        System.out.println("Harga Kamar : " +harga);
    }
    
    public static void main(String[] args){
    GenSewa<Float> td= new GenSewa<>();
    GenSewa aa= new GenSewa();
    
    aa.TipeKamar('A');
    aa.Lama(2);
    aa.Harga(200000);
    td.Luas(12f);
    }

    void harga(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
