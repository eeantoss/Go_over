package Practise; /*
                  @ClassName:     UtilDemo
                  @Author:        YangXu
                  @Need:
                  @Date:          2022/3/18
                  @Time:          8:47
                  */

//

public class Test {
  public static void main(String[] args) {
    int x = 4;
    int y = 1;
    if (x > 2)
      if (y > 2) System.out.println(x + y);
      else // 没有括号，就近原则，就跟上一个的if是一堆
      System.out.println("x" + x);
  }
}
/*

*/
