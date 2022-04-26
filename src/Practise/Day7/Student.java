package Practise.Day7;
/*
@ClassName:     Student
@Author:        YangXu
@Need:
@Date:          2022/4/10
@Time:          2022-04-10 0:18
*/

//

public class Student {
  // 提供成员变量 name 、age 、 sex 、class
  private String name;
  private int age;
  private String sex;
  private String clas;

  public Student(String name, int age, String sex, String clas) {
    this.name = name;
    this.age = age;
    this.sex = sex;
    this.clas = clas;
  }

  public Student() {}

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

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public String getClas() {
    return clas;
  }

  public void setClas(String clas) {
    this.clas = clas;
  }
}
/*

*/
