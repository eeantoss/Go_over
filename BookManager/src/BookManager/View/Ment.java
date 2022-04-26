package BookManager.View;
/*
@ClassName:     Ment
@Author:        YangXu
@Need:
@Date:          2022/4/17
@Time:          2022-04-17 17:05
*/

//

import BookManager.Book.Book;
import BookManager.Service.BookToolsImp;

import java.util.Scanner;

public class Ment {
  private static Book book = new Book();
  BookToolsImp bookToolsImp = new BookToolsImp();

  public void printMenu() {
    while (true) {
      System.out.println("*****图书管理系统*****");
      System.out.println("1.添加图书");
      System.out.println("2.删除图书");
      System.out.println("3.修改图书");
      System.out.println("4.查询图书");
      System.out.println("5.退出系统");
      System.out.println("请输入您的选择：");
      Scanner scanner = new Scanner(System.in);

      int i = scanner.nextInt();
      selectMenu(i);
    }
  }

  public void selectMenu(int num) {

    if (num == 1) {
      System.out.println("您选择了添加图书");
      bookToolsImp.addBook(book);

    } else if (num == 2) {
      System.out.println("您选择了删除图书");
      bookToolsImp.delBook(book);

    } else if (num == 3) {
      System.out.println("您选择了修改图书");
      bookToolsImp.update(book);

    } else if (num == 4) {
      System.out.println("您选择了查询图书");
      bookToolsImp.sechor(book);

    } else if (num == 5) {
      System.out.println("您选择了退出系统");
      bookToolsImp.exit();
    } else {
      System.out.println("输入错误，请重新输入");
    }
  }
}
/*

*/
