
public class FindFirstAndLastPosition {
	public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, nums.length};
		int low = 0, high = nums.length - 1;
        int mid = -1;
        int idxCnt = 0;
		// Search for First Index
		while (low < high) {
			mid = (low + high)/2;
			System.out.println(low + " " + mid + " " + high);
			if (nums[mid] == target) {
				if(nums[mid] < nums[mid+1]) {
					System.out.println(mid + " " + result[1]);
					result[1] = Math.max(mid, result[1]);
					high = mid;
				}
				else {
					result[0] = Math.min(mid, result[0]);
					low = mid;
				}
				nums[mid] = -1;
			}
			else if (nums[mid] < target) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		
		return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,7,7,7,8,8,10};
		int[] res = searchRange(nums, 7);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
		
	}

}
