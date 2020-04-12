package com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author Hao Wang
 * @Email wanghaobillgill@hotmail.com
 * @Create 2020/3/31 20:00
 * @Project Algorithm
 */
public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(

                "pwwke"));
    }

    public static int lengthOfLongestSubstring(String s, String x) {
        if ("".equals(s)) {
            return 0;
        }
        char[] chars = s.toCharArray();
        Set<Character> set = new HashSet<>();
        int sizeMax = 0;
        for (int i = sizeMax; i < chars.length; i++) {
            int maxSize = 0;
            for (int j = sizeMax; j < chars.length; j++) {
                if (set.contains(chars[j])) {
                    set.remove(chars[i]);
                    break;
                }
                set.add(chars[j]);
                sizeMax = maxSize++;
            }
        }
        return sizeMax;
    }

    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        Set<Character> set = new HashSet<>();
        int sizeMax = 0;
        int p1 = 0;
        int p2 = 0;
        for (int i = 0; i < chars.length; i++) {
            if (!set.add(chars[i])) {
                p2 = i;
                sizeMax = Math.max(sizeMax,p2-p1);
                p1++;
            }
            p2 = i;
        }
        return sizeMax;
    }
}
