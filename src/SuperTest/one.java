package SuperTest; /*
                   @ClassName:     one
                   @Author:        YangXu
                   @Need:
                   @Date:          2022/3/25
                   @Time:          23:57
                   */

//

import java.util.Scanner;

public class one {
  public static void main(String[] args) {
    /*  test1();
    test2();*/
    //    test3();
    //    test4();
    //    test5();
    //    test6();
    //    test7();
    //    test8();
    //    test9();
    //    test10();
  }

  /*
    需求:
  案例一:减肥计划(if 版)
      输入星期数，显示今天的减肥活动
  周一:跑步.
  周二:游泳
  周三:慢走
  周四:动感单车
  周五:拳击
  周六:爬山
  周日:好好吃一顿
       */
  // 需求
  public static void test1() {
    //
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入进星期几:");
    System.out.println("例如: 一");
    String input = sc.nextLine();
    if (input.equals("一")) {
      System.out.println("跑步");
    } else if (input.equals("二")) {
      System.out.println("游泳");
    } else if (input.equals("三")) {
      System.out.println("慢走");
    } else if (input.equals("四")) {
      System.out.println("动感单车");
    } else if (input.equals("五")) {
      System.out.println("拳击");
    } else if (input.equals("六")) {
      System.out.println("爬山");
    } else if (input.equals("日")) {
      System.out.println("好好吃一顿");
    } else {
      System.out.println("输入错误!!!");
    }
  }

  /*
    需求:
  案例一:减肥计划(switch 版)
      输入星期数，显示今天的减肥活动
  周一:跑步.
  周二:游泳
  周三:慢走
  周四:动感单车
  周五:拳击
  周六:爬山
  周日:好好吃一顿
       */
  // 需求
  public static void test2() {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    switch (input) {
      case 1:
        System.out.println("跑步");
        break;
      case 2:
        System.out.println("游泳");
        break;
      case 3:
        System.out.println("慢走");
        break;
      case 4:
        System.out.println("动感单车");
        break;
      case 5:
        System.out.println("拳击");
        break;
      case 6:
        System.out.println("爬山");
        break;
      case 7:
        System.out.println("好好吃一顿");
        break;
      default:
        System.out.println("输入错误");
        break;
    }
  }

  // 1-100中是7的倍数的就不输出
  public static void test3() {
    for (int i = 1; i <= 100; i++) {
      //
      if (i % 7 == 0
          || i % 10 == 7
          || i / 10 % 10 == 7
          || i / 100 % 10 == 7) { // 被7整除或者10位数取余后=7的，又或者百位数取余后是等于7的排除
      } else {
        System.out.println(i); // 输出不是7倍数的
      }
    }
  }

  // 未完成版本！！！写错xxx
  public static void test4() {}

  public static void test5() {
    int[] rabbit = new int[20]; // 兔子开始只有一对
    rabbit[0] = 1;
    rabbit[1] = 1;
    for (int i = 2; i < rabbit.length; i++) {
      rabbit[i] = rabbit[i - 1] + rabbit[i - 2];
    }
    System.out.println(rabbit[rabbit.length - 1]);
  }

  /*
    //百钱百鸡
  需求:鸡翁一值钱五,鸡母一值钱,鸡雏三值钱一
  百钱买百鸡，鸡翁，鸡母，鸡雏个几只
  鸡翁：5文钱一只--->100/5=20最多只能买20只鸡翁
  鸡雏：1文钱三只--->100文钱买300只鸡雏
  鸡母：3文钱一只--->100/3=33.3333,(只能是33只)
   */
  public static void test6() {
    int num = 100; // 有100文钱
    for (int i = 0; i <= 20; i++) { // 100块钱买20只以及20只以内的鸡翁
      //
      for (int j = 0; j <= 33; j++) { // 100块钱只能买33只以及33只以内的鸡母
        int x = 100 - i - j; // 100块钱买了多少只鸡翁，买了多少只鸡母，还剩多少钱能买鸡雏
        // 要满足刚刚好省下的钱可以买多少只鸡翁的,并且要满足 100块钱买了多少只鸡翁，买了多少只鸡母,买了多少只鸡雏的条件
        if (x % 3 == 0 && 5 * i + 3 * j + x / 3 == 100) {
          System.out.println("可以买:" + i + "只鸡翁" + j + "只鸡母" + x + "只鸡雏");
        }
      }
    }
  }

  /*
  需求:有这样的一个数组，元素是{18,87,95,88,171,996,51,200}。去哦IC及告诉机子这家拍卖行蛮子要求的元素和
  要求是：求和的元素个位和十位都不能是7，并且只能是偶数

  **思路**:
      1,定义一个数组,用静态初始化完成数组元素的初始化
      2.定义一个求和变量，初始值是0
      3.遍历数组，获取到数组中的每一个元素
      4.判断该元素是否满足条件，如果满足条件就累加
      5.输出求和变量的值
   */
  public static void test7() {
    int[] arr = {18, 87, 95, 88, 171, 996, 51, 200}; // 静态初始化数组
    int sum = 0; // 求和的变量，初始值是0
    for (int i = 0; i < arr.length; i++) { // 遍历数组，获取到数组中的每一个元素
      //
      int temp = arr[i];
      // 要求是：求和的元素个位和十位都不能是7，并且只能是偶数
      if (temp % 10 != 7 && temp % 7 != 0 && temp % 2 == 0) {
        System.out.println(temp); // 输出个位数跟十位数不是7，而且还是偶数的数
      }
    }
  }

  /*
    案例六:数组求和
    需求:定义一个方法，用于比较两个数组的内容是否相同
  **思路**:
      1:定义两个数组，分别使用静态初始化完成数组元素的初始化
      2：定义一个方法，用于比较两个数组的内容是否相同
      3:比较两个数组的内容是否相同，按照下面的步骤实现就可以了首先比较数组长度，如果长度
      不相同，数组内容肯定不相同，返回假其次遍历，比较两个数组中的每-个元素，只要有元
      素不相同，返回false最后循环遍历结束后，返回true
      4：调用方法，用变量接收
      5:输出结果
     */
  public static void test8() {
    // 静态初始化两个数组
    int[] arr1 = {1, 5, 7, 546, 568, 324, 865, 666};
    int[] arr2 = {1, 5, 7, 56, 568, 324, 865, 666};
    // 判断数组的内容是否相同true是相同，false是不相同
    if (test8_check(arr1, arr2) == true) { // 如果相同就输出相同
      System.out.println("数组相同");
    } else { // 如果不相同就返回不相同
      System.out.println("数组不相同");
    }
  }

  // 定义一个检查数组长度，以及数组内容的方法
  public static boolean test8_check(int[] arr1, int[] arr2) {
    boolean check = false; // 定义一个check的boolean类型的变量，默认为false
    // 比较数组的长度是否相同
    if (arr1.length != arr2.length) { // 如果数组的长度不同，就返回false
      return check; // 如果长度不相同的话直接返回false
    } else { // 如果数组的长度相同,就遍历数组里面的元素是否相同
      for (int i = 0; i < arr1.length || i < arr2.length; i++) { // 遍历arr1或者arr2
        int a = arr1[i]; // 定义一个变量存放arr1[i]
        int b = arr2[i]; // 定义一个变量存放arr2[i]
        if (b != a) { // 如果arr2[i]的值不等于arr1[i]的值,就直接返回false
          return check;
        } else { // 如果arr2[i]的值等于arr1[i]的值，变量check的值就赋值为true
          check = true;
        }
      }
      return check; // 返回
    }
  }

  /*
  案例七:查找索引
  需求:已知一个数组arr={15, 28, 37, 46, 50}; 键盘录入一个数据，查找该数据在数组中的索引。
    并在控制台输出找到的索引值。如果没有查找到，则输出-1
  思路:
    1:定义一个数组，用静态初始化完成数组元素的初始化
   */
  public static void test9() {
    // 静态初始化数组
    int[] arr = {15, 28, 37, 46, 50};
    Scanner sc = new Scanner(System.in);
    // 提升用户输入的
    System.out.println("请输入索引值:");
    System.out.println("提示：数组的索引是从0开始");
    int num = sc.nextInt();
    if (num > arr.length) { // 如果输入的索引大于数组的长度就输出-1
      System.out.println(-1);
    } else { // 如果输入的索引可以查到
      int print = arr[num]; // 定义一个变量取到用户想要的第几个索引
      System.out.println("数组的第" + num + "个索引对应的内容是：" + print); // 输入出该索引对应的值
    }
  }

  /*
  案例八:评委评分
    需求:在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
      选手的最后得分为:去掉一个最高分和一个最低分后的4个评委平均值(不考虑小数部分)。
    **思路**:
      1:定义一个数组，用动态初始化完成数组元素的初始化，长度为6
      2:键盘录入评委分数
      3:由于是6个评委打分，所以，接收评委分数的操作，用循环改进
      4:定义方法实现获取数组中的最高分(数组最大值)，调用方法
      5:定义方法实现获取数组中的最低分(数组最小值)，调用方法
      6:定义方法实现获取数组中的所有元素的和(数组元素求和)，调用方法
      7:按照计算规则进行计算得到平均分
      8:输出平均分
   */
  public static void test10() {
    int[] arr = new int[6];
    Scanner sc = new Scanner(System.in);
    while (true) { // while死循环    死循环的目的就是为了让6个裁判都给出0-100这个阶段的正确分数
      for (int i = 0; i < 6; i++) { // for循环6次,因为只有6个裁判
        System.out.println("请第" + (i + 1) + "个裁判给出分数：");
        int input = sc.nextInt(); // 接收键盘输入
        if (input < 0 || input > 100) { // 输入的数值如果大于100，小于0的话就输出从新输入，i--，然后重新输入
          System.out.println("给出的分数错位，请重新输入!!!");
          i--;
        } else {
          arr[i] = input; // 输入的数是在0-100里面的数值就赋值给arr[i]
        }
      }
      break; // 当6个裁判都输入正确的分支后，就跳出while循环
    }

    int avg = (test10_sum(arr) - test10_max(arr) - test10_min(arr));
    System.out.println("平均分是：" + avg / (arr.length - 2));
  }

  // 定义一个求出数组最大值的方法
  public static int test10_max(int[] arr) { // 求出数组的最大值
    // 定义一个临时变量存放最大值
    int temp = arr[0];
    // 求出数组的最大值
    for (int i = 1; i < arr.length; i++) { // 遍历数组
      //
      if (arr[i] > temp) { // 如果arr[i]大于arr[0]的时候就
        temp = arr[i]; // temp就等于arr[i]
      }
    }
    return temp; // 返回最大值
  }

  // 定义一个求出数组最小值的方法
  public static int test10_min(int[] arr) { // 求出数组的最小值
    int temp = arr[0]; // 定义一个tmep变量,并且赋值给数组的第0个索引
    for (int i = 1; i < arr.length; i++) { // 遍历数组
      if (arr[i] < temp) { // 当数组的第i个元素小于数组的第0个的时候
        temp = arr[i]; // 变量temp就等于小于第0个索引
      }
    }
    return temp; // 返回最小值
  }

  // 定义一个求出数组总和的方法
  public static int test10_sum(int[] arr) { // 求出数组的总和
    int sum = 0; // 定义一个存着总和的变量，初始值为0
    for (int i = 0; i < arr.length; i++) { // 遍历数组
      sum += arr[i]; // 总和累加arr[i]
    }
    return sum; // 返回总和
  }
}
/*

*/
