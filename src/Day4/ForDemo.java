package Day4; /*
              @ClassName:     ForDemo
              @Author:        YangXu
              @Need:
              @Date:          2022/3/21
              @Time:          11:01
              */

//

public class ForDemo {
  public static void main(String[] args) {
    //
    test1();
    //    test2();
    //    test3();
  }

  // 求1~100的偶数和
  public static void test1() {
    int sum = 0; // 定义一个变量存储偶数的和
    for (int i = 1; i <= 100; i++) {
      // if
      if (i % 2 == 0) {
        sum += i;
      }
    }
    System.out.println(sum);

    int sum1 = 0;
    for (int i = 0; i < 100; i += 2) {
      if (i % 2 == 0) {
        sum1 += i;
      }
    }
    System.out.println(sum1);
  }

  // for 打印1~100之间所有是5的倍数的整数，统计个数  及 总和
  public static void test2() {
    int sum = 0; // 定义一个变量:存放统计总和的数
    int tmp; // 定义一个变量:统计是5的倍数
    int number = 0; // 定义一个变量:统计是5的倍数的个数
    for (int i = 1; i <= 100; i++) {
      //
      if ((i % 5) == 0) {
        tmp = i;
        sum = sum + i;
        System.out.println("1~100之间是5的倍数的有" + tmp);
        number = number + 1;
      }
    }
    System.out.println("----分割线----");
    System.out.println("1~100之间所有是5的倍数的个数有" + number + "\n" + "1~100之间所有是5的倍数的总和为:" + sum);
  }
  // while 打印1~100之间所有是5的倍数的整数，统计个数  及 总和
  public static void test3() {
    int start = 1;
    int end = 100;
    int sum = 0;
    int number = 0;
    while (start < end) {
      start++;
      if (start % 5 == 0) {
        System.out.println("5的倍数的整数有" + start);
        sum += start;
        number++;
      }
    }
    System.out.println("1~100之间所有是5的倍数的个数有" + number + "\n" + "1~100之间所有是5的倍数的总和为:" + sum);
  }

  /*
  统计3个班的情况，每个班有4名同学
  1、求出各个班的平均分和所有班级的平均分【键盘录入学生成绩】
  2、统计三个班的及格人数，每个班有4名同学
   */
  public static void test4() {
    double totalSum = 0;
    for (int i = 0; i < 3; i++) {}
  }
}
/*

*/
