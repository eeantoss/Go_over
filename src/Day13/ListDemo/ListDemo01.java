package Day13.ListDemo;
/*
@ClassName:     ListDemo01
@Author:        YangXu
@Need:
@Date:          2022/4/6
@Time:          2022-04-06 9:16
*/

//

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo01 {
  public static void main(String[] args) {
    //    test1();
    //    test2();
    test3();
  }

  public static void test1() {
    // 声明一个list集合
    List<String> l = new ArrayList<>();
    // 向list集合里面添加元素
    l.add("张三");
    l.add("李四");
    l.add("王五");
    l.add("刘六");
    l.add("张三");

    System.out.println(l); // 打印集合
    boolean empty = l.isEmpty(); // 判断集合是否为空

    if (empty) {
      System.out.println("是空的");
    } else {
      System.out.println("不是空的");
    }

    // 输出集合的长度
    System.out.println(l.size());

    Iterator<String> iterator = l.iterator();
    while (iterator.hasNext()) {
      String s = iterator.next();
      System.out.println(s);
    }

    //    l.remove("张三");
    //    System.out.println(l); // 输出删除张三后的list集合
    l.remove("张三");
    System.out.println(l); // 输出删除张三后的list集合

    // contain
    boolean contains = l.contains("李四");
    if (contains) {
      System.out.println("有李四");
    } else {
      System.out.println("没有李四");
    }

    l.clear(); // 清空list集合的所有元素
    System.out.println(l); // 输出清空后的元素
  }

  public static void test2() {
    Student student = new Student("张三", 16);
    Student student1 = new Student("李四", 17);
    Student student2 = new Student("王五", 19);
    List<Student> stu = new ArrayList<>();
    stu.add(student);
    stu.add(student1);
    stu.add(student2);

    Iterator<Student> iterator = stu.iterator();
    while (iterator.hasNext()) {
      Student s = iterator.next();
      System.out.println(s.getName());
    }
  }

  // 只有list集合才有的方法
  public static void test3() {
    List<String> l = new ArrayList<>();
    l.add("1");
    l.add("2");
    // list种独有的，通过索引添加元素  前提是：必须要先有该长度在里面
    l.add(1, "李四");
    l.add(0, "王五");
    l.add(4, "刘六");

    // 可以通过索引删除
    String removeIndex = l.remove(1);
    boolean a = l.remove("刘六");

    // 返回指定索引的元素
    String getIndex = l.get(1);
    System.out.println(getIndex);

    System.out.println(l);
    // set方法返回的是修改前的元素
    String setIndex = l.set(0, "张三");
    System.out.println(setIndex);
  }

  public static String test4() {
    /*
     * 1、声明一个String类型的变量
     * 2、返回该变量
     * 3、调用该变量的方法
     * 4、调用该方法的返回值
     * 5、调用该方法的返回值的方法
     *
     */
    String s = "hello";
    return s;
  }
  /*
  1、定义一个方法，接收两个int类型的参数
  2、判断这两个值的大小，如果第一个值大于第二个值，返回第一个值，如果第一个值小于第二个值，返回第二个值
  3、调用该方法
   */

  /*
   * 1、定义一个方法，接收三个int类型的参数
   * 2、用三元运算符判断这三个值的大小，返回最大值
   *
   */

}
/*

*/
