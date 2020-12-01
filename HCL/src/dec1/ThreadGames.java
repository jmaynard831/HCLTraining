package dec1;


public class ThreadGames {

	public static void main(String[] args) {
//		Thread t = Thread.currentThread();
//		
//		t.setPriority(Thread.MAX_PRIORITY);
//		
	//	System.out.println(t);
		
		//This tech is for extends Thread style
		//ChildThread ct = new ChildThread();
		//ct.start();
		
		//this is for implements runnable style
//		ChildThread ct = new ChildThread();
//		Thread t = new Thread(ct);
//		t.run();
//		
//		Runnable x = new ChildThread();
//		Thread d = new Thread(x);
//		d.run();
		
		Counter c = new Counter();
		DaemonCounter c2 = new DaemonCounter();
		c.start();
		c2.setDaemon(true);
		c2.start();
		
//		for (int i = 10; i <= 15; i++) {
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println(i);
//		}
		
	}
	
}
