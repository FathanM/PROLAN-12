public class Main {
    public <T> GenSewa Bayar(T q){
        return (GenSewa) q;
    }
    public <T> Hotel Bayar1(T d){
        return (Hotel) d;
    }
    public static void main(String[] args){
        Main m = new Main();
        float total;
        m.Bayar(new GenSewa<>()).Lama(2); 
        m.Bayar1(new Hotel()).Harga("Seratus ribu", 100000);
    }
}
