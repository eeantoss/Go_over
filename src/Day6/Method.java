package Day6; /*
              @ClassName:     Method
              @Author:        YangXu
              @Need:
              @Date:          2022/3/25
              @Time:          10:12
              */

//

public class Method {
  public static void main(String[] args) {
    // 实参
    //        int a = 10;
    /*    int num = test(10, 20);
    System.out.println("最大的是:" + num);*/

    short a = 123;
    short b = 123;
    byte c = 12;
    byte d = 123;
    System.out.println(test1(a, b));
    System.out.println(test1(c, d));
    //    change(c); // 基本数据类型不会改变实际的参数值
    System.out.println(c);

    String s = "test";
    System.out.println(s);
  }

  // 比较两个数谁大
  public int test(int num, int num2) { // int num 是形参
    if (num < num2) {
      return num2;
    } else {
      return num;
    }
  }

  // 重载
  // 使其支持
  public boolean test1(int num1, int num2) {
    if (num1 == num2) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean test1(byte num1, byte num2) {
    if (num1 == num2) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean test1(short num1, short num2) {
    if (num1 == num2) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean test1(long num1, long num2) {
    if (num1 == num2) {
      return true;
    } else {
      return false;
    }
  }
}
/*

*/
