import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.TimeZone;

public class lab36 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter ur time zone id");
	String userid=sc.nextLine();
	TimeZone t=TimeZone.getTimeZone(userid);
	System.out.println(t);
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss Z");
	 Date datetime = new Date(0);
	  sdf.setTimeZone(TimeZone.getTimeZone(userid));

      System.out.println("your time::: "+ sdf.format(datetime));
}
}
