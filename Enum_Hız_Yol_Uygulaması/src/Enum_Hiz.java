/*
 Enum yapýsýný kullanarak ayni ve ters
yonlü tanýmlanmýþ araçlarýn hýz (v1,v2) ve 
süre (t) parametreleri için arasýndaki
mesafeyi hesaplayan py.
 */
public class Enum_Hiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ters Yonlu="+Hiz.TersYonlu.Hesapla(5, 10, 1.2));
		System.out.println("Ayný Yonlu"+Hiz.AyniYonlu.Hesapla(10, 2, 1.2));
		System.out.println("Ayný Yonlu="+Hiz.AyniYonlu.Hesapla(2, 10, 1.2));

	}

}
enum Hiz{
	TersYonlu,AyniYonlu;
	public double Hesapla(double v1,double v2,double t) {
		double sonuc=0;
		switch(this) {
		case TersYonlu:
		sonuc=(v1+v2)*t;
		break;
		case AyniYonlu:
			sonuc=(v1-v2)*t;
			break;
			}
		return sonuc;
		}
	}

