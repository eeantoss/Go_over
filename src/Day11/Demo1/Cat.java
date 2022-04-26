package Day11.Demo1;
/*
@ClassName:     Cat
@Author:        YangXu
@Need:
@Date:          2022/4/4
@Time:          10:03
*/

//

public class Cat extends Animal implements Jump {

  public Cat() {}

  public Cat(String name, int age) {
    super(name, age);
  }

  @Override
  public void eat() {
    System.out.println(getName() + "在跳高");
  }

  @Override
  public void jump() {
    System.out.println(getName() + "会跳高了");
  }
}
/*

*/
