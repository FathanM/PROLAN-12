pada program hotl ini , terdapat 3 kelas pewarisan:
-class kakek : Karyawan..
	
	atribut = ID, Nama, Alamat, Tgl, Umur, JK
	method  = Tampil, TambahData, TambahUmur, TambahJK

-class bapak : Resepionis.
	
	atribut baru= ID , Jadwal
	method baru = TambahJadwal, Tampil, DaftarKaryawan, DaftarResepsionis
	
-class anak  : MainHotel.
    
	atribut baru= Nama, WktCI, WktCO
	method baru = Tampil_t, TambahTamu

-pada kelas bapak Resepionis memiliki semua atribut dan method dari kelas kakek Karyawan,
ada penambahan atribut di Karyawan yaitu ID , dan Jadwal serta method tampil.

-karena di kelas kakek memiliki atribut ID juga , maka penggunaan atribut ID di kelas bapak Resepionis
menggunakan "super" untuk ID class Karyawan yang di pakai pada method baru "void DaftarKaryawan"

-untuk ID dan jadwal milik class Resepionis di pakai pada method baru  "void DaftarResepsionis"

-untuk method tampil juga terdapat di class Resepionis, maka untuk menggunakan method nya pakai super di 
method "void DaftarKaryawan"

-pada class anak MainHotel terdapat atribut yang sama dengan di class kakek Karyawan,yaitu Nama.
pada class MainHotel Nama digunakan  untuk penamaan tamu/pengunjung.

