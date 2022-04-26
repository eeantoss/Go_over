package Day11;
/*
@ClassName:     internal
@Author:        YangXu
@Need:
@Date:          2022/4/4
@Time:          10:31
*/

//

// 内部类的测试
public class internal {
  private String name = "张三";

  public static void main(String[] args) {
    //
  }

  public void test1() {
    inter inter = new inter();
    inter.method();
  }

  public class inter {
    public void method() {
      // 可以直接访问私有的外部成员方法
      System.out.println(name);
    }
  }
}
/*

*/
