package Hotel;
import Karyawan.interfaceHotel;
public class Kamar implements interfaceHotel{
    String No,Fasilitas;
    float Luas;
    
    public void setNo(String l){
        No=l;
    }
    public String getNo(){
        return No;
    }
    public void setFasilitas(String l){
        Fasilitas=l;
    }
    public String getFasilitas(){
        return Fasilitas;
    }
    public void setLuas(float l){
        Luas=l;
    }
    public float getLuas(){
        return Luas;
    }
    @Override
    public void tampiljudul() {
        System.out.println("\n================== Daftar Kamar ===================");
    }

    @Override
    public void tampildaftar() {
        System.out.println("Nomor Kamar : " + getNo());
        System.out.println("luas Kamar  : " + getLuas());
        System.out.println("Fasilitas   : " + getFasilitas());
    }

    @Override
    public void tampilBaris() {
        System.out.println("==================================================");
    }
    
}
