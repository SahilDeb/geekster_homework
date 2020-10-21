import java.util.ArrayList;

public class MajorityElementII {

	public static ArrayList<Integer> majorityElem(int[] nums) {
		if(nums.length==0)
        {
            return new ArrayList<>();
        }
        if(nums.length==1)
        {   ArrayList<Integer> finallist = new ArrayList<>();
            finallist.add(nums[0]);
         return finallist;
        }
        if(nums.length==2)
        {
        	ArrayList<Integer> finallist = new ArrayList<>();
            if(nums[0]==nums[1])
            {
                finallist.add(nums[0]);
            }
            else
            {
                finallist.add(nums[0]);
                finallist.add(nums[1]);
            }
            return finallist;
        }
        if(nums.length==3)
        { 
        	ArrayList<Integer> finallist = new ArrayList<>();
            if(nums[0]==nums[1])
            {
                finallist.add(nums[0]);
                return finallist;
            }
             else if(nums[0]!=nums[2] && nums[1]!=nums[2])
            {
                return finallist;
            }
            finallist.add(nums[2]);
            return finallist;
        }
        int val1=nums[0] , val2 = nums[0];
        int count1 = 1 ,count2;
        if(val1==val2)
        {
            count2=0;
        }
        else
        {
            count2=1;
        }

        for(int pos =1; pos<nums.length;pos++)
        {
            if(nums[pos]==val1)
            {
                count1++;
            }
            else if(nums[pos]==val2)
            {
                count2++;
            }
            else if(count1==0)
            {
                val1=nums[pos];
                count1++;
            }
            else if(count2==0)
            {
                val2=nums[pos];
                count2++;
            }
           else if(val1!=nums[pos] && val2!=nums[pos])
            {
                count1--;
                count2--;
            }

        }

        count1=0;count2=0;
        for (int pos = 0; pos < nums.length; pos++) 
        {
            if(val1==nums[pos])
            {
                count1++;
            } 
           else if(val2==nums[pos])
            {
                count2++;
            }    
        }

        ArrayList<Integer> final_list  = new ArrayList<Integer>();
        if(val1==val2)
        {
            final_list.add(val1);
            return final_list;
        }
        if(count1>nums.length/3)
        {
            final_list.add(val1);
        }

        if(count2>nums.length/3)
        {
            final_list.add(val2);
        }

        return final_list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,2,3};
		System.out.println(majorityElem(nums));
	}

}
