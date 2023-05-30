package cse12pa4student;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import static cse12pa4mysteries.Mysteries.*;

public class Measure {


	public static List<Measurement> measure(String[] toRun, int startN, int stopN) {
		/** TODO **/
		List<Measurement> lst = new ArrayList<Measurement>();
		for (int i = 0; i < toRun.length; i++) {
			String letter = toRun[i];
			for (int n = startN; n <= stopN; n++) {
				long startTime = System.nanoTime();
				if (letter.equals("A")) {
					mysteryA(n);
				} 
				else if (letter.equals("B")) {
					mysteryB(n);
				} 
				else if (letter.equals("C")) {
					mysteryC(n);
				} 
				else if (letter.equals("D")) {
					mysteryD(n);
				} 
				else if (letter.equals("E")) {
					mysteryE(n);
				} 
				else if (letter.equals("F")) {
					mysteryF(n);
				}
				long nanoSecondsToRun = System.nanoTime() - startTime;
				Measurement measure = new Measurement(letter, n, nanoSecondsToRun);
				lst.add(measure);
			}
		}
		return lst;
		
		//Example call to mystery method
//		mysteryA(50);
	}
	

	public static String measurementsToCSV(List<Measurement> toConvert) {
		/** TODO **/
		List<String> lst = new ArrayList<>();
		lst.add("name, n, nanoseconds" + '\n');
		
		for (int i = 0; i < toConvert.size(); i++) {
			String result = toConvert.get(i).name + " , " + 
					toConvert.get(i).valueOfN + " , " +
					toConvert.get(i).nanosecondsToRun+ '\n';
			lst.add(result);
		}
		
		return String.join("", lst);
	}
	


		
}
