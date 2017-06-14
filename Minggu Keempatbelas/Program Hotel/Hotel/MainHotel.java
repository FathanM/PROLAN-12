package Hotel;

import Karyawan.Resepsionis;
import Karyawan.Karyawan;
import java.util.Scanner;
public class MainHotel{
         	
	public static void main(String argd[]){
                char menu;
                int n;
                Tamu vf = new Tamu();
                Resepsionis rsp = new Resepsionis();
                Kamar t = new Kamar();
                GenericBayar<Float> td= new GenericBayar<>();
                
                do {
               
                System.out.println("====Program Hotel====");
                System.out.println("A. Daftar Tamu");
                System.out.println("B. Daftar Karyawan Resepsionis");
                System.out.println("C. Daftar Kamar");
                System.out.println("D. Daftar Pembayaran");
                System.out.println("0. Keluar");
                Scanner input = new Scanner (System.in);
                System.out.print("Masukan Menu# ");
                menu = input.next().charAt(0);
                
                                
                switch (menu){
                     case 'A'|'a':
                              vf.setNama(input.nextLine());
                              System.out.print("Nama = ");
                              vf.setNama(input.nextLine());
                              System.out.print("Tanggal Lahir = ");
                              vf.setTgl(input.nextLine());
                              System.out.print("Alamat = ");
                              vf.setAlamat(input.nextLine());
                              System.out.print("Umur =");
                              vf.setUmur(input.nextInt());
                              System.out.print("Jenis Kelamin(L/P) = ");
                              vf.setJK(input.next().charAt(0));
                              System.out.print("Waktu CheckIn-CheckOut = ");
                              vf.setJam(input.nextLine());
                              vf.setJam(input.nextLine());
                              vf.tampiljudul();
                              vf.Note();
                              vf.tampildaftar();
                              vf.tampilBaris();
                              System.out.println("E. Kembali Ke Menu Utama!");
                              System.out.println("0. Keluar");
                              menu = input.next().charAt(0);
                              break;
                
                    case 'B'|'b': rsp.setID(input.nextLine());
                              System.out.print("ID Karyawan = ");
                              rsp.setID(input.nextLine());
                              System.out.print("Nama = ");
                              rsp.setNama(input.nextLine());
                              System.out.print("Alamat = ");
                              rsp.setAlamat(input.nextLine());
                              System.out.print("Tanggal Lahir = ");
                              rsp.setTgl(input.nextLine());
                              System.out.print("Jenis Kelamin = ");
                              rsp.setJK(input.next().charAt(0));
                              System.out.print("Umur = ");
                              rsp.setUmur(input.nextInt());
                              System.out.print("Jadwal Piket = ");
                              rsp.setJadwal(input.nextLine());
                              rsp.setJadwal(input.nextLine());
                              
                              rsp.tampiljudul();
                              rsp.Note();
                              rsp.tampildaftar();
                              rsp.tampilBaris();
                              System.out.println("E. Kembali Ke Menu Utama!");
                              System.out.println("0. Keluar");
                              menu = input.next().charAt(0);
                              break;       
                  
                case 'C'|'c': t.setNo(input.nextLine());
                              System.out.print("Nomor Kamar = ");
                              t.setNo(input.nextLine());
                              System.out.print("Luas Kamar = ");
                              t.setLuas(input.nextFloat());
                              System.out.print("Fasilitas = ");
                              t.setFasilitas(input.nextLine());  
                              t.setFasilitas(input.nextLine());  
                              
                              t.tampiljudul();
                              t.tampildaftar();
                              t.tampilBaris();
                              System.out.println("E. Kembali Ke Menu Utama!");
                              System.out.println("0. Keluar");
                              menu = input.next().charAt(0);
                              break;
                              
                 case 'D'|'d': td.setNokmr(input.nextLine());
                              System.out.print("Nomor Kamar = ");
                              td.setNokmr(input.nextLine());
                              System.out.print("Harga = ");
                              td.setharga(input.nextFloat()); 
                              System.out.print("Lama Sewa = ");
                              td.setLama(input.nextInt()); 
                              
                              td.setBayar((td.HargaKmr*td.Lamasewa)-(td.Diskon*td.HargaKmr));
                              td.tampiljudul();
                              td.tampildaftar();
                              td.tampilBaris();
                              System.out.println("E. Kembali Ke Menu Utama!");
                              System.out.println("0. Keluar");
                              menu = input.next().charAt(0);
                              break;
                
                } 
                } while (menu == 'E'| menu=='e');
	}
}