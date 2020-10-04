import java.util.Scanner;

public class ValidTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		int side3 = sc.nextInt();
		
		if ((side1+side2 <= side3) || (side1+side3 <= side2) || (side2+side3 <= side1)) {
			System.out.println("Not Valid");
		}
		else {
			System.out.println("Valid");
		}
	}

}
