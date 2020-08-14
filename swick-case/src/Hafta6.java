import java.util.Scanner;
public class Hafta6 {

	public static void main(String[] args) {

   Scanner al=new Scanner(System.in);
   System.out.println("1-3 arasýnda bir sayý seçiniz:::");
   int secim=al.nextInt();
   switch(secim)
   {
   case 1:
	   System.out.println("1 e basýldý");
	   break;
	   
   case 2:
	   System.out.println("2 e basýldý");
	   break;
   case 3:
	   System.out.println("3 e basýldý");
	   break;
	   default :
		   System.out.println("Tanýmlý olmayan bir sayý seçtiniz");
		   break;
   }
	}

}
