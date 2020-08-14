import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class HataAyiklama {
	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		try {
		//	System.out.println(10/0);
			File f=new File("a.txt");
			BufferedReader br=new BufferedReader(new FileReader(f));
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("Dosya hen�z olu�turulmad�");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			//Hatanin string olarak elde edilmesini sa�lar
			e.printStackTrace();
			//Hata kacinci satirda ise onunla alakal� bilgileri getirir
		}

		try {
			KendiException a=new KendiException();
			a.Yolla();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}


		KendiException b=new KendiException();
		b.CatchEdilen_Yolla();


	}
}

class KendiException extends Exception{
	void Yolla() throws Exception{
		throw new Exception();
		//Bu class i�erisinde catch edilmedi�i i�in 
		//Main fonksiyonunda catch kullan�lmal�d�r
		//Inherit edilen fonksiyon kesinlikle try-catch ile yakalanmal�d�r
	}
	void CatchEdilen_Yolla() throws Exception{
		//Bu yap� kendi i�erisinde try-catch fonksiyonu kulland��� i�in
		//Main yada inherit edilen yap�da try-catch kullan�n�ma gerek kalmaz
		try {
			Yolla();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
  
