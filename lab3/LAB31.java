import java.util.*;
public class LAB31 {
public String addString(String s) {
	String m=s+s;
	return m;
}
public String replace(String s) {
	char ch[]=s.toCharArray();
	for(int i=0;i<s.length();i++) {
		if(i%2!=0)
			ch[i]='#';
	}
	String m=new String(ch);
	return m ;
}
public String remove(String s) {
	int rtn;
	String m="";
	for(int i=0;i<s.length();i++) {
	char c=s.charAt(i);
	rtn=s.indexOf(c,i+1);//ye uske back me check karega;
	if(rtn==-1) {
		m=m+c;
	}
	}
	return m;
}
public String change(String s) {
	char ch[]=s.toCharArray();
	for(int i=0;i<s.length();i++){
		if(i%2!=0) {
			ch[i]=Character.toUpperCase(ch[i]);
		}
	}
	String m=new String(ch);
	return m;
}
	
public static void main(String[] args) {
	LAB31 ob=new LAB31();
	
	System.out.println("1. Add the String to itself");
	System.out.println("2. Replace odd positions with #");
	System.out.println("3. Remove duplicate characters in the String");
	System.out.println("4. Change odd characters to upper case");
	System.out.println("Enter your choice number");
	Scanner sc=new Scanner(System.in);
	int choice=sc.nextInt();
	System.out.println("Enter the string");
	String s=sc.next();
	switch(choice) {
	case 1: String a=ob.addString(s);
			System.out.println(a);
		    break;
	case 2:String b=ob.replace(s);
			System.out.println(b);
			break;
	case 3:String c=ob.remove(s);
			System.out.println(c);
			break;
	case 4:String d=ob.change(s);
		   System.out.println(d);
		   break;
	default:System.out.println("enter a wrong choices");
		    break;
	}
}
}
