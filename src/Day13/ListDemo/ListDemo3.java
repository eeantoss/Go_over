package Day13.ListDemo;
/*
@ClassName:     ListDemo3
@Author:        YangXu
@Need:
@Date:          2022/4/7
@Time:          2022-04-07 9:13
*/

//

import java.util.ArrayList;
import java.util.List;

public class ListDemo3 {
  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<>();
    // 添加一个元素
    arrayList.add("张三");
    arrayList.add("李四");
    arrayList.add("王五");
    arrayList.add("刘能");
    // 调用方法，用一个变量接收返回值
    int test = test(arrayList);
    // 输出返回值
    System.out.println(test);

    List<String> strings = test2(test);
    System.out.println(strings);
  }
  // 定义一个方法，返回集合的大小，集合通过形参传入
  public static int test(ArrayList<String> list) {
    return list.size();
  }

  // 定义一个方法，返回字符串对象集合，集合大小通过参数传入
  public static List<String> test2(int size) {
    List<String> list = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      // 根据长度添加多少个元素
      list.add("" + i);
    }
    //
    return list;
  }
}
/*

*/
