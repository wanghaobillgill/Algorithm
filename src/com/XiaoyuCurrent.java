package com;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author Hao Wang
 * @Email wanghaobillgill@hotmail.com
 * @Create 2020/3/27 19:11
 * @Project Algorithm
 */
public class XiaoyuCurrent {
    public static void main(String[] args) {
        XiaoyuCurrent xiaoyuCurrent = new XiaoyuCurrent();
        int[] ints = xiaoyuCurrent.smallerNumbersThanCurrent(new int[]{3, 7, 7, 4, 5});
        System.out.println(Arrays.toString(ints));
    }

    public int[] smallerNumbersThanCurrent(int[] nums,String x) {
        int[] result=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int flag=0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i]>nums[j]){
                    flag++;
                }
            }
            result[i]=flag;
        }
        return result;
    }

    public int[] smallerNumbersThanCurrent(int[] nums){
        int[] ints = Arrays.copyOf(nums, nums.length);
        Arrays.sort(ints);
        Map<Integer, Integer> integerIntegerMap = new HashMap<>();
        for (int i = 0; i < ints.length; i++) {
            if (i==0) {
                integerIntegerMap.put(ints[i], 0);
            }else if (ints[i]!=ints[i-1]){
                integerIntegerMap.put(ints[i],i);
            }
        }
        for (int i = 0; i < ints.length; i++) {
            ints[i]=integerIntegerMap.get(nums[i]);
        }
        return ints;
    }
    public int[] smallerNumbersThanCurrent(int[] nums,int x) {
        int n = nums.length;
        int[] temp = new int[n];
        temp = Arrays.copyOf(nums, n);
        Arrays.sort(temp);
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            if(i == 0){
                map.put(temp[i],0);//<temp[i],0>
            }else{
                if(temp[i] > temp[i-1]){
                    map.put(temp[i],i);
                }else{
                    map.put(temp[i],map.get(temp[i-1]));
                }
            }
        }
        for(int i = 0; i < n; i++){
            temp[i] = map.get(nums[i]);
        }
        return temp;
    }

}
