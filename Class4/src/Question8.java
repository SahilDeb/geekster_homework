import java.util.Scanner;

public class Question8 {

	public static int factorial(int num) {
		int fact = 1;
		while (num != 0) {
			fact *= num;
			num--;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		
		int sinx = 0;
		
		for(int i = 1; i <= n; i+=2) {
			sinx += Math.pow(x, i);
		}
	}

}
