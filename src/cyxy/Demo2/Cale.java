package cyxy.Demo2;
/*
@ClassName:     Cale
@Author:        YangXu
@Need:
@Date:          2022/4/4
@Time:          11:13
*/

// 6、编程创建一个Cale计算类，在其中定义2个double变量表示两个操作数，
// 定义四个方法实现求和、差、乘、商(要求除数为0的话，要提示（控制台输出提示信息）) 并创建两个对象，分别测试

public class Cale {
  double num1;
  double num2;

  public double sum(double num1, double num2) {
    double sum = num1 + num2;
    return sum;
  }

  public double jian(double num1, double num2) {
    double sum = num1 - num2;
    return sum;
  }

  public double cheng(double num1, double num2) {
    double sum = num1 * num2;
    return sum;
  }

  public Double chu(double num1, double num2) {
    if (num1 == 0) {
      System.out.println("重新输入");
      //      return chu(num1,num2);
      //      return null;
    }
    return num1 / num2;
  }
}

/*

*/
