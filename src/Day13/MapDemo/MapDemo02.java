package Day13.MapDemo;
/*
@ClassName:     MapDemo02
@Author:        YangXu
@Need:
@Date:          2022/4/11
@Time:          2022-04-11 11:08
*/

//

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo02 {
  public static void main(String[] args) {
    //
    Map<String, Student> map = new HashMap<>();
    Student stu1 = new Student("张三", 19);
    Student stu2 = new Student("李四", 18);
    Student stu3 = new Student("王五", 17);

    map.put("1", stu1);
    map.put("2", stu2);
    map.put("3", stu3);

    Set<String> strings = map.keySet();
    for (String s : strings) {
      Student student = map.get(s);
      System.out.println("学号:" + s + "==姓名:" + student.getName() + "年龄:" + student.getAge());
    }

    //
    System.out.println("--------");

    Set<Map.Entry<String, Student>> entries = map.entrySet();
    for (Map.Entry<String, Student> s : entries) {
      System.out.println(
          "学号" + s.getKey() + ":姓名:" + s.getValue().getName() + " " + s.getValue().getAge());
    }
  }
}
/*

*/
