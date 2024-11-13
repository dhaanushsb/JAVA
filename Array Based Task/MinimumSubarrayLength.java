import java.util.Scanner;

public class MinimumSubarrayLength {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0, sum = 0, minLen = Integer.MAX_VALUE;
        while (right < nums.length) {
            sum += nums[right];
            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left++];
            }
            right++;
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        MinimumSubarrayLength solver = new MinimumSubarrayLength();
        int result = solver.minSubArrayLen(target, nums);

        if (result > 0) {
            System.out.println("Minimum length of subarray with sum at least " + target + " is: " + result);
        } else {
            System.out.println("No subarray with sum at least " + target + " was found.");
        }

        scanner.close();
    }
}
