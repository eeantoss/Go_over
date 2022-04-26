package Practise.Day04;

import java.util.Scanner;

// 数组练习
public class Array06 {
  public static void main(String[] args) {

    // 循环输入5个成绩，保存到double数组,并输出
    // 步骤
    // 1. 创建一个 double 数组，大小 5
    // 2. 循环输入
    // 3.输出，遍历数组

    // 1、声明数组
    double[] arr = new double[5];
    Scanner scanner = new Scanner(System.in);
    // 2、循环输入
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scanner.nextDouble();
    }
    // 3、遍历输出
    System.out.print("[");
    for (int j = 0; j < arr.length; j++) {
      if (j == arr.length - 1) {
        System.out.print(arr[j] + "]");
      } else {
        System.out.print(arr[j] + ",");
      }
    }
  }

  /*要求：实现动态的给数组添加元素效果，实现对数组扩容。
     1.原始数组使用静态分配 int[] arr = {1,2,3}
     2.增加的元素4，直接放在数组的最后 arr = {1,2,3,4}
  */
  public static void test01() {
    /*
    思路分析
    1. 定义初始数组 int[] arr = {1,2,3}//下标0-2
    2. 定义一个新的数组 int[] arrNew = new int[arr.length+1];
    3. 遍历 arr 数组，依次将arr的元素拷贝到 arrNew数组
    4. 将 4 赋给 arrNew[arrNew.length - 1] = 4;把4赋给arrNew最后一个元素
    5. 让 arr 指向 arrNew ;  arr = arrNew; 那么 原来arr数组就被销毁
     */
  }
}
