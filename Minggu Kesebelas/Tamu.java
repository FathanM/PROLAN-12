public class Tamu extends Karyawan{
    
    @Override
    public void tampiljudul() {
        System.out.println("\n================== Daftar Tamu ===================");
    }

    @Override
    public void tampildaftar() {
        System.out.println("Nama                       = " + getNama());
        System.out.println("Tanggal lahir              = " + getTgl());
        System.out.println("Alamat                     = " + getAlamat());
        System.out.println("Umur                       = " + getUmur());
        System.out.println("Jenis Kelamin              = " + getJK());
        System.out.println("Waktu Check in - Check out = " + getJam());
    }

    @Override
    public void tampilBaris() {
        System.out.println("==================================================");
    }

    @Override
    protected void Note() {
        System.out.println("Berikut adalah hasil data tamu:");
    }
        
}
