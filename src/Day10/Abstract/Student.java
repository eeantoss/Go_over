package Day10.Abstract;
/*
@ClassName:     Student
@Author:        YangXu
@Need:
@Date:          2022/4/1
@Time:          11:44
*/

//

public class Student extends Person {
  public Student() {}

  @Override
  public void eat() {
    System.out.println(getName() + "在吃东西");
  }
}
/*

*/
