package Day13.HashCodeDemo;
/*
@ClassName:     Student
@Author:        YangXu
@Need:
@Date:          2022/4/8
@Time:          2022-04-08 10:15
*/

//

public class Student {
  private String name;
  private int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

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

  @Override
  public int hashCode() {
    // 重写hashCode方法
    // 如果当前对象的名字跟年龄是一样的，则返回的hash值也是一样的
    return (name + age).hashCode();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o instanceof Student) {
      Student s = (Student) o;
      if (this.name.equals(s.getName()) && this.age == s.age) {
        return true;
      }
    }
    return false;
  }
}
/*

*/
