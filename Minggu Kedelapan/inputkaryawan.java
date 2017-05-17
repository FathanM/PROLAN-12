public class inputkaryawan {
    
    
    public static void main(String[] args) {
    Karyawan ky = new Karyawan();
    
    System.out.println("----Daftar nama karyawan----");
    ky.setNama("Fathan");
    ky.setPekerjaan("Programer");
    System.out.println("Nama     : "+ ky.getNama());
    System.out.println("Pekerjaan: "+ ky.getPekerjaan());
    
    ky.setNama("Reza");
    ky.setPekerjaan("Montir");
    System.out.println("Nama     : "+ ky.getNama());
    System.out.println("Pekerjaan: "+ ky.getPekerjaan());
    
    ky.setNama("Irpan");
    ky.setPekerjaan("Resepsionis");
    System.out.println("Nama     : "+ ky.getNama());
    System.out.println("Pekerjaan: "+ ky.getPekerjaan());
    }
}
