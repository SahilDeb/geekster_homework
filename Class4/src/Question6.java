import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum = 0.0;
		
		for (int i = 1; i <= n; i+=2) {
			sum = sum + 1.0/i;
		}
		
		for (int i = 2; i <= n; i+=2) {
			sum = sum - 1.0/i;
		}
		
		System.out.println(sum);
	}

}
