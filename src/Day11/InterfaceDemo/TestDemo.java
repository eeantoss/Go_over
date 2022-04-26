package Day11.InterfaceDemo;
/*
@ClassName:     TestDemo
@Author:        YangXu
@Need:
@Date:          2022/4/4
@Time:          9:30
*/

//

public class TestDemo extends InterfaceDemo_Test {
  @Override
  public void test1() {
    System.out.println("我是实现接口的方法");
  }

  @Override
  public void show() {
    System.out.println("我是继承子类的show方法");
  }
}
/*

*/
