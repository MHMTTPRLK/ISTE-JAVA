public class EnumYapisi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Carpým="+Islemler.Carp.Hesapla(10, 12));
		System.out.println("Toplam="+Islemler.Topla.Hesapla(10, 12));
		System.out.println("Fark="+Islemler.Cikar.Hesapla(10, 12));
		System.out.println("Bolme="+Islemler.Bol.Hesapla(10, 12));
		
	}
}

enum Islemler{
	Topla, Cikar, Carp, Bol;
	public double Hesapla(double sayi1, double sayi2) {
		double sonuc=0;
		switch(this) {
		case Topla:
			sonuc= sayi1+sayi2;
			break;
		case Cikar:
			sonuc= sayi1-sayi2;
			break;
		case Carp:
			sonuc= sayi1*sayi2;
			break;
		case Bol:
			sonuc= sayi1/sayi2;
			break;
		}
		return sonuc;

	}
}