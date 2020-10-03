import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int marks1 = sc.nextInt();
		int marks2 = sc.nextInt();
		int marks3 = sc.nextInt();
		
		int averageMarks = (marks1 + marks2 + marks3)/3;
		if (averageMarks >= 90 && averageMarks <= 100) {
			System.out.println("Grade A");
		}
		else if (averageMarks >= 80 && averageMarks <= 89) {
			System.out.println("Grade B");
		}
		else if (averageMarks >= 70 && averageMarks <= 79) {
			System.out.println("Grade C");
		}
		else if (averageMarks >= 60 && averageMarks <= 69) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("Grade F");
		}
		
	}

}
