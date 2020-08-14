
public class GarbageCollector {

	public static void main(String[] args) {
		for(int y=0;y<10;y++)
		{
			Uret a=new Uret(y);
			
		}//GarbageCollector 
		
		System.gc();
		for(int y=10;y<20; y++) {
			Uret a=new Uret(y);
		}
	}

}

 class Uret{
	 int i=0;
	 Uret(int y){
		 this.i=y;
		 System.out.println("Obje olþturuldu"+(i+1));
	 }
	 public void finalize() {
		 System.out.println("Obje silindi"+(i+1));
	 }
 }