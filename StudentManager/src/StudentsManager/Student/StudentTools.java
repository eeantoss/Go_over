package StudentsManager.Student;
/*
@ClassName:     StudentTools
@Author:        YangXu
@Need:
@Date:          2022/4/17
@Time:          2022-04-17 15:26
*/

//

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentTools {
  public static void main(String[] args) {
    Student student = new Student();
    Scanner scanner = new Scanner(System.in);
    try {
      Connection connection =
          DriverManager.getConnection(
              "jdbc:mysql://localhost:3306/stu?serverTimezone=GMT%2B8", "root", "root");
      long id = scanner.nextLong();
      String name = scanner.next();
      int age = scanner.nextInt();
      String className = scanner.next();
      Statement statement = connection.createStatement();
      ArrayList<Student> students = student.studentsTools(id, name, age, className);
      for (Student student1 : students) {
        /* String sql =
        "insert into stu(id,name,age,class) values("
            + student1.getId()
            + ",'"
            + student1.getName()
            + "',"
            + student1.getAge()
            + ",'"
            + student1.getBanji()
            + "')";*/
        String sql = "insert into stu(id,name,age,class) values(?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setLong(1, student1.getId());
        preparedStatement.setString(2, student1.getName());
        preparedStatement.setInt(3, student1.getAge());
        preparedStatement.setString(4, student1.getBanji());
        preparedStatement.executeUpdate();
        statement.executeUpdate(sql);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}

/*

*/
