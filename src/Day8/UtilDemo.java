package Day8;
/*
@ClassName:     Test
@Author:        YangXu
@Need:
@Date:          2022/3/29
@Time:          10:07
            */

//

public class UtilDemo {
  public int getSum(int a, int b) {
    return a + b;
  }

  /*
  实现两数相加和相减并返回数组
   */

  public int[] getSumAdd(int num1, int num2) {
    int sum = num1 + num2;
    int sum1 = num1 - num2;
    int[] arr = new int[2];
    arr[1] = sum1;
    arr[0] = sum;
    return arr;
  }

  public static void main(String[] args) {
    //
    UtilDemo utilDemo = new UtilDemo();
    //    int[] sumAdd = utilDemo.getSumAdd(10, 2);
    //    System.out.println("加法的和是" + (sumAdd[0]) + "加法的差:" + (sumAdd[1]));
    double sum = utilDemo.getSumIf(10, 20, 1);
    System.out.println("和是:" + sum);
  }

  public double getSumIf(double num1, double num2, int type) {
    double temp = 0;
    switch (type) {
      case 1:
        temp = num1 + num2;
        break;
      case 2:
        temp = num1 - num2;
        break;
      case 3:
        temp = num1 * num2;
        break;
      case 4:
        temp = num1 / num2;
        break;
      default:
        System.out.println("输入错误");
        break;
    }
    return temp;
  }
}
/*

*/
