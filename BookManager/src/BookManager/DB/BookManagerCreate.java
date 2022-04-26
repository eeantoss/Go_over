package BookManager.DB;
/*
@ClassName:     BookManagerCreate
@Author:        YangXu
@Need:
@Date:          2022/4/16
@Time:          2022-04-16 23:21
*/

//

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BookManagerCreate {
  private static final String url =
      "jdbc:mysql://localhost:3306/book?useUnicode=true&characterEncoding=utf-8";
  private static final String user = "root";
  private static final String password = "root";

  public static void main(String[] args) throws SQLException {
    Connection connection = DriverManager.getConnection(url, user, password);
    Statement statement = connection.createStatement();
    // 写一行sql语句，创建book表 int类型的id并且不能重复,varchar类型的 name、price、author、publish、date类型的publishDate
    String sql =
        "create table book(id int primary key auto_increment,name varchar(20),price double,author varchar(20),publish varchar(20),publishDate date)";

    //    String sql =
    //        "create table book(id int primary key auto_increment,name varchar(20),price
    // double,author varchar(20),publish varchar(20),publishDate date)";

    //    String sql = "create table book()";
    statement.execute(sql);
  }
}
/*

*/
