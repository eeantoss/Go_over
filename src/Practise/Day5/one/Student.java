package Practise.Day5.one; /*
                           @ClassName:     Student
                           @Author:        YangXu
                           @Need:
                           @Date:          2022/3/29
                           @Time:          20:19
                           */

//

public class Student {
  private String name;
  private int age;
  private char sex;
  private String banji;

  public Student(String name, int age, char sex, String banji) {
    this.name = name;
    this.age = age;
    this.sex = sex;
    this.banji = banji;
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

  public char getSex() {
    return sex;
  }

  public void setSex(char sex) {
    this.sex = sex;
  }

  public String getBanji() {
    return banji;
  }

  public void setBanji(String banji) {
    this.banji = banji;
  }

  public void show() {
    System.out.println(this.name);
    System.out.println(this.age);
    System.out.println(this.sex);
    System.out.println(this.banji);
  }
}
/*
V
*/
