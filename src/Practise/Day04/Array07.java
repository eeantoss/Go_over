package Practise.Day04;

// 演示功能：数组冒泡排序
public class Array07 {
  public static void main(String[] args) {
    int[] nums = {5, 7, 2, 3, 9, 1};
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = 0; j < nums.length - 1 - i; j++) {
        if (nums[j] > nums[j + 1]) { // 相邻两个数比较
          int temp = nums[j + 1];
          nums[j + 1] = nums[j];
          nums[j] = temp;
        }
      }
    }
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
  }
}
