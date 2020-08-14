//Role play: Rol atama uygulamasi
//NTP esnekliginde bir nesneye farkli roller atamak mumkundur.
//Bu durumun saglanmasi icin olusturulan ana classtan extend edilen alt classlar 
// new anahtar kelimesiyle yeniden turetilmelidir


//Devam Durumuyla alakali rol atamak icin olusturulan abstract class
abstract class DevamDurumu{
	public abstract boolean Devam();
	int devamsizlik;
}

class sosyalSorumluluk extends DevamDurumu{
	//Sosyal sorumluluk projesinde devamsizlik 15 e kadar degerlendirildi
	@Override
	public boolean Devam() {
		if(devamsizlik>15) return true;
		else return false;
	}

	public void DevamsizliktanKalmaDurumuYazdir() {
		if(Devam()) {
			System.out.println("Devamsizliktan Kaldiniz");
		}
		else {
			System.out.println("Devamsizlik hakkýnýz var");
		}
	}

}

class Tamzamanli extends DevamDurumu{
	//Tamzamanli ogrenci 10 saatten az ise devamlidir
	@Override
	public boolean Devam() {
		if(devamsizlik>10) return true;
		else return false;
	}

	public void DevamsizliktanKalmaDurumuYazdir() {
		if(Devam()) {
			System.out.println("Devamsizliktan Kaldiniz");
		}
		else {
			System.out.println("Devamsizlik hakkýnýz var");
		}
	}
}

//Egitim durumuyla alakali rol atamak icin olusturulan sinif
abstract class Egitim{
	public abstract boolean mezuniyet(double notum);
}

class lisans extends Egitim{
	//Lisans seviyesinde mezuniyet icin not ortalamasi 2.00 olmalidir
	//Not durumu ust siniftan erisimle saglanabilecegi gibi 
	//Parametre olarak da gonderilebilir
	@Override
	public boolean mezuniyet(double notum) {
		if(notum>=2) return true;
		else return false;
	}
}

class lisansustu extends Egitim{
	//Lisansustu seviyesinde mezuniyet icin not ortalamasi 2.00 olmalidir
	@Override
	public boolean mezuniyet(double notum) {
		if(notum>=2.5) return true;
		else return false;
	}
}

class ogrenci{

	int ogrno;
	String isim;
	//Egitim classindan roller kullanmak icin
	Egitim egitimSeviyesi;
	//Devam durumunun takibi icin roller atandi
	DevamDurumu devamRolu;

}

public class RolePlayer {

	public static void main(String[] args) {

		ogrenci hamdi=new ogrenci();

		hamdi.devamRolu=new sosyalSorumluluk();		
		//Olusturulan hamdi isimli nesneye devamRolu rollerinden
		//sosyalSorumluluk rolu atandi
		hamdi.devamRolu.devamsizlik=13;
		System.out.println("Hamdi isimli öðrenci devamsizliktan kaldi mi:"+hamdi.devamRolu.Devam());

		hamdi.devamRolu=new Tamzamanli();
		//Olusturulan hamdi isimli nesneye devamRolu rollerinden
		//Tamzamanli rolu atandi
		hamdi.devamRolu.devamsizlik=13;
		System.out.println("Hamdi isimli öðrenci devamsizliktan kaldi mi:"+hamdi.devamRolu.Devam());

		//Olusturulan hamdi isimli nesneye egitimSeviyesi rollerinden
		//lisans rolu atandi
		hamdi.egitimSeviyesi=new lisans();
		System.out.println("Hamdi isimli öðrenci mezun olabilir mi:"+hamdi.egitimSeviyesi.mezuniyet(2.20));

		//Olusturulan hamdi isimli nesneye egitimSeviyesi rollerinden
		//lisansustu rolu atandi
		hamdi.egitimSeviyesi=new lisansustu();
		System.out.println("Hamdi isimli öðrenci mezun olabilir mi:"+hamdi.egitimSeviyesi.mezuniyet(2.20));

		//hamdi.devamRolu.DevamsizliktanKalmaDurumuYazdir(); 
		//Bu fonksiyona hali hazirda devamRolu icerisinde olusturulan bir
		// fonksiyon olsa da erisim gerceklesemez
		// Cunku hamdi.devamRolu=new sosyalSorumluluk(); islemi
		// Sadece ust classtan belirlenen rol atanmasini saglar
		// Bu fonksiyona erismek icin bir nesne olarak ayrica turetilmelidir
		// Fakat bu durum Inheritance a girer bir Rol atamasi degildir

		sosyalSorumluluk yeni=new sosyalSorumluluk();
		yeni.devamsizlik=10;
		yeni.DevamsizliktanKalmaDurumuYazdir();

	}

}