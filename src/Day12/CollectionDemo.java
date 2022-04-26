package Day12;
/*
@ClassName:     CollectionDemo
@Author:        YangXu
@Need:
@Date:          2022/4/5
@Time:          10:15
*/

//

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionDemo {
  public static void main(String[] args) {
    //
    Collection<String> collection = new ArrayList<>();
    // 添加元素
    collection.add("张三");
    collection.add("张三");
    collection.add("李四");
    collection.add("李四");
    collection.add("王五");
    collection.add("王五");
    System.out.println("添加后" + collection);
    // 删除元素
    collection.remove("王五");
    collection.remove("李四");
    System.out.println("删除后" + collection);
    // 查看集合的长度
    System.out.println(collection.size());
    // 判断集合是否为空
    boolean empty = collection.isEmpty();
    System.out.println(empty);
    // 判断该元素是否存在于集合中
    boolean isExist = collection.contains("张三");
    if (isExist) {
      System.out.println("存在");
    } else {
      System.out.println("不存在");
    }
    // 清空所有的元素
    collection.clear();
    System.out.println(collection);

    List l = new ArrayList<>();
    l.add(0, "王五");
    l.add(1, "李四");
    System.out.println(l);

    boolean empty1 = l.isEmpty();
    System.out.println(empty1);
    if (empty == false) {
      l.clear();
      System.out.println(l);
    } else {
      System.out.println(l);
    }
  }
}
/*

*/
