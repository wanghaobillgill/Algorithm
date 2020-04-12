package com;

import java.util.Arrays;

/**
 * @Author Hao Wang
 * @Email wanghaobillgill@hotmail.com
 * @Create 2020/4/1 18:44
 * @Project Algorithm
 */
public class oneplace {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{1, 2, 4, 5, 4, 3, 4}, 4));
    }

    public static int removeElement(int[] nums, int val, String x) {
        Arrays.sort(nums);
        int p1 = 0;
        int p2 = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[0] == val) {
                p1 = 0;
            } else {
                if (nums[i] == val && nums[i] > nums[i - 1]) {
                    p1 = i;
                } else if (nums[i] == val && nums[i] == nums[i - 1]) {
                    p2 = i;
                }
            }
            if (nums[i] == val) {
                nums[i] = 0;
            }
        }
        return nums.length - (p2 - p1 + 1);
    }

    public static int removeElement(int[] nums, int val) {
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[flag] = nums[i];
                flag++;
            }
        }
        return flag;
    }
}

