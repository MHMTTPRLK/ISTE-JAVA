import java.util.ArrayList;
// Nested Class olarak isimlendirilir. (İç içe Sınıflar)
//Sadece tek bir yerde kullanılan sınıfları mantıksal olarak gruplamanın bir yoludur.
//Encapsulation (Kapsulleme) kullanımını artırır (Performans kriteri)
//Daha okunabilir ve surdurulebilir kodlara kolaylık sağlar
public class Rektorluk {
	//Rektorluk classinin x degiskeni (super x)
	public int x = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rektorluk r1 = new Rektorluk();
		Rektorluk.Fakulteler fk = r1.new Fakulteler();
        fk.Goster();

        Rektorluk r2 = new Rektorluk();
		Rektorluk.Fakulteler f = r2.new Fakulteler();
        //Rektorluk.Fakulteler f = new Rektorluk.Fakulteler(); //Hata Erisim sa�lanamaz
        f.xGoster(15);

        System.out.println("-------------------");
        System.out.println(r2.x); //Super x'e main icerisinden erisim
        System.out.println(f.x);  //sub x'e main icerisinden erisim
        System.out.println("-------------------");

	}

	public class Fakulteler{
		//Fakulteler classinin x degiskeni (Sub x)
		public int x = 10;
		public ArrayList<String> fakulteler=new ArrayList<String>();
		public void Ekle(String isim) {
			fakulteler.add(isim);
		}
		public void Goster() {
			for(String a:fakulteler) {
				System.out.println(a);
			}			
		}	

		final int deger=100;
		public void xGoster(int x) {
			//Fakulteler classinin fonksiyonu icerisindeki x degiskeni (parametre x)
            System.out.println("x (Parametre)= " + x);
            System.out.println("this.x (sub x)= " + this.x);
            System.out.println("Rektorluk.this.x (super x)= " + Rektorluk.this.x);

            //Local Class: Yerel Siniflar
            //Yerel Siniflar fonksiyon icerisinde anlik olusturulup geri destroy edilir
            class Deneme{

            }

		}

	}
	//Static siniflar sabit olarak olusturulup stack de bir sabit yer edinirler
	/* 
	 Statik ic ice gecmis bir sinif, diger ust duzey siniflar gibi, dıs sinifinin 
	 (ve diger siniflarin) ornek uyeleriyle etkilesime girer. 
	 Aslinda, statik bir ic ice gecmis sinif, ambalaj rahatligi icin baska 
	 bir ust duzey sinifta yuvalanmis ust duzey bir siniftir.
	 */
	public static class RektorlukBirimi{
		public String isim="Prof. Dr. Turkay Dereli";
		RektorlukBirimi(String isim){
			this.isim=isim;
		}
		public String getIsim() {
			return isim;
		}
	}
	//static tanimlanmazsa Ic sinif olarak adlandirilir (Inner Class)
	class DaireBaskanliklari{
		public ArrayList<String> daireler=new ArrayList<String>();
		public void Ekle(String isim) {
			daireler.add(isim);
		}
		public void Goster() {
			for(String a:daireler) {
				System.out.println(a);
			}
		}	
	}

}