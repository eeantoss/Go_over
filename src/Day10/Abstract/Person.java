package Day10.Abstract;
/*
@ClassName:     Person
@Author:        YangXu
@Need:
@Date:          2022/4/1
@Time:          11:43
*/

//

public abstract class Person {
  private String name;

  public abstract void eat(); // 抽象方法-->没有方法体

  public void study() {
    System.out.println("我不是抽象方法，我在学习");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
/*

*/
