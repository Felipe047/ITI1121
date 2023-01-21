import java.util.Scanner;

public class Q6{
	public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double[] studentsGrades = new double[10];

        for (int i = 0; i < studentsGrades.length; i++) {
            System.out.println("Insert the " + (i+1) + " student grade:");

            studentsGrades[i] = scanner.nextDouble();
        }

        scanner.close();

        System.out.println("\nAverage: " + calculateAverage(studentsGrades));
        System.out.println("\nMedian: " + calculateMedian(studentsGrades));
        System.out.println("\nNumber Failed: " + calculateNumberFailed(studentsGrades));
        System.out.println("\nNumber Passed: " + calculateNumberPassed(studentsGrades));
	}

	public static double calculateAverage(double[] values){
		double result = 0;
        
        for (double d : values) {
            result = result + d;
        }

        result = result / values.length;

		return result;
	}

	public static double calculateMedian(double[] notes){
		//your code here
        double median;
        if (notes.length % 2 == 0) {
            median = (notes[notes.length / 2] + notes[(notes.length / 2) - 1]) / 2;
        } else {
            median = notes[(notes.length - 1)];
        }

        return median;
	}

	public static int calculateNumberFailed(double[] notes){
		//your code here
        int numberFailed = 0;

        for (int i = 0; i < notes.length; i++) {
            if (notes[i] < 50) {
                numberFailed++;
            }
        }

        return numberFailed;
	}

	public static int calculateNumberPassed(double[] notes){
		//your code here
        int numberPassed = 0;

        for (int i = 0; i < notes.length; i++) {
            if (notes[i] >= 50) {
                numberPassed++;
            }
        }

        return numberPassed;
	}

}
