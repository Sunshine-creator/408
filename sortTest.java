package cw0408;

import java.util.Arrays;

public class sortTest {
    public static int[] bubbleSort(int [] array){       //冒泡排序
        if(array.length==0){
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j  =0;j<array.length-1-i;j++){
                if(array[j+1] < array[j]){
                    int temp =  array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }

        }
        return array;
    }
     public static int[] selectSort(int [] array){    //选择排序
        if(array.length==0){
            return array;
        }
         for (int i = 0; i <array.length ; i++) {
             int minIndex = i;                         //在这里表示刚开始假定第一一个元素是小的
             for(int j =i;j<array.length;j++){
                 if(array[j] < array[minIndex]){
                     minIndex = j;   //索引最小的数
                 }
               int temp = array[minIndex];
                 array[minIndex] = array[i];
                 array[i] = temp;
             }
         }
         return array;
     }
    public static void main(String[] args) {
        int [] array =  {23,4,55,23,68,54,38,49,272,201};
        System.out.println(Arrays.toString(bubbleSort(array)));
    }
}
