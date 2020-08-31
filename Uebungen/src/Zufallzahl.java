import java.util.Random;

public class Zufallzahl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random= new Random();
		int a=0;
      System.out.println("Zufallzahl:");
      for (int i=10;i<30;i++) {
    	  a = random.nextInt();
    	  
      }
      if (a>20)
      System.out.println("a ist grosser "+a);
      if(a<20)  System.out.println("a ist klein "+a);
	}

}
