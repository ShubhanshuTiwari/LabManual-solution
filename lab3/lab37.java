import java.util.Scanner;


public class lab37 {
	public String check(String s) {
		
		if(s.charAt(s.length()-1)!='_') {
			return ("Invalid");
			
		}
	
		if(s.length()<9)
			return ("Invalid");
		return "valid";
	}

	
	
	
public static void main(String[] args) {
	lab37 ob=new lab37();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name ");
	String s=sc.nextLine();
	String res=ob.check(s);
	System.out.println(res);
	
}
}
