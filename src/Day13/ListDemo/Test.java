package Day13.ListDemo;
/*
@ClassName:     Test
@Author:        YangXu
@Need:
@Date:          2022/4/6
@Time:          2022-04-06 10:24
*/

//

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test {

  public static void main(String[] args) {
    /*
     * 1、创建一个List集合，泛型使用的是Student类
     * 2、定义3个stu对象，对象的参数是name，age并完成初始化
     * 3、把学生添加到集合中
     * 4、使用Listiterator方法遍历集合，输出学生的信息
     */
    List<Student> list = new ArrayList<>();
    Student stu1 = new Student("张三", 20);
    Student stu2 = new Student("李四", 21);
    Student stu3 = new Student("王五", 22);
    list.add(stu1);
    list.add(stu2);
    list.add(stu3);
    ListIterator<Student> iterator = list.listIterator();
    while (iterator.hasNext()) {
      Student stu = iterator.next();
      System.out.println(stu.getName() + ":" + stu.getAge());
    }
    // 输出一个分隔符
    System.out.println("-----------------");
    while (iterator.hasPrevious()) {
      Student stu = iterator.previous();
      System.out.println(stu.getName() + ":" + stu.getAge());
    }
    // 编写一个方法，把集合中的所有学生的年龄加10
    addAge(list);
    // 遍历集合，输出学生的信息
    iterator = list.listIterator();
    while (iterator.hasNext()) {
      Student stu = iterator.next();
      System.out.println(stu.getName() + ":" + stu.getAge());
    }
    // 遍历集合，输出学生的信息
    iterator = list.listIterator();
    while (iterator.hasPrevious()) {
      Student stu = iterator.previous();
      System.out.println(stu.getName() + ":" + stu.getAge());
    }
  }

  private static void addAge(List<Student> list) {
    for (Student stu : list) {
      stu.setAge(stu.getAge() + 10);
    }
  }

  public static void forTest(List<Student> list) {
    for (Student stu : list) {
      System.out.println(stu.getName() + ":" + stu.getAge());
    }
    // 普通for遍历list集合
    for (int i = 0; i < list.size(); i++) {
      Student stu = list.get(i);
      System.out.println(stu.getName() + ":" + stu.getAge());
    }
    // 迭代器遍历list集合
    ListIterator<Student> iterator = list.listIterator();
    while (iterator.hasNext()) {
      Student stu = iterator.next();
      System.out.println(stu.getName() + ":" + stu.getAge());
    }
  }
  // 定义一个方法，求出最大值
  public static int max(int a, int b) {
    return a > b ? a : b;
  }
  // 定义一个数组，求出最大值
  public static int max(int[] arr) {
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }
  // 定义一个方法，求出最小值
  public static int min(int a, int b) {
    return a < b ? a : b;
  }
  // 定义一个数组，求出最小值
  public static int min(int[] arr) {
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return min;
  }
  // 定义一个方法，求出数组的平均值
  public static double avg(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum * 1.0 / arr.length;
  }
}
/*

*/
