import java.util.Scanner;
public class Enum1 {

	public static void main(String[] args) {
	 Scanner al=new Scanner(System.in);
	 System.out.println("Gokhan url için 1\n Iste url için 2");
	 int secim=al.nextInt();
	 switch(secim) {
	 case 1:
		 System.out.println(Whois.Gokhan.urlGoster());
		 break;
	 case 2:
		 System.out.println(Whois.ISTE.urlGoster());
		 break;
		 default :
			 System.out.println("Null!!!!!!!!!!");
			 break;
	 }
		
	}

}
enum Whois{
	Gokhan("www.gohkanaltan.com"),ISTE("www.iste.edu.tr"),AramaMoturu("www.google.com");
	private String url="";
	Whois(String url){
		this.url=url;
	}
	public String urlGoster() {
		return url;
				
	}
}
