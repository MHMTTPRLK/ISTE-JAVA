
public class StatikDegisken {
	public static int x=0;
	public int y=0;
	public static void main(String[] args) {
	 StatikDegisken sd1=new StatikDegisken();
	 StatikDegisken sd2=new StatikDegisken();
	 x=10; System.out.println(x);
	 // statik tanimlanan bir degisken RAM uzerinde sabit 
		// bir adreste tutuldugu icin ayni siniftan uretilen
		// diger nesnelerde ayni adrese gore islem yapar
	 sd1.x=15; System.out.println(x); //x=15
	 sd1.y=18; //System.out.println(sd2.y);
	 sd2.x=20; System.out.println(x); //x=20
	 sd2.y=35; System.out.println(sd1.y);
	// Uretilen degisken public olarak tanimlanmis olsa 
			// bile yalnizca kendi icerisinden uretilen nesneden
			// erisim saglanir	

			// Main fonksiyonu icerisinden dogrudan y degiskenine
			// Erisim bulunmamaktadır. sebebi Class icerisinde public
			// olarak tanımlı da olsa henuz construct edilmems olmasidir

	}

}
