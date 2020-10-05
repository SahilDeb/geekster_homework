import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 2;
		int a = 0, b = 1;
		
		System.out.print(a + " " + b + " ");
		while (count != N) {
			int temp = a + b;
			a = b;
			b = temp;
			System.out.print(b + " ");
			count++;
		}
	}

}
