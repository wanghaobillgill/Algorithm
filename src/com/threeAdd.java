package com;

import com.sun.org.apache.bcel.internal.generic.IfInstruction;
import sun.security.util.Length;

import java.util.*;

/**
 * @Author Hao Wang
 * @Email wanghaobillgill@hotmail.com
 * @Create 2020/4/2 16:20
 * @Project suanfa
 */
public class threeAdd {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{1, 1, 2, 4, -4, 0}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        Integer[] ints = (Integer[]) set.toArray();
        ArrayList<List<Integer>> lists = new ArrayList<>();
        return lists;
    }
}