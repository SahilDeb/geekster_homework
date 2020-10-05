import java.util.Scanner;

public class EvenOddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String nums = sc.nextLine();
		int evenSum = 0;
		int oddSum = 0;
		
		String arr[] = nums.split(" ");
		
		for(int i = 0; i < arr.length; i++) {
			int num = Integer.parseInt(arr[i]);
			if (num%2 == 0) {
				evenSum += num;
			}
			else {
				oddSum += num;
			}
		}
		
		System.out.println(evenSum + " " + oddSum);
	}

}
