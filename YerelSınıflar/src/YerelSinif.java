public class YerelSinif {
//Local CLass
    static String regularExpression = "[^0-9]";

    public static void TelefonDogrula(String tlfno) {      

        final int numaraUzunluk = 10;        
        // JDK 8 ve sonraki surumlerde gecerlidir
        //Onceki versiyonlarda yalnizca fonksiyon icerisinde erisim vardi
        //Artik fonksiyon icerisinde tanimlanan class icinden de erisilebilir
        // int numaraUzunluk = 10;

        //Yerel sinif (Fonksiyon icerisinde tanimlanir.
        //Fonksiyonun isi bittiginde RAM uzerinden geri silinir
        class TelefonNumarasi {            
            String sonHaliTlfNo = null;
            TelefonNumarasi(String tlfno){
                // numaraUzunluk = 7;
                String temizlenenNumara = tlfno.replaceAll(regularExpression, "");
                //Telefon icerisinde girilen 0-9 arasi sayilarin haricindekileri siler
                if (temizlenenNumara.length() == numaraUzunluk)
                	sonHaliTlfNo = temizlenenNumara;
                else
                	sonHaliTlfNo = null;
            }
            public String getNumber() {
                return sonHaliTlfNo;
            }            
            // JDK 8 ve sonraki surumlerde gecerlidir 
            // Asagidaki tlfno dogrudan Fonksiyonun parametresi olan tlfdur.
            // Onceki versiyonlarda erisim saglanamzken yeni JDKlarda erisim mevcut
             public void numaraGoster() {
                 System.out.println("Orjinal numara: " + tlfno);
             }
        }

        TelefonNumarasi myNumber1 = new TelefonNumarasi(tlfno);        
        // JDK 8 ve sonraki surumlerde gecerlidir
         //myNumber1.numaraGoster();

        if (myNumber1.getNumber() == null) 
            System.out.println("Telefon numarasi Gecersiz");
        else
            System.out.println("Telefon numarasi: " + myNumber1.getNumber());

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TelefonDogrula("(544)544 05 44");
		TelefonDogrula("544-544-0544");
		TelefonDogrula("456-7890");
	}

}