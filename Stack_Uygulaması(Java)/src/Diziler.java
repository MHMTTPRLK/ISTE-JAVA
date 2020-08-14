

//Otomatlarda anlatýlan PDA icin stack uygulamasi.
//PDA icin pop isleminde stacktan en ustteki deger silinmeli
//ancak bu uygulamada yalnizca deger gonderme ve deger okuma gerceklestiriliyor 
public class Diziler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st1 = new Stack();
	    Stack st2 = new Stack(); 

	    // stack’a sayi yolla

	    for(int i=0; i<10; i++) st1.push(i);
	    for(int i=10; i<20; i++) st2.push(i); 

	    // stack’tan sayi cek
	    System.out.println("Stack (st1):");
	    for(int i=0; i<10; i++)
	       System.out.println(st1.pop());

	    System.out.println("Stack (st2):");
	    for(int i=0; i<10; i++)
	       System.out.println(st2.pop());


	    // top ve stk[] private bir degisken ve dizi oldugundan erisilemez
	    // st1.top = -2;	    
	    // st2.stk[3] = 100;
		
		
	}

}
class Stack {

	  private int stk[] = new int[10];
	  private int top;
	  // stack’ýn kurucu fonskiyonu:(top) icin ilk deger atar
	  // diziler 0.indexten basladigi icin -1 verildi
	  Stack() {
	    top = -1;
	  }
	 // stack icine bir deger atar
	  void push(int item) {
	    if(top==9)
	      System.out.println("Stack doldu.");
	    else
	      stk[++top] = item;
	  } 

	 // stack’tan bir öge ceker
	  int pop() {
	    if(top < 0) {
	      System.out.println("Stackte yer var.");
	      return 0;
	    }
	    else
	      return stk[top--];
	  }

	}
