package algorithm;

import org.junit.Test;

import java.util.Arrays;

/** @ClassName BubbleSort 冒泡排序 @Author: dsYang @Date: 2020/3/5 10:32 */
public class BubbleSort {
    @Test
    public void bubbleSort() {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        // 统计比较次数
        int count = 0;
        // 第一轮比较
        for (int i = 0; i < arr.length - 1; i++) {
            // 第二轮比较
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // 如果前面一个数比后面一个数大就交换位置
                if (arr[j] > arr[j + 1]) {
                    // 交换位置
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("一共比较了:" + count + "次");
    }
    /** 根据基本冒泡排序做出优化，对已经排过序的不再做比较 */
    @Test
    public void bubbleSortUp() {
        int[] arr = {3, 40, 33, 6, 56, 15, 36, 26, 28, 2, 39, 4, 19, 52, 49};
        // 统计比较次数
        int count = 0;
        // 第一轮比较的是排序的趟数
        for (int i = 0; i < arr.length - 1; i++) {
            // 表示每次比较都是未比较的状态
            boolean flag = true;
            // 第二轮比较的是当前趟数需要的次数
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // 前一位和后一位相互比较，如果前一位比后一位大，要进行位置调换
                if (arr[j] > arr[j + 1]) {
                    // 交换位置
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // 将已经进行过位置调换的做标记
                    flag = false;
                }
                count++;
            }
            // 已经进行过的调换就不需要再进行排序了
            if (flag) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("一共比较了:" + count + "次");
    }
}
