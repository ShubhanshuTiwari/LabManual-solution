import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class lab34 {
	public static void main(String[] args) {
		System.out.println("Enter two  date in the format(dd/mm/yyyy)");
		Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine();
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dt1=LocalDate.parse(input1,formatter);
		String input2=sc.nextLine();
		DateTimeFormatter formatt=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dt2=LocalDate.parse(input2,formatt);
		Period pr=Period.between(dt1, dt2);
		System.out.println("Difference between two date:::"+pr);
		int dd=pr.getDays();
		int mon=pr.getMonths();
		int year=pr.getYears();
		System.out.println("Difference of two days:  "+dd+"/"+mon+"/"+year);
	}
}
