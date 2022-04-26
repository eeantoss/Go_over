package StudentsManager.Student;
/*
@ClassName:     Student
@Author:        YangXu
@Need:
@Date:          2022/4/15
@Time:          2022-04-15 11:38
*/

//

import java.util.ArrayList;

public class Student {
  private long id;
  private String name;
  private int age;
  private String banji;

  // 有参构造方法
  public Student(long id, String name, int age, String banji) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.banji = banji;
  }

  public Student() {}

  public long getId() {
    return id;
  }

  public void setId(long id) {
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

  public String getBanji() {
    return banji;
  }

  public void setBanji(String banji) {
    this.banji = banji;
  }

  public ArrayList<Student> studentsTools(long id, String name, int age, String banji) {
    ArrayList<Student> students = new ArrayList<Student>();
    students.add(new Student(id, name, age, banji));
    return students;
  }
}
/*

*/
