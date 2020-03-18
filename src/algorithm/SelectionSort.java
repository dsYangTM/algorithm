package algorithm;

import org.junit.Test;

import java.util.Arrays;

/** @ClassName SelectionSort 选择排序 @Author: dsYang @Date: 2020/3/18 15:29 */
public class SelectionSort {
    @Test
    public void SelectionSortTest() {
	    int[] arr = {3, 40, 33, 6, 56, 15, 36, 26, 28, 2, 39, 4, 19, 52, 49};
	    // 第一轮比较是排序的趟数
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
            	//如果当前的元素下标比上一位的元素下标小
            	if(arr[j]<arr[index]){
            		//保存最小的元素下标
            		index = j;
	            }
            }
            //然后将最小的的数与前面的数交换
	         int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
