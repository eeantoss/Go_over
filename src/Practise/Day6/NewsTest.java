package Practise.Day6;
/*
@ClassName:     NewsTest
@Author:        YangXu
@Need:
@Date:          2022/4/6
@Time:          2022-04-06 21:52
*/

//

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class NewsTest {
  public static void main(String[] args) {

    News news = new News("4-5新闻12312341534564");
    News news1 = new News("4-6新闻456457usafda sd");
    News news2 = new News("4-6新闻");
    news.setContent("南方的回南天你见过吗？");
    news1.setContent("如果北方没有暖气会怎么样？");
    ArrayList<News> arrayList = new ArrayList<>();
    // 添加新闻的标题进去
    arrayList.add(news);
    arrayList.add(news1);
    arrayList.add(news2);
    // 反转集合
    Collections.reverse(arrayList);

    // 倒叙遍历
    ListIterator<News> listIterator = arrayList.listIterator();
    while (listIterator.hasNext()) {
      News s = listIterator.next();
      System.out.println(s.toString());
    }
  }
  // 重写toString方法

}
/*

*/
