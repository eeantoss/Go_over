package Practise.Day04;

// 演示功能：数组的常见操作
public class Array04 {
  public static void main(String[] args) {
    int[] arr = new int[] {2, 3, 5};
    String[] arr1 = new String[3];
    arr1[1] = "杨过";
    arr1[2] = "雕兄";
    arr1 = new String[2];
    System.out.println(arr1[0]); // null
    System.out.println(arr1[1]); // 杨过
  }
}
