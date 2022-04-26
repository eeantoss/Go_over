package Day13.SetDemo;
/*
@ClassName:     SetTest
@Author:        YangXu
@Need:
@Date:          2022/4/7
@Time:          2022-04-07 9:01
*/

/*
   //Set集合的特点
   //1.不能存储重复的元素
   //2.不能存储null
   //3.不能存储数组
   //4.不能存储对象
   //5.不能存储基本数据类型
   //6.不能存储引用数据类型
   //7.不能存储基本数据类型的数组
   //8.不能存储引用数据类型的数组
   //9.不能存储基本数据类型的对象
     // 没有索引，只能通过迭代器或者增强for循环遍历
*/

import java.util.HashSet;
import java.util.Set;

public class SetTest {
  public static void main(String[] args) {

    Set<String> set = new HashSet<>();
    // 添加元素
    set.add("张三");
    set.add("李四");
    set.add("王五");

    // 输出集合
    System.out.println(set);

    // 遍历
    // 迭代器遍历集合
    for (String s : set) {
      System.out.println(s);
    }

    System.out.println("===========================");

    // 删除元素
    set.remove("李四");
    set.remove("张三");

    // 输出删除后的集合
    System.out.println("删除后的集合:" + set);

    // 判断集合是否为空
    if (set.isEmpty()) {
      System.out.println("集合为空");
    } else {
      System.out.println("集合不为空");
    }

    // 判断张三是否存在于集合中
    if (set.contains("张三")) {
      System.out.println("集合中存在张三");
    } else {
      System.out.println("集合中不存在张三");
    }

    // 添加元素到集合
    set.add("刘六");

    // 获取集合的大小
    System.out.println(set.size());

    // 清空集合
    set.clear();
    // 输出清空后的集合
    System.out.println("清空后的集合:" + set);
  }
}
/*

*/
