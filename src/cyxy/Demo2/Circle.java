package cyxy.Demo2;
/*
@ClassName:     Circle
@Author:        YangXu
@Need:
@Date:          2022/4/4
@Time:          11:07
*/

// 5、定义一个圆类Circle, 定义属性：半径，提供显示圆周长功能的方法， 提供显示圆面积的方法

import java.util.Scanner;

public class Circle {
  double r;

  public double C(double r) {
    double c = Math.PI * 2 * r;
    return c;
  }

  public static void main(String[] args) {
    //
    Circle circle = new Circle();
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入圆的半径");
    double r = scanner.nextDouble();
    double c = circle.C(r);
    System.out.println("半径为" + r + "的圆的周长是:" + c);
  }
}
/*

*/
