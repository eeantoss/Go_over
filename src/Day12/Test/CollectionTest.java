package Day12.Test;
/*
@ClassName:     CollectionTest
@Author:        YangXu
@Need:
@Date:          2022/4/5
@Time:          11:33
*/

//

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
  public static void main(String[] args) {
    //
    Collection<Student> c = new ArrayList<>();
    Student student = new Student("张三", 18);
    Student student1 = new Student("李四", 17);
    Student student2 = new Student("王五", 19);
    c.add(student);
    c.add(student1);
    c.add(student2);

    Iterator<Student> i = c.iterator();
    /* while (i.hasNext()) {
      Student s = i.next();
      System.out.println("名字:" + s.getName() + "\t年龄:" + s.getAge());
    }*/

    while (i.hasNext()) {
      student = i.next();
      System.out.println("名字:" + student.getName() + "\t年龄:" + student.getAge());
    }

    // 增强for循环的遍历
    /*   for (Student s : c) {
      System.out.println(s.getName());
    }*/

    // 普通for的遍历
    for (int j = 0; j < c.size(); j++) {
      Student a = i.next();
      System.out.println("名字" + a.getName() + "年龄:" + a.getAge());
    }
  }
}
/*

*/
