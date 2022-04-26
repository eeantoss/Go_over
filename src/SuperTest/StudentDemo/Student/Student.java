package SuperTest.StudentDemo.Student;
/*
@ClassName:     Student
@Author:        YangXu
@Need:
@Date:          2022/4/11
@Time:          2022-04-11 22:13
*/

//

public class Student {
  private String name;
  private int age;
  private String sex;
  private String clas;
  private int id;

  public Student() {}

  public Student(String name, int age, String sex, String clas, int id) {
    this.name = name;
    this.age = age;
    this.sex = sex;
    this.clas = clas;
    this.id = id;
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

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}
/*

*/
