import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileProgram {

	public static void main(String[] args) throws FileNotFoundException {
		 FileInputStream Fread =new FileInputStream("source.txt"); 
	        FileOutputStream Fwrite=new FileOutputStream("Target.txt") ; 
		CopyDataThread obj=new CopyDataThread(Fread,Fwrite);
		obj.start();
		
		
		
	}
	
	
	
	
	
	
	
}
