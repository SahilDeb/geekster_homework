
public class Search2DMatrix {

	public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        
        int lowr = 0, highr = matrix.length-1, lowc = 0, highc = matrix[0].length-1;
        int midr, midc;
        while(lowr <= highr) {
            midr = lowr+(highr-lowr)/2;
            midc = lowc + (highc-lowc)/2;
            if(matrix[midr][midc] == target) {
                return true;
            } else if(matrix[midr][midc] < target) {
                if(matrix[midr][highc] >= target) {
                    lowc = midc+1;
                } else {
                    lowr = midr+1;
                }
            } else if(matrix[midr][midc] > target) {
                if(matrix[midr][lowc] <= target) {
                    highc = midc-1;
                } else {
                    highr = midr-1;
                }
            }
        }
        return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
		int t = 11;
		System.out.println(searchMatrix(arr, t));
	}

}
