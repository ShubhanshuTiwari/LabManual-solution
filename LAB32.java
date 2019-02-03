import java.util.*;
public class LAB32 {
	
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String s=sc.nextLine();
	int flag=1;
	char ch[]=s.toCharArray();
	for(int i=0;i<s.length()-1;i++) {
		if(ch[i]>ch[i+1]) {
			flag=0;
			break;
		}
	}
	if(flag==1)
		System.out.println("Positive");
	else
		System.out.println("Negative");
}
}
