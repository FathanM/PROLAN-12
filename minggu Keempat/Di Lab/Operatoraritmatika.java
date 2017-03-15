public class Operatoraritmatika
{
  public static void main(String[] args)
  {
		byte x = 5;
		byte y = 4;
		System.out.println("Hasil pertambahan x dan y adalah " + (x + y));
		System.out.println("Hasil pengurangan x dan y adalah " + (x - y));
		System.out.println("Hasil perkalian x dan y adalah " + (x * y));
		System.out.println("Hasil div x dan y adalah " + (x / y));
		System.out.println("Hasil mod x dan y adalah " + (x % y));
	
		x++;
		y--;
		System.out.println("Hasil increment x adalah " + x);
		System.out.println("Hasil decrement y adalah " + y);	
	}
}