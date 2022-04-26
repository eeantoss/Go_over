package BookManager.Service;

import BookManager.Book.Book;

// 1、新增图书；2、查询图书
// 列表；3、修改图书；4、删除图书；5、退出系统
public interface BookInterface {
  // 新增图书
  public void addBook(Book book);
  // 查询图书
  public void sechor(Book book);
  // 修改图书
  public void update(Book book);
  // 删除图书
  public void delBook(Book book);
  // 退出系统
  public void exit();
}
