package Day5; /*
              @ClassName:     Operation3_23
              @Author:        YangXu
              @Need:
              @Date:          2022/3/23
              @Time:          21:50
              */

//

import java.util.Random;

public class Operation3_23 {
  public static void main(String[] args) {
    // 调用方法
    System.out.println("第一题:");
    test1();
    System.out.println("---------");

    System.out.println("第二题:");
    test2();
    System.out.println("---------");

    System.out.println("第三题:");
    test3();
    System.out.println("---------");

    System.out.println("第四题:");
    test4();
    System.out.println("---------");

    System.out.println("第五题:");
    test5();
  }

  /*
  1、创建一个 char 类型的 26 个元素的数组，分别 放置'A'-'Z'。使用 for 循环访问所有元素并打印出来。提示：char 类型
        数据运算 'A'+2 -> 'C'
   */
  public static void test1() {
    char[] i = new char[26];
    for (int j = 0; j < i.length; j++) {
      i[j] = (char) ('A' + j);
      System.out.print(i[j] + " ");
    }
    System.out.println();
    //

  }

  /*
  2、请求出一个数组 int[]的最大值 {4,-1,9, 10,23}，并得到对应的下标
   */
  public static void test2() {
    int[] array = {4, -1, 9, 10, 23};
    int temp = array[0];
    for (int i = 1; i < array.length; i++) {
      //
      if (array[i] > temp) {
        temp = array[i];
      }
    }
    System.out.println("最大的是：" + temp);
  }

  /*
    3、随机生成10个整数(1_100的范围)保存到数组，并倒序打印以及求平均值、求最大值和最大值的下标、并查找里面是否有 28
  */
  public static void test3() {
    int[] array = new int[10]; // 动态定义一个数组
    Random r = new Random(); // 声明随机数的变量

    for (int i = 0; i < array.length; i++) { // 随机生成10次数字
      int a = r.nextInt(100) + 1; // 随机生成1-100的数字
      array[i] = a;
      //      System.out.print(array[i] + ",");
    }

    // 倒序打印
    for (int i = 0, j = array.length - 1; i < j; i++, j--) {
      int temp = array[i];
      array[i] = array[j];
      array[j] = temp;
    }
    System.out.print("倒叙随机生成的数组的是:");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();

    // 平均值
    int sum = 0; // 总和
    for (int i = 0; i < array.length; i++) {
      sum = sum + array[i];
    }
    double avg = sum / array.length;
    System.out.println("平均值是：" + avg);

    // 最大值
    int temp = array[0];
    int max = array[0]; // 最大值
    int get = 0;
    for (int i = 1; i < array.length; i++) {
      //
      if (max < array[i]) {
        max = array[i];
        get = i;
      }
    }
    System.out.println("最大值是：" + max);
    System.out.println("最大值的下标是:" + get);

    // code状态判断有没有28----》0默认没有
    int code = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == 28) {
        code = 1;
        break;
      }
    }
    if (code == 1) {
      System.out.println("有28");
    } else {
      System.out.println("没有28");
    }
  }

  /*
  4、冒泡排序。要求从小到大  int[] arr = {20, -1, 89, 2, 890, 7};
   */
  public static void test4() {
    int[] nums = {20, -1, 89, 2, 890, 7};
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = 0; j < nums.length - 1 - i; j++) {
        if (nums[j] > nums[j + 1]) { // 相邻两个数比较
          int temp = nums[j + 1];
          nums[j + 1] = nums[j];
          nums[j] = temp;
        }
      }
    }
    System.out.print("从小到大排序:");
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
    System.out.println();
  }

  /*
  5、将一个给定的整型数组转置输出。
  例如： 源数组，1 2 3 4 5 6
  转置之后的数组，6 5 4 3 2 1
   */
  public static void test5() {
    int[] array = {1, 2, 3, 4, 5, 6};
    System.out.print("源数据是:");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }

    System.out.println();
    for (int i = 0, j = array.length - 1; i < j; i++, j--) {
      int temp = array[i];
      array[i] = array[j];
      array[j] = temp;
    }
    System.out.print("转置之后的数组:");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
  }
}
/*

*/
