package test;
import org.junit.Test;


public class ThreadTest {

  @Test
  public void testJoin(){
	  Runnable preceedUnit=new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=0;i<10;i++){
				System.out.println("Run time:"+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO: handle exception
					System.out.println("Interrupted");
					e.printStackTrace();
				}
			}
		}
	};
	Thread preceed=new Thread(preceedUnit);
	preceed.start();
	
	try {
		preceed.join();
	} catch (Exception e) {
		// TODO: handle exception
	}
	System.out.println("The end!");
  }
}
