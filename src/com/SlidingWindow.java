package com;

/**
 * @Author Hao Wang
 * @Email wanghaobillgill@hotmail.com
 * @Create 2020/3/30 18:45
 * @Project Algorithm
 */
public class SlidingWindow {
    public static int maxnum(int[] array,int k,String x){
        if(array.length<k){//如果k比数组长度还大，返回-1
            return -1;
        }
        int left=0;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=array[i];
        }
        int tempsum=sum;//tempsum记录每个窗口的总和
        while (left+k<array.length){
            tempsum=tempsum-array[left]+array[left+k];
            left++;
            sum=Math.max(sum,tempsum);//sum取原sum和tempsum的较大值
        }
        return sum;
    }
    public static int maxnum(int[] array,String x){
        int sum=array[0]+array[1];
        for (int i = 1; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]+array[j]>array[i-1]+array[j-1]){
                    sum=array[i]+array[j];
                }
            }
        }
        return sum;
    }
    public static int maxnum(int[] array,int k){
        if(array.length<k){//如果k比数组长度还大，返回-1
            return -1;
        }
        int left=0;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=array[i];
        }
        int tempsum=sum;//tempsum记录每个窗口的总和
        while (k+left<array.length){
            tempsum=tempsum-array[left]+array[k+left];
            left++;
            sum=Math.max(tempsum,sum);
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr={1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k=2;
        long start = System.currentTimeMillis();
        System.out.println(maxnum(arr,3));

    }
}
