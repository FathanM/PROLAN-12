package Hotel;

import Karyawan.Resepsionis;
import Karyawan.Karyawan;
import java.util.Scanner;
public class MainHotel{
         	
	public static void main(String argd[]){
                char menu;
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
                     case 'A':
                              do{
                              System.out.println("====Daftar Tamu====");
                              System.out.println("1. Masukan Data Pengunjung");
                              System.out.println("2. Tampil Daftar Pengunjung");
                              System.out.println("E. Kembali Ke Menu Utama");
                              System.out.print("Masukan Menu# ");
                              menu = input.next().charAt(0);
                              switch (menu){
                              case '1':
                                vf.setNama(input.nextLine());
                                System.out.print("Nama = ");
                                vf.setNama(input.nextLine());
                                System.out.print("Tanggal Lahir = ");
                                vf.setTgl(input.nextLine());
                                System.out.print("Alamat = ");
                                vf.setAlamat(input.nextLine());
                                System.out.print("Umur = ");
                                vf.setUmur(input.nextInt());
                                System.out.print("Jenis Kelamin(L/P) = ");
                                vf.setJK(input.next().charAt(0));
                                System.out.print("Waktu CheckIn-CheckOut = ");
                                vf.setJam(input.nextLine());
                                vf.setJam(input.nextLine());
                                System.out.println("0. Kembali");
                                System.out.print("Masukan Menu# ");
                                menu = input.next().charAt(0);
                                break;
                              case '2':
                                vf.tampiljudul();
                                vf.Note();
                                vf.tampildaftar();
                                vf.tampilBaris();
                                System.out.println("0. Kembali!");
                                System.out.print("Masukan Menu# ");
                                menu = input.next().charAt(0);
                              }
                              
                              }while(menu=='0');
                              break;
                              
                
                    case 'B': 
                              do{
                              System.out.println("====Daftar Karyawan Resepsionis====");
                              System.out.println("1. Masukan Data Karyawan");
                              System.out.println("2. Tampil Daftar Karyawan");
                              System.out.println("E. Kembali Ke Menu Utama");
                              System.out.print("Masukan Menu# ");
                              menu = input.next().charAt(0);
                              switch (menu){
                              case '1':
                              rsp.setID(input.nextLine());
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
                              System.out.println("0. Kembali");
                              System.out.print("Masukan Menu# ");
                              menu = input.next().charAt(0);
                              break;
                              case '2':
                              rsp.tampiljudul();
                              rsp.Note();
                              rsp.tampildaftar();
                              rsp.tampilBaris();
                              System.out.println("0. Kembali");
                              System.out.print("Masukan Menu# ");
                              menu = input.next().charAt(0);
                              }
                              }while(menu=='0');
                              break;       
                  
                     case 'C': 
                              do{
                              System.out.println("====Daftar Kamar====");
                              System.out.println("1. Masukan Data Kamar");
                              System.out.println("2. Tampil Daftar Kamar");
                              System.out.println("E. Kembali Ke Menu Utama");
                              System.out.print("Masukan Menu# ");
                              menu = input.next().charAt(0);
                              switch (menu){
                              case '1':
                              t.setNo(input.nextLine());;
                              System.out.print("Nomor Kamar = ");
                              t.setNo(input.nextLine());
                              System.out.print("Luas Kamar = ");
                              t.setLuas(input.nextFloat());
                              System.out.print("Fasilitas = ");
                              t.setFasilitas(input.nextLine());  
                              t.setFasilitas(input.nextLine());  
                              System.out.println("0. Kembali");
                              System.out.print("Masukan Menu# ");
                              menu = input.next().charAt(0);
                              break;
                              case '2':
                              t.tampiljudul();
                              t.tampildaftar();
                              t.tampilBaris();
                              System.out.println("0. Kembali");
                              System.out.print("Masukan Menu# ");
                              menu = input.next().charAt(0);
                              }
                              }while(menu=='0');
                              break;
                              
                     case 'D': 
                              do{
                              System.out.println("====Daftar Pembayaran====");
                              System.out.println("1. Masukan Pembayaran");
                              System.out.println("2. Tampil Daftar Bayar");
                              System.out.println("E. Kembali Ke Menu Utama");
                              System.out.print("Masukan Menu# ");
                              menu = input.next().charAt(0);
                              switch (menu){
                              case '1':
                              td.setNokmr(input.nextLine());
                              System.out.print("Nomor Kamar = ");
                              td.setNokmr(input.nextLine());
                              System.out.print("Harga = ");
                              td.setharga(input.nextFloat()); 
                              System.out.print("Lama Sewa = ");
                              td.setLama(input.nextInt());
                              td.setBayar((td.HargaKmr*td.Lamasewa)-(td.Diskon*td.HargaKmr));
                              System.out.println("0. Kembali");
                              System.out.print("Masukan Menu# ");
                              menu = input.next().charAt(0);
                              break;
                              case '2':
                              td.tampiljudul();
                              td.tampildaftar();
                              td.tampilBaris();
                              System.out.println("0. Kembali");
                              System.out.print("Masukan Menu# ");
                              menu = input.next().charAt(0);
                              }
                              }while(menu=='0');
                              break;
                
                } 
                } while (menu == 'E'| menu=='e');
	}
}