package Practise.Day7;
/*
@ClassName:     StudentTest
@Author:        YangXu
@Need:
@Date:          2022/4/10
@Time:          2022-04-10 0:36
*/

//

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
  public static void main(String[] args) {
    //
    ArrayList<Student> arrayList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    while (true) {
      int input = scanner.nextInt();
      System.out.println("1新增学生");
      if (input == 1) {
        System.out.println("新增学生");
        StudentTools studentTools = new StudentTools();
        System.out.println("请输入学生的姓名:");
        String name = scanner.next();
        System.out.println("请输入学生的年龄:");
        int age = scanner.nextInt();
        System.out.println("请输入学生的性别:");
        String sex = scanner.next();
        System.out.println("请输入学生的班级:");
        String cla = scanner.next();
        studentTools.add(name, age, sex, cla);
        arrayList.add(studentTools);
        break;
      } else if (input == 2) {
        System.out.println("查询学生");
      } else if (input == 3) {
        System.out.println("删除学生");
      } else if (input == 4) {
        System.out.println("修改学生");
      } else if (input == 5) {
        System.out.println("退出系统");
      } else {
        System.out.println("输入错误");
        continue;
      }
    }
    for (Student s : arrayList) {
      System.out.println(s.getName() + "\t" + s.getAge() + "\t" + s.getSex() + "\t" + s.getClas());
    }
  }
}
/*

*/
