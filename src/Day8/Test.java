package Day8; /*
              @ClassName:     Test
              @Author:        YangXu
              @Need:
              @Date:          2022/3/29
              @Time:          11:09
              */

//

public class Test {
  public static void main(String[] args) {
    //

    Test test = new Test();
    boolean i = test.i(2);
    if (i == true) {
      System.out.println("是偶数");
    } else {
      System.out.println("是奇数");
    }
  }

  public boolean i(int num) {
    if (num % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }
}
/*

*/
