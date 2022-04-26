package Practise.Day6;
/*
@ClassName:     New
@Author:        YangXu
@Need:
@Date:          2022/4/6
@Time:          2022-04-06 21:50
*/

//

public class News {
  // 封装一个新闻类，包含标题和内容属性，提供get、set方法
  private String title;
  private String content;

  public News(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
  // 重写toString方法对新闻标题进行处理，超过10字的只保留前10个，然后在后边加“…”

  @Override
  public String toString() {
    if (title.length() > 10) {
      return title.substring(0, 10) + "...";
    } else {
      return title;
    }
  }
}
/*

*/
