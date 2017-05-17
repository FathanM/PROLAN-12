public abstract class Karyawan {
    private String ID, Nama, Alamat, Tgl, tipe;
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
    
    public String getTipe(){
        return tipe;
    }
    
    public void setTipe(String tipe){
        this.tipe = tipe;
    }
    
    public char getJK(){
        return JK;
    }
    
    public void setJK(char JK){
        this.JK = JK;
    }
    
    protected abstract void DaftarKaryawan();
    protected abstract void DaftarResepsionis();
}
