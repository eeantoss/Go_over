package Practise.Day04;

// 演示功能：数组元素的默认初始化值
public class Array03 {
  public static void main(String[] args) {
    // 1、数组元素是整型
    int[] arr = new int[5];
    System.out.println(arr[0]); // 0
    // 2、数组元素是浮点型
    float[] arr2 = new float[5];
    System.out.println(arr2[0]); // 0.0
    // 3、数组元素是char类型
    char[] arr3 = new char[5];
    System.out.println((int) arr3[0]); // 0
    // 4、数组元素是boolean型
    boolean[] arr4 = new boolean[5];
    System.out.println(arr4[0]); // false
    // 5、数组元素是引用数据类型
    String[] arr5 = new String[5];
    System.out.println(arr5[0]); // null
  }
}
