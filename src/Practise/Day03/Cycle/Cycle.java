package Practise.Day03.Cycle; /*
                              @ClassName:     XiaoMing
                              @Author:        YangXu
                              @Need:
                              @Date:          2022/3/21
                              @Time:          21:11
                              */

public class Cycle {
  public static void main(String[] args) {
    //    test1();
    test2();
    //    test3();
  }

  /*1、小明有100元,每经过一次路口，需要交费,规则如下:
  1) 当现金>50时,每次交20%
  2) 当现金<=50时,每次交10
  编程小明可以经过多少次路口, 要求: 使用 while + break方式完成*/
  public static void test1() {
    double cash = 100; // 小明有100元
    int tmp = 0; // 定义tmp变量用作记 总共可以过的  次数
    while (true) {
      if (cash > 50) { // 当小明的钱大于50的时候，就...执行下面的
        cash = cash - (cash * 0.2); // 总金额 = 总金额 - (总金额的20%)
        tmp++; // 次数+1
        System.out.println("还有" + cash + "元"); // 输出剩余多少钱
      } else if (cash <= 50 && cash - 10 >= 0) { // 当小明的钱小于等于50 并且 总金额 - 10 大于等于 0 的时候...
        cash = cash - 10; // 总金额 = 总金额 - 10
        tmp++; // 次数+1
        System.out.println("还有" + cash + "元"); // 输出剩余多少钱
      } else { // 都不满足以上条件就结束while的死循环
        break;
      }
    }
    System.out.println("可以过:" + tmp + "次"); // 输出100元一共可以过多少次路口
  }

  //  输出1-100之间的不能被5整除的数，每5个一行输出
  public static void test2() {
    int[] array = new int[5]; // 动态初始化数组只能存5个
    //    int[] array = {0, 0, 0, 0, 0};//静态初始化数组
    for (int i = 0, j = 0; i <= 100; i++) {
      if (i % 5 != 0) { // 当i 不可以被5整除的时候
        array[j] = i; // 就把数组的第j个赋值为i
        j++; // j+1
        if (j == 5) { // 如果 数组满了就输出整个数组...就重置j的值，让array[j]=i;得到解决
          System.out.println(
              array[0] + "\t" + array[1] + "\t" + array[2] + "\t" + array[3] + "\t" + array[4]);
          j = 0; // 重置j的值
        }
      }
    }
  }

  // 3.输出小写的a-z以及大写的Z-A
  public static void test3() {
    for (char i = 'a', j = 'Z'; i <= 'z' || j >= 'A'; i++, j--) {
      //      System.out.println("a-z:" + i + '\t' + "Z-A:" + j);
      System.out.println(i + "\t" + j);
    }
  }
}
/*

*/
