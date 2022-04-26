package BookManager.Book;
/*
@ClassName:     Book
@Author:        YangXu
@Need:          图书信息包括编号、作者、书名、出版社、出版时
间、图书状态（已借/未借）
@Date:          2022/4/16
@Time:          2022-04-16 23:03
*/

//

import java.util.ArrayList;

public class Book {
  private String name; // 书名

  public Book() {}

  private long Id; // 编号
  private String auther; // 作者
  private String press; // 出版社
  private String pressTime; // 出版时间
  private int state; // 图书状态 1、已借 0、未借

  public Book(String name, long id, String auther, String press, String pressTime, int state) {
    this.name = name;
    Id = id;
    this.auther = auther;
    this.press = press;
    this.pressTime = pressTime;
    this.state = state;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getId() {
    return Id;
  }

  public void setId(long id) {
    Id = id;
  }

  public String getAuther() {
    return auther;
  }

  public void setAuther(String auther) {
    this.auther = auther;
  }

  public String getPress() {
    return press;
  }

  public void setPress(String press) {
    this.press = press;
  }

  public String getPressTime() {
    return pressTime;
  }

  public void setPressTime(String pressTime) {
    this.pressTime = pressTime;
  }

  public int getState() {
    return state;
  }

  public void setState(int state) {
    this.state = state;
  }

  public ArrayList<Book> books(
      String name, long id, String auther, String press, String pressTime, int state) {
    ArrayList<Book> bookList = new ArrayList<>();
    bookList.add(new Book(name, id, auther, press, pressTime, state));
    return bookList;
  }
}

/*

*/
