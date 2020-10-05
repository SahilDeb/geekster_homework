import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int largestNum = Integer.MIN_VALUE, smallestNum = Integer.MAX_VALUE;
		
		while(N != 0) {
			int num = sc.nextInt();
			if (num >= largestNum) {
				largestNum = num;
			}
			if (num <= smallestNum) {
				smallestNum = num;
			}
			N--;
		}
		
		System.out.println("Largest Number " + largestNum);
		System.out.println("Smallest Number " + smallestNum);
	}

}
