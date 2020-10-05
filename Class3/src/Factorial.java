import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int factorial = 1;
		while (num != 0) {
			factorial *= num;
			num -= 1;
		}
		System.out.println(factorial);

	}

}
