import java.util.Scanner;
public class Toplam {

	public static void main(String[] args) {
	 Scanner al=new Scanner(System.in);
	 double s1,s2;
	  System.out.println("Birinci sayý giriniz");
	  s1=al.nextDouble();
	  System.out.println("Ýkinci sayý giriniz");
	  s2=al.nextDouble();
	  System.out.println("Bir Ýþlem seçiniz 1+,2-,3*,4/");
	int  secim=al.nextInt();
	  switch(secim)
	  {
	  case 1:
		  System.out.println("Toplam sonucunuz="+(s1+s2)+"dir");
	  break;
	  case 2:
		  System.out.println("Çýkarma sonucunuz="+(s1-s2)+"dir");
		  break;
	  case 3:
		  System.out.println("Çarpým sonucunuz="+(s1*s2)+"dir");
		  break;
	  case 4:
		  System.out.println("Bölüm sonucunuz="+(s1/s2)+"dir");
		  break;
		  default:
			  System.out.println("Yanlýþ seçtiniz");
			  break;
	  }

	}

}
