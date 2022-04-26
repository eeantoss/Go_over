package StudentsManager.Service;
/*
@ClassName:     StudentImp
@Author:        YangXu
@Need:
@Date:          2022/4/15
@Time:          2022-04-15 11:44
*/

//

import StudentsManager.Student.Student;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

import java.sql.*;
import java.util.Scanner;

public class StudentImp implements IntStudent {
  private static Scanner scanner = new Scanner(System.in);
  private static final String user = "root";
  private static final String pass = "root";
  private static final String url =
      "jdbc:mysql://localhost:3306/stu?useUnicode=true&characterEncoding=utf-8";

  @Override
  public void addStudent() {
    System.out.println("请输入学生的学号:");
    long id = scanner.nextLong();
    if (checkId(id)) {
      System.out.println("该学号已存在");
    } else {
      System.out.println("请输入学生的姓名:");
      String name = scanner.next();
      System.out.println("请输入学生的年龄:");
      int age = scanner.nextInt();
      System.out.println("请输入学生的班级:");
      String cla = scanner.next();

      Student student = new Student();
      student.setId(id);
      student.setName(name);
      student.setAge(age);
      student.setBanji(cla);
      saveStu(student);
    }
  }

  private void saveStu(Student student) {
    Statement statement = null;
    Connection connection = null;
    try {
      connection = DriverManager.getConnection(url, user, pass);
      statement = connection.createStatement();
      String sql =
          "insert into stu (id ,name ,age,class) values("
              + student.getId()
              + ",'"
              + student.getName()
              + "','"
              + student.getAge()
              + "','"
              + student.getBanji()
              + "')";
      statement.execute(sql);
      /*  String sql ="insert into stu (id ,name ,age,class) values(?,?,?,?)";
      PreparedStatement preparedStatement = connection.prepareStatement(sql);
      preparedStatement.setLong(1, student.getId());
      preparedStatement.setString(2, student.getName());
      preparedStatement.setInt(3, student.getAge());
      preparedStatement.setString(4, student.getBanji());
      preparedStatement.execute();*/
      System.out.println("添加成功");
    } catch (MySQLIntegrityConstraintViolationException e) {
      System.out.println("添加失败！！！");
      System.out.println("学号不能重复");
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        statement.close();
        connection.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }

  @Override
  public void delStudent(Student student) throws SQLException {
    Connection connection = null;
    Statement statement = null;
    System.out.println("请输入你要删除学生的学号:");
    long i = scanner.nextLong();
    if (checkId(i)) {
      connection = DriverManager.getConnection(url, user, pass);
      statement = connection.createStatement();
      String sql = "DELETE FROM stu WHERE id= " + i;
      //      PreparedStatement preparedStatement = connection.prepareStatement(sql);

      statement.execute(sql);
      System.out.println("删除成功");
      connection.close();
      statement.close();
    } else {
      System.out.println("该学号不存在");
    }
  }

  @Override
  public void findAllStu(Student student) throws SQLException {
    Connection connection = DriverManager.getConnection(url, user, pass);
    Statement statement = connection.createStatement();
    String sql = "SELECT * FROM stu";
    ResultSet resultSet = statement.executeQuery(sql);
    System.out.println("学号\t\t\t\t姓名\t\t年龄\t\t班级");
    while (resultSet.next()) {
      long id = resultSet.getLong("id");
      String name = resultSet.getString("name");
      String age = resultSet.getString("age");
      String cla = resultSet.getString("class");
      System.out.println(id + "\t\t" + name + "\t\t" + age + "\t\t" + cla);
    }
    connection.close();
    resultSet.close();
    statement.close();
  }

  @Override
  public void findByStu(Student student) {}

  @Override
  public void update(Student student) {
    Statement statement = null;
    Connection connection = null;
    System.out.println("请输入要修改学生的学号:");
    long id = scanner.nextLong();
    if (!checkId(id)) {
      System.out.println("你输入的学号不存在");
    } else {
      try {
        connection = DriverManager.getConnection(url, user, pass);
        statement = connection.createStatement();
        System.out.println("请输入新的学生姓名:");
        String name = scanner.next();
        System.out.println("请输入新的年龄:");
        int age = scanner.nextInt();
        System.out.println("请输入新的班级:");
        String cla = scanner.next();

        student.setName(name);
        student.setId(id);
        student.setAge(age);
        student.setBanji(cla);

        String sql =
            "UPDATE stu set name='"
                + student.getName()
                + "',age='"
                + student.getAge()
                + "',class='"
                + student.getBanji()
                + "' WHERE id="
                + id;
        statement.execute(sql);
        System.out.println("修改成功");
      } catch (SQLException e) {
        e.printStackTrace();
      } finally {
        try {
          statement.close();
          connection.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
  }

  public boolean checkId(long id) {
    Connection connection = null;
    Statement statement = null;
    try {
      connection = DriverManager.getConnection(url, user, pass);
      statement = connection.createStatement();
      String sql = "select * from stu where id= " + id;
      statement.execute(sql);
      ResultSet resultSet = statement.getResultSet();
      if (resultSet.next()) {
        long id1 = resultSet.getLong("id");
        if (id1 == id) {
          return true;
        } else {
          return false;
        }
      } else {
        return false;
      }
    } catch (SQLException e) {
      e.printStackTrace();
      return false;
    } finally {
      try {
        statement.close();
        connection.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }
}
/*

*/
