/*
  dizi2.length: Eleman Sayýsý
  System.arraycopy(dizi2, 0, dizi1, 0, 3);
  //dizi2'nin 0.indisinden baslayarak 3 elemani dizi1e kopyala
  Arrays.sort(dizi1);
  //Dizinin tumunu sýralar (A-Z)
  Arrays.sort(dizi1,2,5);
  //Dizinin 2.indisi ile 5.indisi arasindakileri sýralar (A-Z)
  Arrays.fill(dizi1, 2,4, 100);
  //Dizinin 2. indisten 4.indise kadar 100 degeri atama
  Arrays.equals(dizi1, dizi2)); 
  //dizi1 ve dizi2 nin esit olup olmadigina bakar: true ya da false donderir	
  Arrays.binarySearch(dizi1, 23));
  //23 sayýsýnýn dizi1'de olup olmadigini kontrol eder
  //Varsa kacinci indiste oldugunu getirir yoksa -1
 */
import java.util.Arrays;
public class Diziler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] dizi1=new int[10];
		int[] dizi2= {1,44,23,56,78,100,100,100,120};
		int[] dizi3;
		dizi3=new int[10];
		//Diziler boyle  tanýmlanabilir.
		Arrays.sort(dizi1);
		//Dizinin tumunu sýralar (A-Z)
	 for(int sayi: dizi1) {
			System.out.println(sayi+" ");
		}
System.out.print("*******************\n");
		
		
		
		
		for(int i=0;i<dizi2.length;i++) {
			System.out.println(dizi2[i]+"");
			//Dizler sýralndý
		}
		System.out.print("*******************\n");
		for(int sayi:dizi2)
		{
			System.out.println(sayi+"");
			//diziler foreach ile sýralandý.
		}
		System.out.print("*******************\n");
		int elemanSayisi=dizi2.length;
		System.out.println("Dizi2 uzunlugu="+elemanSayisi);
		System.out.print("*******************\n");
		System.out.println(Arrays.binarySearch(dizi2,100));
		//100 sayisi birden fazla sayýda varsa enson indisini getirir
		//Yoksa -1 donderir
		System.out.print("*******************\n");
		System.arraycopy(dizi2, 0, dizi1, 0, 5);	
		//Dizi2'nin 0.indisinden baslayarak 3 elemani dizi1'e 
		//0.indisinden baslayarak kopyala
		//arraycopy(KopyalanacakDizi, kactanBasla, 
		//       YeniDizi, kactanBasla, kacElemanKopyalanacak)
		for(int sayi:dizi1) {
			System.out.println(sayi);

		}
		System.out.print("*******************\n");
		Arrays.sort(dizi2,2,7);
		//Dizinin 2.indisi ile 7.indisi arasinddakileri sýralar (A-Z)
		for(int sayi:dizi2) {
			System.out.println(sayi+"");
		}
		System.out.print("*******************\n");
		Arrays.fill(dizi1,2,3,100);
		//Dizinin 2. indisten 4.indise kadar 100 degeri atama
				//Varsayýlan olarak degerlendirir arammalarda erisemez
		for(int sayi:dizi1) {
			System.out.println(sayi+"");
		}
		System.out.print("*******************\n");
		System.out.println(Arrays.equals(dizi1, dizi2));
		//dizi1 ve dizi2 nin esit olup olmadigina bakar
				//true ya da false donderir
		System.out.print("*******************\n");
		System.out.println(Arrays.binarySearch(dizi1,23));
		// sayýsýnýn dizi1'de olup olmadigini kontrol eder
				//Varsa kacinci indiste oldugunu getirir yoksa -1
		System.out.print("*******************\n");
		int [][] cokboyut=new int[5][5];
		int []cokboyut2= {1,2,100,150};
		
		Arrays.sort(cokboyut2);
		for(int sayi:cokboyut2) {
			System.out.println(sayi+"");
		}
}
}
