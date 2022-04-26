package Day10.Animal;
/*
@ClassName:     Mouse
@Author:        YangXu
@Need:
@Date:          2022/4/1
@Time:          10:22
*/

//

public class Mouse extends Animal {
  public Mouse() {}

  public Mouse(String name, int age) {
    super(name, age);
  }

  @Override
  public void eat() {
    System.out.println(getName() + "吃玉米");
  }
}
/*

*/
