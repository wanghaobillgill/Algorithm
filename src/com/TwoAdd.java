package com;

import javafx.scene.Scene;
import org.omg.PortableInterceptor.INACTIVE;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * @Author Hao Wang
 * @Email wanghaobillgill@hotmail.com
 * @Create 2020/3/19 13:17
 * @Project Algorithm
 */
public class TwoAdd{
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("请输入数组的长度");
        //int lengthX = scanner.nextInt();
        // System.out.println("请输入数组的元素");
        int[] nums=new int[]{1,2,3,4};
        int target=6;
        int[] ints = twoSum2(nums, target);//log n2
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
//        nums=new int[]{2,7,11,15};
//        target=9;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    public static int[] twoSum1(int[] num,int target){
        Map<Integer, Integer> map=new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            map.put(num[i],i);
        }

        for (int i = 0; i < num.length; i++) {
            int armValue=target-num[i];
            if (map.containsKey(armValue)&&map.get(armValue)!=i){
                return new int[]{i,map.get(armValue)};
            }
        }
        return null;
    }

    public static int[] twoSum2(int[] num,int target){
        Map<Integer, Integer> map=new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            int armValue=target-num[i];
            if (map.containsKey(armValue)&&map.get(armValue)!=i){
                return new int[]{i,map.get(armValue)};
            }
            map.put(num[i],i);
        }

        return null;
    }




}
