import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class lab33 {
 public static void main(String[] args) {
	 LocalDate date =LocalDate.now();
		System.out.println("Current date"+date);
		System.out.println("Enter date in the format(dd/mm/yyyy)");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dt=LocalDate.parse(input,formatter);
		Period pr=Period.between(date, dt);
		System.out.println("Difference of your date to current date::"+pr);
		int dd=pr.getDays();
		int mon=pr.getMonths();
		int year=pr.getYears();
		System.out.println("Difference of two days:  "+dd+"/"+mon+"/"+year);
		
		
}
}
