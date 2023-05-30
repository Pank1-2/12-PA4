package cse12pa4student;
import java.util.List;


public class Main extends Measure{
	
	public static void main(String[] args) {
		List<Measurement> lst = measure(new String[] {"E", "F"}, 20, 40);
		System.out.println(measurementsToCSV(lst));
	}
}
