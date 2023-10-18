
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     *
     * @param nums a List<Integer> containing varying numbers.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums) {
        if (nums == null || nums.isEmpty()) {
           
            return 0; 
        }

        int min = Integer.MAX_VALUE; 
        int max = Integer.MIN_VALUE; 

        for (int num : nums) {
            if (num < min) {
                min = num; 
            }
            if (num > max) {
                max = num; 
            }
        }

        return max - min; 
    }
}




