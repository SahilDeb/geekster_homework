import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int posCount = 0, negCount = 0, zeroCount = 0;
		
		while(N != 0) {
			int num = sc.nextInt();
			if (num > 0) {
				posCount++;
			}
			else if (num < 0) {
				negCount++;
			}
			else {
				zeroCount++;
			}
			N--;
		}
		
		System.out.println("Positive Number " + posCount);
		System.out.println("Negative Number " + negCount);
		System.out.println("Zero " + zeroCount);
	}

}
