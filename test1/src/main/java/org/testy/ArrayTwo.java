package org.testy;

public class ArrayTwo {
    public int sum13(int[] nums) {
        int sum=0;
        if (nums.length==0)
            return 0;


        for(int i=0;i<=nums.length-1;i++)
        {
            if(nums[i]!=13)
            {
                sum=sum+nums[i];
            }
            else
            {
                i++;
            }
        }

        return sum;
    }
}
