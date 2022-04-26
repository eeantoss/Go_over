package Day13.HashCodeDemo;
/*
@ClassName:     HashCodeDemo1
@Author:        YangXu
@Need:          尝试将相同或不同的Hash值的添加到Set集合里面
@Date:          2022/4/8
@Time:          2022-04-08 10:16
*/

//

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashCodeDemo1 {
  public static void main(String[] args) {
    /*    // 新建两个Student对象
    Student s1 = new Student("张三", 19);
    Student s2 = new Student("张三", 19);
    Student s3 = new Student("张三", 19);

    // 新建一个set集合
    // set集合不可以添加重复的元素
    HashSet<Object> set = new HashSet<>();

    // 查看三个对象的哈希值
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    System.out.println(s3.hashCode());

    // 把三个相同内容的Student对象添加进set集合
    set.add(s1);
    set.add(s2);
    set.add(s3);
    // 用一个变量来接收set集合的长度
    int size = set.size();
    // 输出set集合的长度
    System.out.println(size);*/

    Set<Student> linkedList = new LinkedHashSet<>();

    Student s1 = new Student("张三", 19);
    Student s2 = new Student("李四", 20);
    Student s3 = new Student("张三", 19);
    Student s4 = new Student("王五", 19);
    Student s5 = new Student("刘六", 19);
    Student s6 = new Student("芜湖", 19);
    Student s7 = new Student("牛马", 19);
    Student s8 = new Student("马牛", 19);
    linkedList.add(s1);
    linkedList.add(s2);
    linkedList.add(s3);
    linkedList.add(s4);
    linkedList.add(s5);
    linkedList.add(s6);
    linkedList.add(s7);
    linkedList.add(s8);

    for (Student s : linkedList) {
      System.out.println(s.getName() + " " + s.getAge());
    }

    TreeSet<Student> treeSet = new TreeSet<>();
    treeSet.add(s1);
    treeSet.add(s2);
    treeSet.add(s3);
    treeSet.add(s4);
    treeSet.add(s5);

    System.out.println(treeSet.size());
  }
}
/*

*/
