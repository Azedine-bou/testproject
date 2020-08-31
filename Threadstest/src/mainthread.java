
public class mainthread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Integer counter =0;
threadcuster m1 = new threadcuster("Erste Thread",counter);
threadcuster m2 = new threadcuster("Zweite Thread",counter);
m1.start();

m2.start();
     
   
	}
}
