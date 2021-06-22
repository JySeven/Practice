package com.example.practice.calculation.normalCalculation;

import java.util.Arrays;

/**
 * 常用排序算法
 */
public class NormalCalculation {
    public static void main(String[] args) {
        int[] a = {1, 100, 6, 2, 89, 22, 199, 90};
        NormalCalculation n = new NormalCalculation();
        n.maoPao(a);
    }

    /**
     * 冒泡排序  时间复杂度 O(n2)  从小到大排序
     */
    void maoPao(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 选择排序 时间复杂度 O(n2) 通过遍历 把第一个符合条件的数字放在最前面或者最后面 依次类推
     */
    void selectionSort(int[] arr){
        int minPosition=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];

                }
            }
        }
    }
}
