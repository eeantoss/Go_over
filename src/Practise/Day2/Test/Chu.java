package Practise.Day2.Test; /*
                            @ClassName:     Chu
                            @Author:        YangXu
                            @Need:
                            @Date:          2022/3/21
                            @Time:          10:51
                            */

//

public class Chu extends Tools {
  public Chu(double num1, double num2) {
    super(num1, num2);
    if (num2 == 0) {
      System.out.println("第二个数不能为0");
    } else {
      double sum = num1 * num2;
      System.out.println(sum);
    }
  }
}
/*

*/
