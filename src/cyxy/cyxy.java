package cyxy;
/*
@ClassName:     cyxy
@Author:        YangXu
@Need:
@Date:          2022/4/4
@Time:          0:13
*/

//

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class cyxy {
  public static void main(String[] args) {
    //
    //    test1();
    //    test2();
    //    test3();
    //    test4();
    //    test5();
    //    test6();
    test7();
  }

  // 1.给定一个学生成绩，给出相应等级：优秀、良好、 中等、 及格、 不及格。
  public static void test1() {
    int score = 51;
    if (score >= 90) {
      System.out.println("优秀");
    } else if (score < 60) {
      System.out.println("不及格");
    } else if (score >= 80) {
      System.out.println("良好");
    } else if (score >= 70) {
      System.out.println("中等");
    } else if (score >= 60) {
      System.out.println("及格");
    }
  }

  // 2.用 while 循环，计算 1~100 之间所有 5 的倍数之和。
  public static void test2() {
    int sum = 0;
    int i = 1;
    while (true) {
      if (i < 100) {
        if (i % 5 == 0) {
          System.out.println(i);
          sum += i;
          //          System.out.println(sum);
          i++;
        } else {
          i++;
        }
      } else {
        break;
      }
    }
    System.out.println(sum);
  }

  // 3.实现对给定的 15个整数进行从大到小的顺序排列。
  public static void test3() {

    int[] arr = {123, 1, 123, 513, 425, 243, 213, 31541, 23, 5123, 213, 5123, 213, 213, 151};
    int temp;

    for (int i = 1; i < arr.length; i++) {
      //
      for (int j = 0; j <= arr.length - 1 - i; j++) {
        //
        if (arr[j] < arr[j + 1]) {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(arr));
  }

  public static void test4() {

    int[] arr = {123, 1, 123, 513, 425, 243, 213, 31541, 23, 5123, 213, 5123, 213, 213, 151};
    // 控制多少轮
    for (int i = 1; i < arr.length; i++) {
      // 控制每一轮的次数
      for (int j = 0; j <= arr.length - 1 - i; j++) {
        if (arr[j] < arr[j + 1]) {
          int temp;
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(arr));
  }

  // 6.让计算机随机产生10个0到2之间的数，
  //  如果产生的是0就输出“生成了一只白猪，
  // 我好怕怕”；7.如果产生的是1就输出“生成了一只黑猪
  // ，我喜欢” ；如果产生的是2就输出“生成了一只红猪，有下酒菜了”。

  public static void test5() {
    Random random = new Random();
    for (int i = 0; i < 10; i++) {
      //
      int j = random.nextInt(3);
      System.out.println(j);
      if (j == 0) {
        System.out.println("生成了一只白猪,我好怕怕");
      } else if (j == 1) {
        System.out.println("生成了一只黑猪,我喜欢");
      } else if (j == 2) {
        System.out.println("生成了一只红猪,有下酒菜了");
      }
    }
  }

  // 8.某公司每月标准上班时间是160小时，每小时工资是30元。
  // 如果上班时间超出了160小时，
  // 超出部分每小时按1.5倍工资发放。请编写程序计算员工月工资。
  public static void test6() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入你本月的工资:");
    int work = scanner.nextInt();
    if (work <= 160) {
      int sum = work * 30;
      System.out.println("没有超出160小时,所以工资是:" + sum);
    } else {
      int temp = work - 160;
      int sum = (int) ((work * 30) + (work * (30 * 1.5)));
      System.out.println("超过160小时工作时长,超出了" + temp + "小时\t工资是" + sum);
    }
  }

  // 9.打印九九乘法表
  public static void test7() {
    for (int i = 1; i <= 9; i++) {
      //
      for (int j = 1; j <= i; j++) {
        //
        System.out.print(i + "*" + j + "=" + i * j + "\t");
      }
      System.out.println();
    }
  }

  // 10.编写应用程序，创建类的对象，分别设置圆的半径、圆柱体的高，
  // 计算并分别显示圆半径、圆面积、圆周长，圆柱体的体积。
  public static void test8() {}
}
/*

*/
