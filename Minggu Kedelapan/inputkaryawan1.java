public class inputkaryawan1 {
    
    
    public static void main(String[] args) {
    Karyawan ky = new Karyawan();
    System.out.println("----Daftar umur karyawan----");
    ky.setAlamat("Tasikmalaya");
    ky.setUmur(20);
    System.out.println("Alamat   : "+ ky.getAlamat());
    System.out.println("Umur     : "+ ky.getUmur());   
    ky.setAlamat("Bandung");
    ky.setUmur(31);
    System.out.println("Alamat   : "+ ky.getAlamat());
    System.out.println("Umur     : "+ ky.getUmur());   
    ky.setAlamat("Jakarta");
    ky.setUmur(19);
    System.out.println("Alamat   : "+ ky.getAlamat());
    System.out.println("Umur     : "+ ky.getUmur());    
    }
}
