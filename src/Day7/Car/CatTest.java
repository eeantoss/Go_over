package Day7.Car; /*
                  @ClassName:     CatTest
                  @Author:        YangXu
                  @Need:          车的测试类
                  @Date:          2022/3/28
                  @Time:          11:39
                  */

//

public class CatTest {
  public static void main(String[] args) {
    //

    Car car = new Car();
    car.setColor('红'); // 设置车的颜色
    car.setBrand("兰博基尼"); // 设置车的厂家
    car.setType("两门四座"); // 设置车的户型

    String brand = car.getBrand(); // 得到车的厂家
    char color = car.getColor(); // 得到车的颜色
    String type = car.getType(); // 得到车的户型
    System.out.println("车的品牌是:" + brand + "\n车的颜色是：" + color + "\n车的户型是:" + type);
  }
}
/*

*/
