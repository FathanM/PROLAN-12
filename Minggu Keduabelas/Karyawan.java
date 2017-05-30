public abstract class Karyawan implements interfaceHotel{
    private String ID, Nama, Alamat, Tgl, jam, jadwal;
    private int Umur;
    private char JK;

    public String getNama(){
        return Nama;
    }
   
    public void setNama(String nama){
        this.Nama = nama;
    }

    public String getID(){
        return ID;
    }
    
    public void setID(String ID){
        this.ID = ID;
    }
    
    public String getAlamat(){
        return Alamat;
    }
    
    public void setAlamat(String alamat){
        this.Alamat = alamat;
    }
    public int getUmur(){
        return Umur;
    }
    
    public void setUmur(int umur){
        this.Umur = umur;
    }

    public String getTgl(){
        return Tgl;
    }
    
    public void setTgl(String Tgl){
        this.Tgl = Tgl;
    }
       
    public char getJK(){
        return JK;
    }
    
    public void setJK(char JK){
        this.JK = JK;
    }
    
    public String getJam(){
        return jam;
    }
    
    public void setJam(String Jam){
        this.jam = Jam;
    }
    
    public String getJadwal(){
        return jadwal;
    }
    
    public void setJadwal(String jadwal){
        this.jadwal = jadwal;
    }
    
    protected abstract void Note();
}
