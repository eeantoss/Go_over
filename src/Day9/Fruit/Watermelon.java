package Day9.Fruit;
/*
@ClassName:     Watermelon
@Author:        YangXu
@Need:          西瓜类
@Date:          2022/3/30
@Time:          10:29
*/

//

public class Watermelon extends Fruit {
  public void t1() {}

  public void show() {

    System.out.println("我是子类中的show方法");
  }

  public void method() {
    System.out.println("我的子类");
    super.show(); // 调用到父类的方法
    show(); // 调用到子类的方法
  }
}
/*

*/
