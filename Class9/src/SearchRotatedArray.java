
public class SearchRotatedArray {

	public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (nums[mid] >= nums[left]) {
                if (target >= nums [left] && target <= nums[mid]) {
                    right = mid;
                }
                else {
                    left = mid;
                }
            }
            else {
                if (target >= nums[mid] && target <= nums[right]) {
                    left = mid;
                }
                else {
                    right = mid;
                }
            }
        }
        if (nums[left] == target) {
            //return index not element
            return left;
        }
        if (nums[right] == target) {
            return right;
        }
        return -1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,5,6,7,0,1,2};
		int t = 0;
		System.out.println(search(arr, t));

	}

}
