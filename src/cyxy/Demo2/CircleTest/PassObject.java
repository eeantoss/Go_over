package cyxy.Demo2.CircleTest;
/*
@ClassName:     PassObject
@Author:        YangXu
@Need:
@Date:          2022/4/4
@Time:          11:56
*/

//

public class PassObject {
  public void printAreas(Circle c, int times) {
    for (int i = 0; i < times; times--) {
      //
      c.setRadius(times);
      double area = c.findArea();
      System.out.println("半径为" + times + "的面积" + area);
    }
  }

  public static void main(String[] args) {
    //
    PassObject passObject = new PassObject();
    Circle circle = new Circle();
    passObject.printAreas(circle, 5);
  }
}
/*
(2) 定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义如下：
     public void printAreas(Circle c, int times) //声明
    (3) 在printAreas方法中打印输出1到times之间的每个整数半径值，以及对应的面积。例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。
    (4) 在main方法中调用printAreas()方法，调用完毕后输出当前半径值。

 */
