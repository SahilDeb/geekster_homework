import java.util.Scanner;

public class SumProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		do {
			int a = sc.nextInt();
			int b = sc.nextInt();
			input = sc.nextInt();
			
			int result = a + b;
			System.out.println(result);
		}
		while(input != 0);

	}

}
