package StudentsManager.DB;
/*
@ClassName:     ConnectDB
@Author:        YangXu
@Need:
@Date:          2022/4/15
@Time:          2022-04-15 11:47
*/

//

import java.sql.*;

public class ConnectDB {
  private static final String Driver = "com.mysql.jdbc.Driver";
  private static final String user = "root";
  private static final String pass = "root";
  private static final String url =
      "jdbc:mysql://localhost:3306/stu?useUnicode=true&characterEncoding=UTF8";

  public static void main(String[] args) throws SQLException {
    //
    Connection connection = DriverManager.getConnection(url, user, pass);
    Statement statement = connection.createStatement();
    String sql =
        "CREATE TABLE `stu` (\n"
            + "  `id` bigint(200) NOT NULL COMMENT '学号',\n"
            + "  `name` varchar(20) COLLATE utf8mb4_bin NOT NULL COMMENT '姓名',\n"
            + "  `age` int(20) DEFAULT NULL COMMENT '年龄',\n"
            + "  `class` varchar(20) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '班级',\n"
            + "  PRIMARY KEY (`id`)\n"
            + ") ENGINE=MyISAM AUTO_INCREMENT=1001 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;";
    statement.execute(sql);
    System.out.println("建表成功");
    statement.close();
  }

  public Statement getConnect() {
    Connection connection = null;
    Statement statement = null;
    try {
      connection = DriverManager.getConnection(url, user, pass);
      statement = connection.createStatement();

    } catch (SQLException e) {
      e.printStackTrace();
    }
    return statement;
  }

  public void cloes(Connection connection, Statement statement, ResultSet resultSet) {
    try {
      if (connection != null) {
        connection.close();
      }
      if (statement != null) {
        statement.close();
      }
      if (resultSet != null) {
        resultSet.close();
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
/*

*/
