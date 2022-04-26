package Practise.Day04;

// 演示功能：数组 初始化
public class Array01 {
  public static void main(String[] args) {
    int num; // 定义
    num = 10; // 初始化
    int age = 18; // 定义 + 初始化

    int[] ids; // 声明数组.int [] 表示的是数组的类型，存储的是整数
    // 静态初始化：数组的初始化和赋值同时进行
    ids = new int[] {1001, 1002, 1003, 1004};
    // 动态初始化: 数组的初始化和数组元素的赋值操作分开进行
    String[] names = new String[5];

    int[] ids2 = {1001, 1002, 1003, 1004}; // 静态初始化简化操作
  }
}
