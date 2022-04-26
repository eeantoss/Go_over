package cyxy.Demo2;
/*
@ClassName:     CaleTest
@Author:        YangXu
@Need:
@Date:          2022/4/4
@Time:          11:32
*/

//

import java.util.Scanner;

public class CaleTest {
  public static void main(String[] args) {
    //
    Cale cale = new Cale();
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("----计算器菜单----");
      System.out.println("1、加法");
      System.out.println("2、减法");
      System.out.println("3、乘法");
      System.out.println("4、除法");
      System.out.println("0、退出");
      int input = scanner.nextInt();
      if (input == 1) {
        System.out.println("当前是加法");
        System.out.println("请输入第一数:");
        double num1 = scanner.nextDouble();
        System.out.println("请输入第二个数:");
        double num2 = scanner.nextDouble();
        double sum = cale.sum(num1, num2);
        System.out.println(sum);
      } else if (input == 2) {
        System.out.println("当前是减法");

        System.out.println("请输入第一数:");
        double num1 = scanner.nextDouble();
        System.out.println("请输入第二个数:");
        double num2 = scanner.nextDouble();
        double sum = cale.jian(num1, num2);
        System.out.println(sum);
      } else if (input == 3) {
        System.out.println("当前是乘法");
        System.out.println("请输入第一数:");
        double num1 = scanner.nextDouble();
        System.out.println("请输入第二个数:");
        double num2 = scanner.nextDouble();
        double sum = cale.cheng(num1, num2);
        System.out.println(sum);
      } else if (input == 4) {
        System.out.println("当前是除法");
        System.out.println("请输入第一数:");
        double num1 = scanner.nextDouble();
        System.out.println("请输入第二个数:");
        double num2 = scanner.nextDouble();
        double sum = cale.chu(num1, num2);
        System.out.println(sum);
      } else if (input == 0) {
        System.exit(0);
      } else {
        System.out.println("输入错误请重新输入");
      }

      //      cale.chu(num1, num2);
    }
  }
}
/*

*/
