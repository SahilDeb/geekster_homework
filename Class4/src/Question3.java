import java.util.Scanner;

public class Question3 {

	public static int cube(int num) {
		return num*num*num;
	}
	
	public static int sumOfDigits(int num) {
		int sum = 0;
		while (num != 0) {
			sum += cube(num%10);
			num /= 10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int num = 1; num <= 500; num++) {
			if(sumOfDigits(num) == num) {
				System.out.println(num);
			}
		}
	}

}
