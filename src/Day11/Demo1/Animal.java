package Day11.Demo1;
/*
@ClassName:     Animal
@Author:        YangXu
@Need:
@Date:          2022/4/4
@Time:          10:01
*/

//

public abstract class Animal implements Jump {
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Animal() {}

  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public abstract void eat();
}
/*

*/
