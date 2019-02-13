import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataThread extends Thread{
	FileInputStream Fread;
	 FileOutputStream Fwrite;
   public CopyDataThread(FileInputStream fread, FileOutputStream fwrite) {
		
		Fread = fread;
		Fwrite = fwrite;
	}
	public void run()
	{
        System.out.println("File copy started"); 
        int c; 
        int count=11;
        try {
			while((c=Fread.read())!=-1) {
					
				Fwrite.write((char)c);
				if(count%10==0) {
					System.out.println("10 characters are copied!");
					Thread.sleep(5000);
				}
			count++;
			
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			Fread.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        try {
			Fwrite.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
