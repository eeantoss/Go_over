package SuperTest.StudentDemo.Test;
/*
@ClassName:     StudentTest
@Author:        YangXu
@Need:
@Date:          2022/4/11
@Time:          2022-04-11 22:53
*/

// 学生测试类

import SuperTest.StudentDemo.Service.StudentTools;
import SuperTest.StudentDemo.Student.Student;
import SuperTest.StudentDemo.View.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
  public static void main(String[] args) {
    //
    ArrayList<Student> arrayList = new ArrayList<>();
    StudentTools studentTools = new StudentTools();
    Scanner scanner = new Scanner(System.in);
    Menu menu = new Menu();

    while (true) {
      menu.Menu();
      System.out.println("请输入你的选择:");
      int input = scanner.nextInt();
      if (input == 1) {
        studentTools.add(arrayList);
      } else if (input == 2) {
        studentTools.query(arrayList);
      } else if (input == 3) {
        studentTools.delete(arrayList);
      } else if (input == 4) {
        studentTools.update(arrayList);
      } else if (input == 5) {
        System.out.println("欢迎下次使用");
        System.exit(666);
      } else {
        System.out.println("输入错误");
      }
    }
  }
}
/*

*/
