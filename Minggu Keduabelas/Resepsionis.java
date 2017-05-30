public class Resepsionis extends Karyawan{


    @Override
    public void tampiljudul() {
        System.out.println("\n==================Data Anggota Resepsionis=================");
    }

    @Override
    public void tampildaftar() {
                System.out.println("ID Karyawan   = " + getID());
		System.out.println("Nama Karyawan = " + getNama());
		System.out.println("Alamat        = " + getAlamat());
		System.out.println("Tanggl Lahir  = " + getTgl());
		System.out.println("Jenis Kelamin = " + getJK());
		System.out.println("Umur          = " + getUmur());
                System.out.println("Waktu Piket   = " + getJadwal());
		
    }

    @Override
    public void tampilBaris() {
        System.out.println("===========================================================");
    }

    @Override
    protected void Note() {
        System.out.println("Berikut Adalah Hasil anggota resepsionis:");
    }
}
