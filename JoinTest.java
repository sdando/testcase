package test;

import java.lang.Thread;

public class JoinTest implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Runnable threadRun=new JoinTest();
        Thread demo=new Thread(threadRun,"demo thread");
        demo.start();
        for(int i=0;i<20;i++){
        	if(i>10){
        		try {
        			demo.join();
				} catch (Exception e) {
					// TODO: handle exception
				}       		
        	}
        	System.out.println("main is runing,counters: "+i);
        }
	}

}
