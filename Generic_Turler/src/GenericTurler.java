import java.util.ArrayList;
/*
 * Tipin belirsiz oldugu durumlarda kullanilir
 * Veri yapilarinin bircok uygulamasinda kullanilabilir
 * <GenerikTipAdi> seklinde yazilir. GenerikTipAdi bir class adidir
 * Generic tiplere en guzel ornek ArrayList tanimlamalaridir
 */

class Sifreler<T>{
	public T deger;
	String algoritma="";
	void Cagir() {
		System.out.println(deger.getClass().getName());
		//deger degiskeninin hangi turde oldugunu ekrana basar
	}
	void Olustur() {
		if(deger.getClass().getName()=="java.lang.Integer") 
		{	}
		else if(deger.getClass().getName()=="java.lang.String")
		{   }
	}
}

class SifrelerKomplex<T, V>{
	//Birden fazla generic tip tanimlanabilir
	public T deger;
	public V sifreleme;
	String algoritma="";
	void Cagir(int a) {
		System.out.println(deger.getClass().getName()+" "+deger);
	}
	void Olustur() {
		if(deger.getClass().getName()=="java.lang.Integer") 
		{	int[] dizi=new int[10];}
		else if(deger.getClass().getName()=="java.lang.String")
		{   String[] dizi=new String[10];}
	}
}

class KendiTipim<T>{
	//Generik tipin tipi
	public T id;
}

class Odemeler<KendiTipim>{
	//Kendi generic tipimizi olusturduk
	public KendiTipim degiskenkendiTipim;
}


public class GenericTurler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<String> a=new ArrayList<String>();

		Sifreler<Integer> a=new Sifreler<Integer>();
		a.deger=45;
		a.Cagir();

		Sifreler<String> b=new Sifreler<String>();
		b.deger="";
		b.Cagir();	


		SifrelerKomplex<Integer,String> c=new SifrelerKomplex<>();
		//new anahtar kelimesinden sonra generic tip yazilmasi sart degildir
		//Yazilmazsa general definition(genel tanimlama) olur
		c.deger=15; c.algoritma="MD5";
		c.Cagir(6);
		Sifreler<KendiTipim> d=new Sifreler<KendiTipim>();
		//Tipin tipini cagirma
		//Class olusturulur ve tipi generic olarak tanimlanir
		Odemeler<KendiTipim<Double>> e1=new Odemeler<KendiTipim<Double>>();
		//e1.degiskenkendiTipim.id=10.5;	
		//e1.degiskenkendiTipim.id=""; //Hata verir cunku generic tipi Double

	}

}