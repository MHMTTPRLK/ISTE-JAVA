import java.util.Scanner;
public class Kalitim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner al=new Scanner(System.in);
		System.out.println("Etcil(1)\n Aslan(2)\n Bal�k(3)");
		int secim=al.nextInt();
		switch(secim) {
		case 1:
		 Etcil b=new Etcil();
          b.Beslenme();
          b.CeneYapisi();
        
          b.Solunum();
          b.YasadigiYer(); 
          break;
		case 2:
			Aslan a=new Aslan();
			a.Beslenme();
			a.CeneYapisi();
			a.Solunum();
			a.YasadigiYer();
			break;
		case 3:

			Balik c=new Balik();
			c.Beslenme();
	        c.CeneYapisi();
	        c.Solunum();
	        c.YasadigiYer();
	        break;
	        default:
	        	 Otcul d=new Otcul();
	             d.Beslenme();
	             d.CeneYapisi();
	           
	             d.Solunum();
	             d.YasadigiYer(); 
			break;
		}
		 

		
		}

}

class Hayvan{
	public Hayvan() {
		System.out.println("Kurucu fonksiyon olustu");
		//?? void olustu mu???? set ve get 
	}
	
	public void Beslenme() {
		System.out.println("Her Hayvan beslenir");
	}
	public void YasadigiYer() {
		System.out.println("Her Havada-Karada-Suda ya�ar");
	}
	public void Solunum() {
		System.out.println("Her Hayvan nefes alir");
	}
	public void CeneYapisi() {
		System.out.println("Her hayvan acilip kapanan ceneye sahiptir");
	}
}

class Etcil extends Hayvan{
	@Override
	public void Beslenme() {
		System.out.println("Hayvanlar etle beslenir");
	}
	@Override
	public void CeneYapisi() {
		System.out.println("Kesici dislerden olusur");
	}
	public void MideYapisi() {
		System.out.println("Tek b�lmeden olusan Mide");
	}
}

class Otcul extends Hayvan{
	@Override
	public void Beslenme() {
		System.out.println("Hayvanlar otla beslenir");
	}
	@Override
	public void CeneYapisi() {
		System.out.println("���t�c� dislerden olusur");
	}
	public void MideYapisi() {
		System.out.println("D�rt b�lmeden olusan Mide");
	}
}

class Balik extends Otcul{
	@Override
	public void Beslenme() {
		System.out.println("Bal�klar otla-etle beslenir");
	}
	@Override
	public void CeneYapisi() {
		System.out.println("Par�alay�c� dislerden olusur");
	}
	@Override
	public void Solunum() {
		System.out.println("Solunga� solunumu yaparlar");
	}
	@Override
	public void YasadigiYer() {
		System.out.println("Suda yasarlar");
	}
}
class Aslan extends Etcil{
	@Override
	public void Beslenme() {
		System.out.println("aslanlar etle beslen�r");
	}
	@Override
	public void CeneYapisi() {
		System.out.println("kesici di�lere sahiptir");
	}
	@Override
	public void Solunum() {
		System.out.println("akciger solunumu yaparlar");
	}
	@Override
	public void YasadigiYer() {
		System.out.println("karada yasarlar");
	}
}
