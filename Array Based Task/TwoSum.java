import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();
        
        TwoSum twoSumSolver = new TwoSum();
        int[] result = twoSumSolver.twoSum(nums, target);
        if (result != null) {
            System.out.println("Indices of elements that add up to the target: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No two elements add up to the target.");
        }

        scanner.close();
    }
}
