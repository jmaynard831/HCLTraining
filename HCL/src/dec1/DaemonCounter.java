package dec1;

public class DaemonCounter extends Thread {

	
	public void run() {
		for(int x=1; x<=5; x++) {
			try {
				Thread.sleep(1200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(x);
		}
	}
}