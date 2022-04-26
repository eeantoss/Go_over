package StudentsManager.Student;
/*
@ClassName:     StudentArrayList
@Author:        YangXu
@Need:
@Date:          2022/4/17
@Time:          2022-04-17 15:14
*/

//

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentArrayList extends Student {
  public static void main(String[] args) {
    //
    ArrayList<Student> students = new ArrayList<>();
    students.add(new Student(2020, "张三", 18, "计网1班"));
    students.add(new Student(2021, "李四", 19, "计算机1班"));
    students.add(new Student(2022, "王五", 20, "计算机2班"));
    students.add(new Student(2023, "赵六", 21, "计算机3班"));
    students.add(new Student(2024, "钱七", 22, "计算机4班"));
    students.add(new Student(2025, "孙八", 23, "计算机5班"));
    students.add(new Student(2026, "周九", 24, "计算机6班"));
    students.add(new Student(2027, "吴十", 25, "计算机7班"));
    students.add(new Student(2028, "郑十一", 26, "计算机8班"));

    try {
      Connection connection =
          DriverManager.getConnection(
              "jdbc:mysql://localhost:3306/stu?useUnicode=true&characterEncoding=utf-8&useSSL=false",
              "root",
              "root");
      Statement statement = connection.createStatement();
      for (Student student : students) {
        String sql =
            "insert into stu(id,name,age,class) values("
                + student.getId()
                + ",'"
                + student.getName()
                + "',"
                + student.getAge()
                + ",'"
                + student.getBanji()
                + "')";
        statement.executeUpdate(sql);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

/*

*/
