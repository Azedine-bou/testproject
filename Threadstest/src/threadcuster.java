
public class threadcuster extends Thread {
	String name ;
	Integer counter;
	threadcuster (String N ,Integer zehler){
		this.name = N;
		this.counter= zehler;
		
	}
	public void run() {
		System.out.println("starte thread :"+ name);
		synchronized (counter) {
		for(int i =0;i<10;i++) {
		try {
			Thread.sleep(100);
			System.out.println(counter++);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		System.out.println("beende thread :"+ name);
	
	}
	}

}
