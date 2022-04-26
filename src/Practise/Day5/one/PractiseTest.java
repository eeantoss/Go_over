package Practise.Day5.one; /*
                           @ClassName:     Practise
                           @Author:        YangXu
                           @Need:
                           @Date:          2022/3/29
                           @Time:          20:07
                           */

//

public class PractiseTest {

  public static void main(String[] args) {
    //
    //    System.out.println("1、类中编写一个方法 test01，可以接收一个数组类型的参数，在方法中修改该数组，看看原来的数组是否变化。");
    int[] arr = {50}; // 静态初始化数组
    System.out.println("输出未调用方法修改之前的");
    System.out.println(arr[0]); // 输出arr这个数组的第1个元素

    System.out.println("输出调用方法修改后的");
    test01(arr); // 调用test01这个方法修改数组的第1个值
    System.out.println(arr[0]); // 输出修改后的元素的值

    System.out.println("------------------");
    //    System.out.println("2、类中编写一个方法 test02，可以接收一个
    // Person(age,name)对象，在方法中修改该对象属性，看看原来的对象是否变化。");
    Person person = new Person(); // 定义person这个对象
    person.age = 29; // 设置年龄
    person.name = "李四"; // 设置姓名
    System.out.println("输出未调用方法修改之前的");
    System.out.println(person.age);
    System.out.println(person.name);

    System.out.println("输出调用方法修改后的");
    test02(person); // 调用test02方法传入ps这个对象
    System.out.println(person.age); // 输出person这个对象的年龄
    System.out.println(person.name); // 输出person这个对象的姓名
  }

  // 1、类中编写一个方法 test01，可以接收一个数组类型的参数，在方法中修改该数组，看看原来的数组是否变化。
  public static void test01(int[] arr) {
    arr[0] = 100; // 修改传入数组的第1个值
  }

  // 2、类中编写一个方法 test02，可以接收一个 Person(age,name)对象，在方法中修改该对象属性，看看原来的对象是否变化。
  public static void test02(Person person) {
    person.age = 19; // 设置传入参数的age=19
    person.name = "张三"; // 设置传入参数的name为张三
  }

  public static class Person { // 定义一个类
    // 给两个成员变量 name age
    String name;
    int age;
  }
}
/*

*/
