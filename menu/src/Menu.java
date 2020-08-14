import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	int secim=0;
	int secim1=0;
	double sepet=0;
	while(1<2) {
		if(secim==3) {
			break;}
			System.out.println("(1) Bilgisayar\n (2)Telefon\n (3)Alisveriþi bitir.");
			secim=a.nextInt();
			switch(secim) {
					case 1:
						System.out.println("(1)Asus Rog 5000Tl\n(2)MSI 5500tl\n(3) Anamenü");
					secim1=a.nextInt();
					switch(secim1) {
					case 1:sepet+=5000; break;
					case 2:sepet+=5500; break;
					default: break;
					}
					break;

			case 2:
				System.out.println("(1)Iphone 2000tl\n(2)casper 2500tl\n(3) Anamenü");
				secim1=a.nextInt();
				switch(secim1) {
				case 1:sepet+=2000; break;
				case 2:sepet+=2500; break;
				default: break;
				}
				break;					
			case 3:
			System.out.println("sepet toplamýnýz"+sepet+"tl");
			break;
			default:
				System.out.println("tanýmlý bir tusa basýlmadý");
				break;
			
			}
		}
	}
	
}
