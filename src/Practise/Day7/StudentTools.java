package Practise.Day7;
/*
@ClassName:     StudentTools
@Author:        YangXu
@Need:
@Date:          2022/4/10
@Time:          2022-04-10 0:20
*/

//

public class StudentTools extends Student {
  public StudentTools() {}

  public StudentTools(String name, int age, String sex, String clas) {}

  // 添加学生方法
  public Student add(String name, int age, String sex, String clas) {
    Student student = new Student();
    student.setName(name);
    student.setAge(age);
    student.setSex(sex);
    student.setClas(clas);
    return student;
  }

  public void update(String name, int age, String sex, String clas) {}

  public void delete(String name, int age, String sex, String clas) {}
}

/*

*/
