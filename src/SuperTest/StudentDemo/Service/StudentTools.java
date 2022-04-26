package SuperTest.StudentDemo.Service;
/*
@ClassName:     StudentTools
@Author:        YangXu
@Need:
@Date:          2022/4/11
@Time:          2022-04-11 22:17
*/

//

import SuperTest.StudentDemo.Student.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTools implements Tools {

  @Override
  public void add(ArrayList<Student> arrayList) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入学生的姓名：");
    String name = scanner.next();
    System.out.println("请输入学生的年龄：");
    int age = scanner.nextInt();
    System.out.println("请输入学生的性别：");
    String sex = scanner.next();
    System.out.println("请输入学生的班级：");
    String clas = scanner.next();
    System.out.println("请输入学生的学号：");
    int id = scanner.nextInt();
    if (checkId(arrayList, id)) {
      System.out.println("该学号已存在");
      System.out.println("添加失败！！！");
    } else {
      Student student = new Student(name, age, sex, clas, id);
      arrayList.add(student);
      System.out.println("添加学生成功");
    }
  }

  @Override
  public void update(ArrayList<Student> arrayList) {
    // 修改
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入要修改的学生姓名：");
    String name = scanner.next();
    int flag = 666;
    for (int i = 0; i < arrayList.size(); i++) {
      //
      if (arrayList.get(i).getName().equals(name)) {
        flag = i;
        break;
      }
    }
    if (flag == 666) {
      System.out.println("没有该学生");
    } else {
      System.out.println("请输入学生新的年龄：");
      int newAge = scanner.nextInt();
      arrayList.get(flag).setAge(newAge);
      System.out.println("请输入学生新的性别:");
      String newSex = scanner.next();
      arrayList.get(flag).setSex(newSex);
      System.out.println("请输入学生新的班级:");
      String newClass = scanner.next();
      arrayList.get(flag).setClas(newClass);
      System.out.println("请输入学生新的学号：");
      int newId = scanner.nextInt();
      arrayList.get(flag).setId(newId);
      System.out.println("修改成功");
    }
  }

  @Override
  public void delete(ArrayList<Student> arrayList) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入要删除学生的姓名：");
    String name = scanner.next();
    int flag = 666;

    //
    for (int i = 0; i < arrayList.size(); i++) {
      //
      Student s = arrayList.get(i);
      if (s.getName().equals(name)) {
        flag = i;
        break;
      }
    }
    if (flag == 666) {
      System.out.println("该学生不存在");
    } else {
      arrayList.remove(flag);
      System.out.println("删除成功");
    }
  }

  @Override
  // 查询
  public void query(ArrayList<Student> arrayList) {
    System.out.println("姓名:\t\t年龄\t\t性别\t\t班级\t\t学号");
    for (Student s : arrayList) {
      System.out.println(
          s.getName()
              + "\t\t"
              + s.getAge()
              + "\t\t"
              + s.getSex()
              + "\t\t"
              + s.getClas()
              + "\t\t"
              + s.getId());
    }
    System.out.println("查询操作完成");
  }
  // 检查id是否重复
  public boolean checkId(ArrayList<Student> arrayList, int id) {
    for (Student s : arrayList) {
      if (s.getId() == id) {
        return true;
      }
    }
    return false;
  }
}

/*

*/
