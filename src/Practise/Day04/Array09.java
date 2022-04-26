package Practise.Day04;

// 演示功能：数组反转
public class Array09 {
  public static void main(String[] args) {
    String[] arr = {"张无忌", "赵敏", "小昭", "周芷若", "殷离"};
    // 方法二：
    for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
      String temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

    // 方法一：
    for (int i = 0; i < arr.length / 2; i++) {
      String temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }
  }
}
