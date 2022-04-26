package StudentsManager.View;
/*
@ClassName:     Menu
@Author:        YangXu
@Need:
@Date:          2022/4/15
@Time:          2022-04-15 21:10
*/

//

import StudentsManager.Service.StudentImp;
import StudentsManager.Student.Student;

import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author Yx
 */
public class Menu {
  public void print() throws SQLException {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("----学生管理系统----");
      System.out.println("1、增加学生");
      System.out.println("2、删除学生");
      System.out.println("3、查询学生");
      System.out.println("4、修改学生");
      System.out.println("5、退出系统");
      System.out.println("请输入你的选择:");
      int i = scanner.nextInt();
      select(i);
    }
  }

  public void select(int num) throws SQLException {
    StudentImp studentImp = new StudentImp();
    Student student = new Student();
    if (num == 1) {
      studentImp.addStudent();
    } else if (num == 2) {
      studentImp.delStudent(student);
    } else if (num == 3) {
      studentImp.findAllStu(student);
    } else if (num == 4) {
      studentImp.update(student);
    } else if (num == 5) {
      System.out.println("欢迎下次使用！");
      System.exit(666);
    } else {
      System.out.println("输入错误");
    }
  }
}
/*

*/
