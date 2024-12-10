package JAVAFULL.ARRAYS_PROBLEM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {

        /*Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
        Notice that the solution set must not contain duplicate triplets.*/


        Arrays.sort(nums);

        List < List < Integer >> result = new ArrayList< >();
        for (int i = 0; i + 2 < nums.length; i++) {
            // Skip all duplicates from left
            // i>0 ensures this check is made only from 2nd element onwards
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[j] + nums[k] + nums[i];
                if (sum == 0) {
                    // Add triplet to result
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    k--;

                    // Skip all duplicates from right
                    while (j < k && nums[k] == nums[k + 1]) k--;
                } else if (sum > 0) {
                    // Decrement k to reduce sum value
                    k--;
                } else {
                    // Increment j to increase sum value
                    j++;
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> List = threeSum( nums);
        System.out.println(List);
    }
}
