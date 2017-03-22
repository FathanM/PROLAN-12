import java.util.Scanner;
class ReadInt_N{

	public static void main(String[] args) 
	{
		int N, Nilai,i,min=100,max=0;
		char pil;
		
		MaxMin tes = new MaxMin();
		Scanner input = new Scanner (System.in);
		System.out.println("\t\t============================================");
		System.out.println("\t\t|Membaca Nilai Integer Dari Data Sebanyak N|");
		System.out.println("\t\t============================================\n");
		System.out.print("Masukan Banyak Data = ");
        N = input.nextInt();
		System.out.println("\nKet :\nA = mencari nilai Minimum.\nB = mencari nilai Maksimum.\n");
		System.out.print("Masukan Pilihan (A atau B) = ");
        pil = input.next().charAt(0);
		for (i=1;i<=N;i++){		
			System.out.print("Masukan Nilai ke-"+ i +"         = ");
            Nilai = input.nextInt();
			if (pil =='A'){
				min=tes.pilihanA(Nilai,min);
			}
			if (pil == 'B'){
				max=tes.pilihanB(Nilai,max);
			}
		}
		System.out.println("\n\n==============================");
		System.out.println("|           Hasil            |");
		System.out.println("==============================");
		System.out.println("Banyak Data yang Dimasukan = " + N);
		if (pil== 'A'){
			System.out.println("Nilai minimum              = " + min);
		} else {
			System.out.println("Nilai maximum              = " + max);
		}
		System.out.println("------------------------------");
	}
}

class MaxMin{
	int pilihanA(int x, int y){
		if(x<y){
			y=x;
			return y;
		}
		return y;
	}
	
	int pilihanB(int x, int y){
		if(x>y){
			y=x;
			return y;
		}
		return y;
	}
}