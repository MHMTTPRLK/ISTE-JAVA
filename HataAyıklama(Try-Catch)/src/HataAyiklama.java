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
			System.out.println("Dosya henüz oluþturulmadý");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			//Hatanin string olarak elde edilmesini saðlar
			e.printStackTrace();
			//Hata kacinci satirda ise onunla alakalý bilgileri getirir
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
		//Bu class içerisinde catch edilmediði için 
		//Main fonksiyonunda catch kullanýlmalýdýr
		//Inherit edilen fonksiyon kesinlikle try-catch ile yakalanmalýdýr
	}
	void CatchEdilen_Yolla() throws Exception{
		//Bu yapý kendi içerisinde try-catch fonksiyonu kullandýðý için
		//Main yada inherit edilen yapýda try-catch kullanýnýma gerek kalmaz
		try {
			Yolla();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
  
