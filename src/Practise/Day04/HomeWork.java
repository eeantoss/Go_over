package Practise.Day04;

import java.text.DecimalFormat;

// 作业：6只鸡平均体重和总体重
public class HomeWork {
  public static void main(String[] args) {
    double a1 = 3;
    double a2 = 5;
    double a3 = 1;
    double a4 = 3.4;
    double a5 = 2;
    double a6 = 50;
    // 求总体重
    double total = a1 + a2 + a3 + a4 + a5 + a6;
    System.out.println("total :" + total);

    // 平均
    System.out.println("平均体重：" + (total / 6));

    System.out.println("----------");
    test();
  }

  /** 使用数组 */
  public static void test() {
    double[] arr = {3, 5, 1, 3.4, 2, 50};
    double total = 0;
    for (int i = 0; i < arr.length; i++) {
      total += arr[i];
    }
    System.out.println("total:" + total);
    DecimalFormat decimalFormat = new DecimalFormat("#.00");
    System.out.println("平均：" + decimalFormat.format(total / 6));
  }
}
