package Day8; /*
              @ClassName:     Stu
              @Author:        YangXu
              @Need:
              @Date:          2022/3/29
              @Time:          12:03
              */

//

public class Stu {
  private int age;
  private String name;

  public Stu(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public Stu() {}

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void show() {
    System.out.println(this.name);
    System.out.println(this.age);
  }

  public static void main(String[] args) {
    //
    Stu stu = new Stu(19, "张三");
    stu.show();
  }
}
/*

*/
