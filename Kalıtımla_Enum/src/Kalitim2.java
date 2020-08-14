
public class Kalitim2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hayvan a=new Hayvan();
		//a.Goster();
		Kuslar a=new Kuslar(5);
		a.Goster();
		a.KusGoster();
		a.protecteddegisken=1;
		a.publicdegisken=1;
		a.a=1;  //Default degisken erisim
		//a.privatedegisken erisilemez
	}
}
class Hayvan{

	public double agirlik=0;
	public String aile="";
	int a=5; //Default degisken tanimlama
	public int publicdegisken=0;
	protected int protecteddegisken=0;
	private int privatedegisken=0;
	Hayvan(){
		this.agirlik=0;
		this.aile="Hayvan";
		System.out.println("Hayvan Kurucu Çalýþtý");
	}

	Hayvan(int agirlik){
		//this();   //Parametresiz kurucu fonksiyonu cagirir
		this("deneme"); //String parametreli kurucu fonksiyonu cagirir
		this.agirlik=agirlik; 
		this.aile="Hayvan";
		//this.agirlik class icerisindeki agirlik degeri
		//agirlik ise fonksiyona parametre olarak gelen deger
	}
	Hayvan(String aile){
		this.agirlik=0; 
		this.aile=aile;
	}
	Hayvan(String aile, int agirlik){
		this.agirlik=agirlik; 
		this.aile=aile;
	}
	public void Goster() {
		System.out.println("Aile:"+this.aile + "--- Agirlik:"+this.agirlik);
	}	
	public double GetAgirlik() {
		return this.agirlik;
	}
}

class Kuslar extends Hayvan{
	Kuslar(int agirlik){
		this.aile="Kuslar";
		this.agirlik=agirlik;
		System.out.println("Kuslar Kurucu Çalýþtý");
	}
	//@Override
	public void KusGoster() {
		//System.out.println("Aile:"+this.aile + "--- Agirlik:"+this.agirlik);
		super.Goster();
	}	
}