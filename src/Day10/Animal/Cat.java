package Day10.Animal;
/*
@ClassName:     Cat
@Author:        YangXu
@Need:
@Date:          2022/4/1
@Time:          10:21
*/

//

public class Cat extends Animal {
  public Cat() {}

  public Cat(String name, int age) {
    super(name, age);
  }

  @Override
  public void eat() {
    System.out.println(getName() + "吃鱼");
  }
}
/*

*/
