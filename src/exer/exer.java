package exer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.zip.CheckedOutputStream;

/**
 * @Author Hao Wang
 * @Email wanghaobillgill@hotmail.com
 * @Create 2020/3/31 18:35
 * @Project Algorithm
 */
public class exer {
    public static void main(String[] args) {
        System.out.println(pingFangValue(new int[]{1, 2, -1, 1, 1, 2, 3}));
        System.out.println(pingFangValue(new int[]{1, 2, -1, 1, 1, 2, 3}, ""));
    }

    public static int pingFangValue(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int value = 0;
        for (int num : nums) {
            value = num * num;
            set.add(value);
        }
        return set.size();
    }

    public static int pingFangValue(int[] nums, String x) {
        if (nums == null || nums.length == 0)
            return 0;

        // result的缩写，最后的返回值
        int res = 0;

        //i是前指针；j是后指针
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int num1 = Math.abs(nums[i]);
            int num2 = Math.abs(nums[j]);
            if (num1 > num2) {//移动i
                // 这两个数的绝对值不相等
                res += 1;
                while (i <= j && Math.abs(nums[i]) == num1)
                    //过滤掉相邻的绝对值相等的数
                    i++;
            } else if (num1 < num2) {
                // 这两个数的绝对值不相等
                res += 1;
                while (i <= j && Math.abs(nums[j]) == num2)
                    //过滤掉相邻的绝对值相等的数
                    j--;
            } else {
                res += 1;
                while (i <= j && Math.abs(nums[i]) == num1)//去重
                    i++;
                while (i <= j && Math.abs(nums[j]) == num2)//去重
                    j--;
            }
        }
        return res;

    }
}
