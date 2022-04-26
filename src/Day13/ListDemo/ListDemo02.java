package Day13.ListDemo;
/*
@ClassName:     ListDemo02
@Author:        YangXu
@Need:
@Date:          2022/4/6
@Time:          2022-04-06 11:59
*/

//

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo02 {
  public static void main(String[] args) {
    //
    ArrayList<Student> list = new ArrayList<>();
    list.add(new Student("张三", 20));
    list.add(new Student("李四", 21));
    list.add(new Student("王五", 22));
    list.add(new Student("赵六", 23));
    list.add(new Student("钱七", 24));
    list.add(new Student("孙八", 25));
    list.add(new Student("周九", 26));
    list.add(new Student("吴十", 27));

    // 增强for遍历集合
    for (Student student : list) {
      System.out.println(student.getName() + ":" + student.getAge());
    }

    // 普通for遍历集合

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i).getName() + ":" + list.get(i).getAge());
    }

    // 迭代器it遍历集合
    Iterator<Student> iterator = list.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next().getName() + ":" + iterator.next().getAge());
    }
  }
}
/*

*/
