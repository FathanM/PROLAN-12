public class Kamar implements interfaceHotel{
    String No,fasilitas;
    float luas;
    
    public void setNo(String l){
        No=l;
    }
    public String getNo(){
        return No;
    }
    public void setFasilitas(String l){
        fasilitas=l;
    }
    public String getFasilitas(){
        return fasilitas;
    }
    public void setLuas(float l){
        luas=l;
    }
    public float getLuas(){
        return luas;
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
