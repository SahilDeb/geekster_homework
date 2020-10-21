import java.util.Scanner;

public class CrushProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long arr[] = new long[n+1];
		
		for(int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int val = sc.nextInt();
			
			arr[x] += val;
			if (y+1 <= n) {
				arr[y+1] -= val;
			}
		}
		
		// Create prefix array
		for(int i = 1; i <= n; i++) {
			arr[i] += arr[i-1];
		}
		
		// Find the maximum
		long maxim = arr[0];
		for (int i = 1; i <= n; i++) {
			maxim = Math.max(maxim, arr[i]);
		}
		
		System.out.println(maxim);
	}

}
