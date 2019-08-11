package com.syb.part3;

/**
 * @version : v1.0
 * @Written by :shenyb
 * @Creation Date : 19/8/11 下午7:28
 * @Description :有序数组的二分查找
 */
public class BinarySearchST {
    //循环
    public static int search(int value,int[] data){
        int low = 0;
        int high = data.length-1;
        while (low <=high){
            int middle = (high+low)/2;
            if(value==data[middle]){
                return middle;
            }else if(value<data[middle]){
                high = (high-low)/2;
            }else {
                low = (high-low)/2;
            }
        }
        return -1;
    }

    //递归
    public static int search(int value,int[] data,int low,int high){
        int middle = (high+low)/2;
        if (value==data[middle]){
            return middle;
        }else if(value<data[middle]){
           return search(value,data,low,middle);
        }else {
           return search(value,data,middle,high);
        }
    }
}
