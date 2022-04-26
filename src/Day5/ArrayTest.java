package Day5; /*
              @ClassName:     ArrayTest
              @Author:        YangXu
              @Need:
              @Date:          2022/3/23
              @Time:          9:13
              */

import java.util.Scanner;

public class ArrayTest {
  public static void main(String[] args) {
    int[] array = {1, 7, 8, 2, 5};

    //
    //    test4();

    test1();
    /*    test4(array); // 最大值
    test5(array); // 最小值
    test6(array); // 总和
    test7(array); // 平均数*/

    //    test8(); //
  }

  /*
  /1、6只鸡它们的体重分别是3kg,5kg,1kg,3.4kg,2kg,50kg 。请问这六只鸡的总体重是多少?平均体重是多少?
  	思路分析
  		1. 定义六个变量 double , 求和 得到总体重
  		2. 平均体重 = 总体重 / 6
  		3. 传统实现的方式的问题. --》需要定义的变量过多
  		4. 引出新的技术 -> 使用数组来解决


  	要求：
   	1、使用两种方法来完成作业，传统方式和数组方式。
   */
  public static void test1() {
    int a = 4;
    int b = 5;
    if (a++ > 4 & ++b > 5) {
      ++a;
    }
    System.out.println(a + " " + b);
  }

  public static void test2() {}

  public static void test3() {
    int[] i = new int[1];
    System.out.println(i[0]);

    float[] f = new float[5];
    System.out.println(f[0]);

    String[] s = new String[5];
    System.out.println(s[0]);
  }

  // 最大值，最小值，平均值
  public static void test4(int[] array) {
    int tmp = array[0];
    for (int i = 1; i < array.length; i++) {
      if (array[i] > tmp) {
        tmp = array[i];
      }
    }
    System.out.println("最大值：" + tmp);
  }

  // 最小值
  public static void test5(int[] arr) {
    int tmp = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < tmp) {
        tmp = arr[i];
      } else {
        tmp = arr[0];
      }
    }
    System.out.println("最小值是:" + tmp);
  }

  // 总和
  public static void test6(int[] arr) {
    int sum = arr[0];
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    System.out.println("总和是:" + sum);
  }

  // 平均值
  public static void test7(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    double avg = sum / arr.length;
    System.out.println("平均值是:" + avg);
  }

  public static void test8() {
    Scanner sc = new Scanner(System.in);
    double[] arr = new double[5];
    for (int i = 0; i < arr.length; i++) {
      System.out.println("请输入第" + (i + 1) + "个数");
      arr[i] = sc.nextDouble();
    }
    System.out.print("[ ");
    for (int j = 0; j < arr.length; j++) {
      if (j != arr.length - 1) {

        System.out.print(arr[j] + " , ");
      } else {
        System.out.print(arr[j] + " ");
      }
    }
    System.out.print("]");
  }

  // 数组反转
  public static void test9() {
    String[] arr = {"李四", "2", "3", "4", "张三"};
  }
}

/*

*/
