public class Fathan extends Mahasiswa{

    @Override
    protected void kuliah() {
       Nama = "Mohamad Fathan Mustaqim"; 
       NIM  = "10115264";
       JK   = 'L';
       
       System.out.println("===========================================================");
       System.out.println("Mahasiswa yang bernama :");
       System.out.println("Nama          : " + Nama);
       System.out.println("NIM           : " + NIM);
       System.out.println("Jenis Kelamin : " + JK);
       System.out.println("Kuliah dan terdaftar di UNIKOM");
       System.out.println("-----------------------------------------------------------\n");
    }

    @Override
    protected void lulus() {
       System.out.println("===========================================================");
       System.out.println("Mahasiswa yang bernama : " + Nama);
       System.out.println("Dinyatakan Lulus dari UNIKOM");
       System.out.println("-----------------------------------------------------------\n");
    }

    @Override
    protected void tidaklulus() {
       System.out.println("===========================================================");
       System.out.println("Mahasiswa yang memiliki NIM : " + NIM);
       System.out.println("Dinyatakan Tidak Lulus di UNIKOM, dan harus mengulang lagi!");
       System.out.println("-----------------------------------------------------------");   
    }
    
}
