package lab8_2;

import java.io.IOException;

public class Lab8_2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		int i=0; 
		while(true) {
			 System.out.print(i);
			System.out.print("rahul");
			   try {
				Thread.sleep(1000);
			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 if(i==10) {
				 i=0;
			 }
			 i++;
		 }
		
	}
}
