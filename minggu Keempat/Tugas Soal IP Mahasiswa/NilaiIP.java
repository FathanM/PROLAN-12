import java.util.Scanner;
class NilaiIP
{
	 public static void main(String[] args) 
    {
		NilaiIP ipmhs = new NilaiIP();
		
		Scanner input = new Scanner (System.in);
		float IP;
		float JumIp = 0;
		int jmlMhs =0, Mhslls = 0, Tdklls = 0, IpAbaikan = 0;
		
		System.out.print("Masukan Nilai IP: ");
        IP = input.nextFloat();
		
		while (IP != -999)
		{
			if (ipmhs.isWithinRange(IP, 0, 4) == 1){
				jmlMhs++;
			} else {
				IpAbaikan++;
			} 
			if (IP >= 2.75){
				Mhslls++;
			} 
			if (IP >= 0 && IP <= 2.75){
				Tdklls++;
			}
				if( IP>=0 && IP <=4)
			{
				JumIp=JumIp+IP;
			} else {
				System.out.println("Tidak ada data!");
			}
			System.out.print("Masukan Nilai IP: ");
			IP = input.nextFloat();
				
			
		}
				
		System.out.println("Jumlah  Mahasiswa: " + jmlMhs);
		System.out.println("Jumlah  IP yang diabaikan: " + IpAbaikan);
		System.out.println("Jumlah  Mahasiswa lulus adalah: " + Mhslls);
		System.out.println("Jumlah  Mahasiswa tidak lulus adalah: " + Tdklls);
		System.out.println("IP  Rata-rata: " +ipmhs.Rata_rata(JumIp, jmlMhs));
    }	
	
	int isWithinRange(float X, int min, int max)
	{
		if (X >= min && X <= max)
		{
			return 1;
		} else {
			return 0;
		}
	}
    

	float Rata_rata(float A, int N)
	{
		return A/N;
	}
}