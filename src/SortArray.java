import java.util.Arrays;
public class SortArray {
            public static void main(String[] arg) {
                double[] nums = {-8.5, 4.5, -7.8, 6.9, -6.2, 9.6, -8.4, 1.7, -2.5, 9.6, -5.3, 1.8, -7.2, 6.5, -3.3};
                for (int i = 0; i <nums.length; i++) {
                    if (nums[i] > 0 ){
                        continue;
                    } else {
                        System.out.println(nums[i]);
                    }
                }
                System.out.println("Arrays in original order: " + Arrays.toString(nums));
                Arrays.sort(nums);
                System.out.println("Sorted arrays in ascending order: " + Arrays.toString(nums));
    }
}