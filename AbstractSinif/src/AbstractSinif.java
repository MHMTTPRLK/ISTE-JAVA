
public class AbstractSinif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		General a=new General();
		a.EnUstKomutan("OHAL");
		a.Yetki();
		a.EnUstKomutan("");
		a.Yetki();

	
		//Askerler b=new Askerler();
				//Abstract classtan dogrudan nesne türetilemez

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
		//Sadece isim tanýmlaný ve ; ile bitirilir	

		//Final yapýlar herhangi bir Þekilde deðiþtirilmeden iþlemini yapar
		// Kalýtým sonrasý türetilen yeni nesnelerde override edilemez
	public final void EnUstKomutan(String durum) {
		if(durum!="OHAL") {
			System.out.println("Ordunun basýnda genelkurmay baskaný var.");
		}
		else {
			System.out.println("ordunun basýnda cumhurbaskaný var.");
		}
	}

}
class General extends Askerler{
	//Ust abstract class da abstract olarak tanýmlanan fonksiyonlar override edilmelidir
	@Override
	public void Yetki() {
		System.out.println("Askeriyenin en ust  emir komuta zinciridir");
	}
	//Bu kýsým Override iþlemi deðildir
		//Bu kýsým Overloading iþlemidir
		//Bu yüzden abstract metotlar override edilirken dikkat edilmelidir
	public void Yetki(String a) {
		System.out.println("Yetki"+a);
	}
	/*
	void EnUstKomutan(String durum) {
		System.out.println("Askeriyenin en üst emir komuta zinciri: ÝSTE'dir ");
		//Final tanýmlý oldugu için Override edilemez
	}
	*/
	
}