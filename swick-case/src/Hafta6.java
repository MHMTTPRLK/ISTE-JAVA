import java.util.Scanner;
public class Hafta6 {

	public static void main(String[] args) {

   Scanner al=new Scanner(System.in);
   System.out.println("1-3 aras�nda bir say� se�iniz:::");
   int secim=al.nextInt();
   switch(secim)
   {
   case 1:
	   System.out.println("1 e bas�ld�");
	   break;
	   
   case 2:
	   System.out.println("2 e bas�ld�");
	   break;
   case 3:
	   System.out.println("3 e bas�ld�");
	   break;
	   default :
		   System.out.println("Tan�ml� olmayan bir say� se�tiniz");
		   break;
   }
	}

}
