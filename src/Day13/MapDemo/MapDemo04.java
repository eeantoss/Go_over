package Day13.MapDemo;
/*
@ClassName:     MapDemo04
@Author:        YangXu
@Need:
@Date:          2022/4/11
@Time:          2022-04-11 11:56
*/

//

import java.util.*;

public class MapDemo04 {
  public static void main(String[] args) {
    //
    ArrayList<HashMap<String, String>> s = new ArrayList<>();

    HashMap<String, String> m1 = new HashMap<>();
    m1.put("张三", "广东");
    m1.put("李四", "广东");
    m1.put("王五", "广东");
    HashMap<String, String> m2 = new HashMap<>();
    m2.put("张三", "广东");
    m2.put("李四", "广东");
    m2.put("王五", "广东");

    HashMap<String, String> m3 = new HashMap<>();
    m3.put("张三", "广东");
    m3.put("李四", "广东");
    m3.put("王五", "广东");

    s.add(m1);
    s.add(m2);
    s.add(m3);

    Iterator<HashMap<String, String>> iterator = s.iterator();
    while (iterator.hasNext()) {
      HashMap<String, String> next = iterator.next();
      Set<Map.Entry<String, String>> entries = next.entrySet();
      for (Map.Entry<String, String> s1 : entries) {
        /*        String key = s1.getKey();
        String value = s1.getValue();
        System.out.println(key + " " + value);*/
        String s2 = next.get(s1);
        System.out.println(s1 + " " + s2);
      }
    }
  }
}
/*

*/
