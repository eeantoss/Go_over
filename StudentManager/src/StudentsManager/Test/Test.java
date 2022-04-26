package StudentsManager.Test;
/*
@ClassName:     Test
@Author:        YangXu
@Need:
@Date:          2022/4/15
@Time:          2022-04-15 21:13
*/

//

import StudentsManager.Service.StudentImp;
import StudentsManager.View.Menu;

import java.sql.SQLException;
import java.util.Scanner;

public class Test {
  public static void main(String[] args) throws SQLException {
    //
    Scanner scanner = new Scanner(System.in);
    Menu menu = new Menu();
    menu.print();
    int in = scanner.nextInt();
    menu.select(in);
    StudentImp studentImp = new StudentImp();
  }
}
/*

*/
