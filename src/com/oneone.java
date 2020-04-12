package com;

import com.sun.org.apache.xml.internal.dtm.ref.sax2dtm.SAX2DTM2;

import java.util.HashMap;

/**
 * @Author Hao Wang
 * @Email wanghaobillgill@hotmail.com
 * @Create 2020/3/28 15:33
 * @Project Algorithm
 */
public class oneone {
    public static void main(String[] args) {
        System.out.println(countAndSay(8,"8"));
    }
    public static String countAndSay(int n,String x) {
        if (n == 1) {
            return "1";
        }
        else {
            String temp=countAndSay(n - 1);
            int length=temp.length();
            char[] chars = new char[length];
            for (int i = 0; i < length; i++) {
                char c = temp.charAt(i);
                chars[i]=c;
            }
            int flag=1;
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < length; i++) {
                if(chars[i]==chars[i+1]){
                    flag++;
                }
                if(chars[i]!=chars[i+1]){
                    stringBuilder.append(flag).append(chars[i]);
                    flag=1;
                }
            }
            return stringBuilder.toString();
        }
    }
    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        } else {
            String temp = countAndSay(n - 1);
            int flag = 0;
            char lastChar = temp.charAt(0);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < temp.length(); i++) {
                if (temp.charAt(i) == lastChar) {
                    flag++;
                } else {
                    sb.append(flag).append(lastChar);
                    flag = 1;
                }
                lastChar = temp.charAt(i);
            }
            sb.append(flag).append(lastChar);
            return sb.toString();
        }
    }
}

