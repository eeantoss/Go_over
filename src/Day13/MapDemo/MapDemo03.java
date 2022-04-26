package Day13.MapDemo;
/*
@ClassName:     MapDemo03
@Author:        YangXu
@Need:
@Date:          2022/4/11
@Time:          2022-04-11 11:20
*/

//

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo03 {
  public static void main(String[] args) {
    //
    Map<Student, String> map = new HashMap<>();
    Student stu1 = new Student("张三", 19);
    Student sut2 = new Student("李四", 21);
    Student sut3 = new Student("李丽", 18);
    Student stu4 = new Student("刘六", 19);
    Student st5 = new Student("张三", 19 /**/);

    System.out.println(stu4);
    System.out.println(stu4.hashCode());
    System.out.println(stu1.hashCode());
    map.put(stu1, "广东");
    map.put(sut2, "山东");
    map.put(sut3, "山西");
    map.put(stu4, "g西");
    map.put(stu4, "gx");
    map.put(st5, "gx");
    System.out.println(stu4);
    System.out.println(stu4.hashCode());
    System.out.println(stu1.hashCode());

    Set<Student> students = map.keySet();
    for (Student s : students) {
      String s1 = map.get(s);
      System.out.println(s.getName() + " " + s.getAge() + " " + s1);
    }
  }
}
/*

*/
