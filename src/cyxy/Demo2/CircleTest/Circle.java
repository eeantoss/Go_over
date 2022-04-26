package cyxy.Demo2.CircleTest;
/*
@ClassName:     Circle
@Author:        YangXu
@Need:
@Date:          2022/4/4
@Time:          11:54
*/

//

public class Circle {
  private double radius; // 圆的半径

  public double findArea() {
    return Math.PI * radius * radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }
}

/*
9、(1) 定义一个Circle类，包含一个double型的radius属性代表圆的半径，findArea()方法返回圆的面积。
     (2) 定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义如下：
     public void printAreas(Circle c, int times) //声明
    (3) 在printAreas方法中打印输出1到times之间的每个整数半径值，以及对应的面积。例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。
    (4) 在main方法中调用printAreas()方法，调用完毕后输出当前半径值。

*/
