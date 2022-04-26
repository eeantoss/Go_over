package Practise.Day04;

// 演示功能：针对数值型数组：最大值、最小值、总和、平均数等
public class Array08 {
  public static void main(String[] args) {
    int[] arr = {10, 20, 6, 18, 88};
    int age = 10;
    // 最大值
    test01(arr, age);
    test02(arr);
    test03(arr);
  }

  // 最大值
  public static void test01(int[] arr, int age) {
    System.out.println(arr); // 001x
    System.out.println(age); // 10
    int max = arr[0]; // 给数组第0个元素作为最大值
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) { // 比较
        max = arr[i];
      }
    }
    System.out.println("max：" + max);
  }
  // 最小值
  public static void test02(int[] arr) {
    int min = arr[0]; // 给数组第0个元素作为最大值
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < min) { // 比较
        min = arr[i];
      }
    }
    System.out.println("min：" + min);
  }

  // 总和
  public static void test03(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    System.out.println("总和：" + sum);
    System.out.println("平均：" + (sum / arr.length));
  }
}
