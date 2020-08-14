
public class AbstractSinif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		General a=new General();
		a.EnUstKomutan("OHAL");
		a.Yetki();
		a.EnUstKomutan("");
		a.Yetki();

	
		//Askerler b=new Askerler();
				//Abstract classtan dogrudan nesne t�retilemez

	}

}
abstract class Askerler{
	int yas;
	public int getYAs() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas=yas;
	}
	public abstract void Yetki();
	//Abtract fonksiyonlarda herhangi bir kod blogu bulunmaz
		//Sadece isim tan�mlan� ve ; ile bitirilir	

		//Final yap�lar herhangi bir �ekilde de�i�tirilmeden i�lemini yapar
		// Kal�t�m sonras� t�retilen yeni nesnelerde override edilemez
	public final void EnUstKomutan(String durum) {
		if(durum!="OHAL") {
			System.out.println("Ordunun bas�nda genelkurmay baskan� var.");
		}
		else {
			System.out.println("ordunun bas�nda cumhurbaskan� var.");
		}
	}

}
class General extends Askerler{
	//Ust abstract class da abstract olarak tan�mlanan fonksiyonlar override edilmelidir
	@Override
	public void Yetki() {
		System.out.println("Askeriyenin en ust  emir komuta zinciridir");
	}
	//Bu k�s�m Override i�lemi de�ildir
		//Bu k�s�m Overloading i�lemidir
		//Bu y�zden abstract metotlar override edilirken dikkat edilmelidir
	public void Yetki(String a) {
		System.out.println("Yetki"+a);
	}
	/*
	void EnUstKomutan(String durum) {
		System.out.println("Askeriyenin en �st emir komuta zinciri: �STE'dir ");
		//Final tan�ml� oldugu i�in Override edilemez
	}
	*/
	
}