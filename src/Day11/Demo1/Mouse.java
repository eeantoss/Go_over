package Day11.Demo1;
/*
@ClassName:     Mouse
@Author:        YangXu
@Need:
@Date:          2022/4/4
@Time:          10:07
*/

//

public class Mouse extends Animal implements Jump {
  public Mouse() {}

  public Mouse(String name, int age) {
    super(name, age);
  }

  @Override
  public void eat() {
    System.out.println(getName() + "在偷吃大米");
  }

  @Override
  public void jump() {
    System.out.println(getName() + "会跳高了");
  }
}
/*

*/
