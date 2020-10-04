import java.util.Scanner;

public class AbsoluteNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if (num < 0) {
			System.out.println(Math.abs(num));
		}
		else {
			System.out.println(num);
		}
	}

}
