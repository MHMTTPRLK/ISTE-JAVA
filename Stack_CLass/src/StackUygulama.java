//Stack sinifi Javada kutuphane olarak tanimli bir yapidir.
//Bir dizi classidir. Yani dizi islemlerini kullanabilirsiniz. Ek fonksiyonlari mevcuttur.
//Stack: FILO: First in last out
import java.util.Stack;
public class StackUygulama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index=0;
		Stack st=new Stack();
		//Stack olusturuldu:
		st.add(index,"iste");
		// belirlenen indise deger atamasý saglar:
		st.clear();
		//Stackin komple bosaltilmasini yani lambda atilmasini saglar
		st.push("mehmet");
		st.push("java");
		st.push("Ntp");
		st.push("iste");
		
		// Stack'e deger yazilmasini saglar:
		System.out.println("silinen nesne:"+st.pop());
		 // Stacktaki en ust elemani okuma ayni zamanda silme
		System.out.println("Elements after Remowe"+st);

	}

}
