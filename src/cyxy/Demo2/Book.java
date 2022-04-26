package cyxy.Demo2;
/*
@ClassName:     Book
@Author:        YangXu
@Need:
@Date:          2022/4/4
@Time:          10:55
*/

//

import java.util.Scanner;

/*
3、编写类Book,  定义方法updatePrice，实现更改某本书的价格，
具体：如果价格>150,则更改为150，如果价格>100,更改为100，否则不变
	提示：
	1. 类名 Book
	2. 属性 price, name
	3. 方法名 updatePrice
	4. 形参 ()
	5. 返回值 void
	6. 提供一个构造器
 */
public class Book {

  String name;
  int price;

  public void updatePrice() {
    if (price > 150) {
      price = 150;
    } else if (price > 100) {
      price = 100;
    } else {
      price = price;
    }
  }

  public Book(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public static void main(String[] args) {
    //
    Scanner scanner = new Scanner(System.in);
    String name = scanner.next();
    int price = scanner.nextInt();
    Book book = new Book(name, price);
    book.updatePrice();
    System.out.println(book.price);
  }
}
/*

*/
