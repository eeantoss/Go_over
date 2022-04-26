package Practise.Day2.Test; /*
                            @ClassName:     Test
                            @Author:        YangXu
                            @Need:
                            @Date:          2022/3/21
                            @Time:          10:40
                            */

//

import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    //
    Scanner sc = new Scanner(System.in);

    while (true) {
      menu();
      int input = sc.nextInt();
      switch (input) {
        case 1:
          double num1 = sc.nextDouble();
          double num2 = sc.nextDouble();
          Tools jia = new Jia(num1, num2);
          break;
        case 2:
      }
      repeat();
      for (; ; ) {
        int re = sc.nextInt();
        if (re == 1) {
          break;
        } else if (re == 2) {
          System.out.println("期待你再次使用本计算器");
          System.exit(0);
        } else {
          System.out.println("输入错误,请重新输入");
        }
      }
    }
  }

  public static void menu() {
    System.out.println("----\t欢迎来到计算机菜单\t----");
    System.out.println("----\t\t1:加法\t\t----");
    System.out.println("----\t\t2:减法\t\t----");
    System.out.println("----\t\t3:乘法\t\t----");
    System.out.println("----\t\t4:除法\t\t----");
    System.out.println("请输入你的选择:");
  }

  public static void repeat() {
    System.out.println("是否继续使用计算器:");
    System.out.println("--1:继续使用");
    System.out.println("--2:退出计算器");
  }
}
/*

*/
