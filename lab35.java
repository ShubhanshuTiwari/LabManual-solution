import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class lab35 {
	public static void main(String[] args) {
		System.out.println("Enter purchase  date in the format(dd/mm/yyyy)");
		Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine();
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dt1=LocalDate.parse(input1,formatter);
		System.out.println("Enter no. of warranty month");
		int input2=sc.nextInt();
		 dt1=dt1.plusMonths(input2);
		System.out.println("Enter no. of warranty year");
		int input3=sc.nextInt();
		 dt1=dt1.plusYears(input3);
		
		System.out.println("your warranty date is"+dt1);
		

		
	}
}
