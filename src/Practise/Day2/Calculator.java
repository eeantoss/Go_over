package Practise.Day2;
/*
@ClassName:     Calculator
@Author:        YangXu
@Need:          计算器
@Date:          2022/3/19
@Time:          17:29
*/

/*
/1、计算器需求包含以下几个功能
1、界面功能菜单展示
	1 加法
	1 减法
	1 乘法
	1 除法
2、当用户选择功能菜单，如1加法时，接收用户输入的两个整数，并完成相应的计算。得到结果输出到控制台，并询问用户是否继续。
3、如果用户选择继续，那么回到第1点功能菜单展示。
4、如果用户选择不继续，那么退出系统，结束程序。
 */

import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    select();
  }

  public static void select() {
    Scanner sc = new Scanner(System.in);
    while (true) {
      menu();
      int input = sc.nextInt();
      if (input == 1) {
        System.out.println("当前是:++加法模式++");
        System.out.println("请输入第一个数:");
        double num1 = sc.nextDouble();
        System.out.println("请输入第二个数:");
        double num2 = sc.nextDouble();
        jia(num1, num2);
        System.out.println();
      } else if (input == 2) {
        System.out.println("当前是:--减法模式--");
        System.out.println("请输入第一个数:");
        double num1 = sc.nextDouble();
        System.out.println("请输入第二个数:");
        double num2 = sc.nextDouble();
        jian(num1, num2);
        System.out.println();

      } else if (input == 3) {
        System.out.println("当前是**乘法模式**");
        System.out.println("请输入第一个数:");
        double num1 = sc.nextDouble();
        System.out.println("请输入第二个数:");
        double num2 = sc.nextDouble();
        cheng(num1, num2);
        System.out.println();
        sc.close();
      } else if (input == 4) {
        System.out.println("当前是//除法模式//");
        System.out.println("请输入第一个数:");
        double num1 = sc.nextDouble();
        System.out.println("请输入第二个数:");
        double num2 = sc.nextDouble();
        chu(num1, num2);
        System.out.println();
        sc.close();
      } else {
        System.out.println("输入错误");
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

  public static void repeat() {
    System.out.println("是否继续使用计算器:");
    System.out.println("--1:继续使用");
    System.out.println("--2:退出计算器");
  }

  public static void menu() {
    System.out.println("----\t欢迎来到计算机菜单\t----");
    System.out.println("----\t\t1:加法\t\t----");
    System.out.println("----\t\t2:减法\t\t----");
    System.out.println("----\t\t3:乘法\t\t----");
    System.out.println("----\t\t4:除法\t\t----");
    System.out.println("请输入你的选择:");
  }

  public static void jia(double x, double y) {
    double tmp = x + y;
    System.out.println(x + "+" + y + "的结果=" + tmp);
  }

  public static void jian(double x, double y) {
    double tmp = x - y;
    System.out.println(x + "-" + y + "的结果=" + tmp);
  }

  public static void cheng(double x, double y) {
    double tmp = x * y;
    System.out.println(x + "*" + y + "的结果=" + tmp);
  }

  public static void chu(double x, double y) {
    if (y == 0) {
      System.out.println("输入错误，第二个数不能为 0 ");
    } else {
      double tmp = x / y;
      System.out.println(x + "/" + y + "的结果=" + tmp);
    }
  }
}
/*

*/
