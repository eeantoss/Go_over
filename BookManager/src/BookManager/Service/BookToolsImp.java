package BookManager.Service;
/*
@ClassName:     BookToolsImp
@Author:        YangXu
@Need:
@Date:          2022/4/16
@Time:          2022-04-16 23:14
*/

// 实现类

import BookManager.Book.Book;

import java.sql.*;
import java.util.Scanner;

public class BookToolsImp implements BookInterface {
  private static Scanner scanner = new Scanner(System.in);
  private final String name = "root";
  private static final String password = "root";
  private static final String url =
      "jdbc:mysql://localhost:3306/book?useUnicode=true&characterEncoding=utf-8";

  @Override
  public void addBook(Book book) {
    System.out.println("请输入编号:");
    long id = scanner.nextLong();
    System.out.println("请输入书名：");
    String name = scanner.next();
    System.out.println("请输入作者：");
    String author = scanner.next();
    System.out.println("请输入出版社：");
    String publish = scanner.next();
    System.out.println("请输入图书状态: \n0.在库\n1.借出");
    int status = scanner.nextInt();

    // 时间
    System.out.println("请输入时间：");
    String time = scanner.next();
    Statement statement = null;

    book.setId(id);
    book.setAuther(author);
    book.setName(name);
    book.setPress(publish);
    book.setState(status);

    try {
      Connection connection = DriverManager.getConnection(url, this.name, password);
      statement = connection.createStatement();
      // 插入数据库
      String sql =
          ""
              + "insert into book values("
              + id
              + ",'"
              + name
              + "','"
              + author
              + "','"
              + publish
              + "','"
              + time
              + "',"
              + status
              + ")";
      statement.execute(sql);
      System.out.println("添加图书成功");
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        statement.close();
      } catch (SQLException e) {
        System.out.println("资源关闭异常");
        e.printStackTrace();
      }
    }
  }

  @Override
  public void sechor(Book book) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入要查询的方式: \n1.书名\n2.作者");
    int input = scanner.nextInt();
    if (input == 1) {
      System.out.println("请输入id:");
      long id = scanner.nextLong();
      if (checkId(id)) {
        findId(id);
      } else {
        System.out.println("没有该编号的书");
      }
    } else if (input == 2) {
      System.out.println("请输入作者:");
      String author = scanner.next();
      if (checkAuther(author)) {
        findAuther(author);
      } else {
        System.out.println("没有该作者的书");
      }
    }
  }

  private boolean checkAuther(String author) {
    Connection connection = null;
    Statement statement = null;
    try {
      connection = DriverManager.getConnection(url, name, password);
      statement = connection.createStatement();
      String sql = "select * from book where author = '" + author + "'";
      ResultSet resultSet = statement.executeQuery(sql);
      if (resultSet.next()) {
        return true;
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        statement.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    return false;
  }

  @Override
  public void update(Book book) {
    // 修改图书
    Connection connection = null;
    Statement statement = null;
    Scanner scanner = new Scanner(System.in);
    try {
      connection = DriverManager.getConnection(url, name, password);
      statement = connection.createStatement();
      System.out.println("请输入要修改的图书编号:");
      long id = scanner.nextLong();
      if (checkId(id)) {
        System.out.println("请输入要修改的内容: \n1.书名\n2.作者\n3.出版社\n4.状态");
        int input = scanner.nextInt();
        if (input == 1) {
          System.out.println("请输入书名：");
          String name = scanner.next();
          String sql = "update book set name = '" + name + "' where id = " + id;
          statement.execute(sql);
          System.out.println("修改成功");

        } else if (input == 2) {
          System.out.println("请输入作者：");
          String author = scanner.next();
          String sql = "update book set author = '" + author + "' where id = " + id;
          statement.execute(sql);
          System.out.println("修改成功");

        } else if (input == 3) {
          System.out.println("请输入出版社：");
          String publish = scanner.next();
          String sql = "update book set press = '" + publish + "' where id = " + id;
          statement.execute(sql);
          System.out.println("修改成功");
        } else if (input == 4) {
          System.out.println("请输入图书状态: \n0.在库\n1.借出");
          int status = scanner.nextInt();
          String sql = "update book set state = " + status + " where id = " + id;
          statement.execute(sql);
          System.out.println("修改成功");
        }
      } else {
        System.out.println("没有该编号的书");
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        statement.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }

  @Override
  public void delBook(Book book) {
    Connection connection = null;
    Statement statement = null;
    try {
      connection = DriverManager.getConnection(url, name, password);
      statement = connection.createStatement();
      System.out.println("请输入要删除的编号:");
      long id = scanner.nextLong();
      if (checkId(id)) {
        String sql = "delete from book where id = " + id;
        statement.execute(sql);
        System.out.println("删除编号:" + id + "的书成功");
      } else {
        System.out.println("没有该编号的书");
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        statement.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }

  @Override
  public void exit() {
    System.out.println("欢迎下次光临!");
    System.exit(666);
  }

  public boolean checkId(long id) {
    Connection connection = null;
    Connection connection1 = null;
    Statement statement = null;
    try {
      connection = DriverManager.getConnection(url, name, password);
      statement = connection.createStatement();
      String sql = "select * from book where id= " + id;
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
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }

  public void findId(long id) {
    Connection connection = null;
    Statement statement = null;
    try {
      connection = DriverManager.getConnection(url, name, password);
      statement = connection.createStatement();
      //      long id = scanner.nextLong();
      String sql = "select * from book where id= " + id;
      statement.execute(sql);
      ResultSet resultSet = statement.getResultSet();
      if (resultSet.next()) {
        long id1 = resultSet.getLong("id");
        if (checkId(id)) {
          //          遍历(resultSet);
          while (resultSet.next()) {

            System.out.println("编号:" + id1);
            System.out.println("书名:" + resultSet.getString("name"));
            System.out.println("作者:" + resultSet.getString("author"));
            System.out.println("出版社:" + resultSet.getString("publish"));
            int state = resultSet.getInt("state");
            if (state == 0) {
              System.out.println("状态:在库");
            } else if (state == 1) {
              System.out.println("状态:借出");
            }
            //          System.out.println("状态:" + resultSet.getInt("state"));
            System.out.println("出版时间:" + resultSet.getString("publishDate"));
          }
        } else {
          System.out.println("没有该编号的书");
        }
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        statement.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }

  public void findAuther(String auther) {
    Connection connection = null;
    Statement statement = null;
    try {
      connection = DriverManager.getConnection(url, name, password);
      statement = connection.createStatement();
      String sql = "select * from book where author= '" + auther + "'";
      statement.executeQuery(sql);
      ResultSet resultSet = statement.getResultSet();
      System.out.println("--------------------------------");
      while (resultSet.next()) {
        System.out.println("编号:" + resultSet.getLong("id"));
        System.out.println("书名:" + resultSet.getString("name"));
        System.out.println("作者:" + resultSet.getString("author"));
        System.out.println("出版社:" + resultSet.getString("publish"));
        int state = resultSet.getInt("state");
        if (state == 0) {
          System.out.println("状态:在库");
        } else if (state == 1) {
          System.out.println("状态:借出");
        }
        //        System.out.println("状态:" + resultSet.getInt("state"));
        System.out.println("出版时间:" + resultSet.getString("publishDate"));
        System.out.println("----------------------------------");
      }

    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        statement.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }
}
/*

*/
