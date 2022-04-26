package Day13.MapDemo;
/*
@ClassName:     MapDemo01
@Author:        YangXu
@Need:
@Date:          2022/4/11
@Time:          2022-04-11 9:14
*/

//

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo01 {
  public static void main(String[] args) {
    //
    Map<Integer, Integer> map = new HashMap<>();

    Integer i = map.put(1234, 124);
    //    System.out.println(i);
    Integer j = map.put(123, 1243);
    //    System.out.println(j);
    Integer k = map.put(666, 666);
    //    System.out.println(k);

    /*
        System.out.println(map);

        // 判断集合是否包含指定的键
        boolean b = map.containsKey(123);
        if (b) {
          System.out.println("包含123键");
        } else {
          System.out.println("不包含123的键");
        }

        // 判断集合是否包含指定的值
        boolean b1 = map.containsValue(666);
        if (b1) {
          System.out.println("值中包含666");
        } else {
          System.out.println("值中不包含666");
        }

        Integer remove = map.remove(123);
        System.out.println(remove);

        System.out.println("删除123后的集合是：" + map);

        //
        //    String put = map.put("name", "admin");
        //    System.out.println(put);
        //    map.put("password", "123456");
        int size = map.size();
        System.out.println("集合的大小为" + size);

        // 获取key为name的值
        //    String name = map.get("name");
        //    System.out.println(name);

        // 判断集合是否为空
        boolean empty = map.isEmpty();
        if (empty) {
          System.out.println("集合是空的");
        } else {
          System.out.println("集合不是空的");
        }
    */

    // 清空集合
    //    map.clear();
    //    map.isEmpty();
    //    System.out.println(map);

    /*
        // map集合的第一种遍历方式
        Set<Integer> integers = map.keySet();
        for (Integer a : integers) {
          System.out.println(a);
          System.out.println(map.get(a));
        }

        // 把值用集合接收
        Collection<Integer> values = map.values();
        // 输出值
        System.out.println(values);
        System.out.println("-----------");
    */

    Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
    System.out.println(entries);
    System.out.println("-----------");
    System.out.println(map);

    //    map集合的第二种遍历方式
    /*
    for (Map.Entry<Integer, Integer> s : entries) {
      Integer key = s.getKey();
      Integer val = s.getValue();
    }*/

    Iterator<Map.Entry<Integer, Integer>> iterator = entries.iterator();
    while (iterator.hasNext()) {
      Map.Entry<Integer, Integer> entry = iterator.next();
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
  }
}
/*

*/
