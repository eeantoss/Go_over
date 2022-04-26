package Practise.Day6;
/*
@ClassName:     CarDemo
@Author:        YangXu
@Need:
@Date:          2022/4/6
@Time:          2022-04-06 22:09
*/

//

import java.util.ArrayList;

public class CarDemo {
  public static void main(String[] args) {
    // newX个Car对象
    Car car = new Car("奔驰", 90000);
    Car car1 = new Car("五菱宏光", 20000);
    Car car2 = new Car("宝马", 876540);
    Car car3 = new Car("奥迪", 80000);

    ArrayList<Car> arrayList = new ArrayList<>();
    arrayList.add(car);
    arrayList.add(car1);
    arrayList.add(car2);
    arrayList.add(car3);
    System.out.println("添加完成后的集合：" + arrayList);

    arrayList.remove("宝马");
    System.out.println("删除宝马后的集合");

    // 查询集合中是否存在奔驰这个元素  并给了返回值
    boolean contains = arrayList.contains("奔驰");
    System.out.println("是否存在奔驰：" + contains);

    // 获取arrayList元素的个数
    System.out.println("集合的元素个数：" + arrayList.size());

    // 判断集合是否为空
    boolean isEmpty = arrayList.isEmpty();
    System.out.println("集合是否为空：" + isEmpty);

    // 清空arrayList集合
    arrayList.clear();
    System.out.println("清空后的集合：" + arrayList);

    // 集合中使用addAll添加多个元素
    ArrayList<Car> arrayList1 = new ArrayList<>();

    arrayList1.addAll(arrayList);
    System.out.println("使用addAll添加多个元素后的集合：" + arrayList1);

    // 查找多个元素是否都存在
    boolean b = arrayList1.containsAll(arrayList);
    System.out.println("查找多个元素是否都存在：" + b);

    // 删除多个元素
    arrayList1.removeAll(arrayList);
    System.out.println("删除元素后的集合" + arrayList1);
  }
}
/*

*/
