import java.util.ArrayList;

public class WaveArray {

	public static ArrayList<Integer> wave(ArrayList<Integer> A) {
        A.sort(null);
        for(int i = 1; i < A.size(); i+=2) {
        	int temp = A.get(i-1);
        	A.set(i-1, A.get(i));
        	A.set(i, temp);
        }
        return A;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		
		System.out.println(wave(arr));
	}

}
