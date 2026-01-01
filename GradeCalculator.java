package Week7;

public class GradeCalculator {
	public static double calculateGrade(int[] marks) {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		
		return (double) sum / marks.length;
	}
	
	public static boolean isPass(double avg) {
		return avg >= 40;
	}
	
	public static char getGrades(double avg) {
		if (avg >= 80) return 'A';
		else if (avg >= 60) return 'B';
		else if (avg >= 40) return 'C';
		else return 'F';
	}
}