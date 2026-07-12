package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class firstMissingPositive {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(firstMissingPositive(nums));
        sc.close();
    }
    public static int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (num > 0) {
                set.add(num);
            }
        }
        int missing = 1;
        while (set.contains(missing)) {
            missing++;
        }
        return missing;
    }
}
