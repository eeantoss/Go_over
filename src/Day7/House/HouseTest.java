package Day7.House; /*
                    @ClassName:     HouseTest
                    @Author:        YangXu
                    @Need:          房子的测试类
                    @Date:          2022/3/28
                    @Time:          11:42
                    */

//

public class HouseTest {
  public static void main(String[] args) {
    //
    House house = new House();

    house.setHouse_Type("五房三厅"); // 设置房子的户型
    house.setColor('金'); // 设置房子的颜色
    house.setValue(2000); // 设置房子的价值

    String house_type = house.getHouse_Type(); // 得到房子的户型
    double value = house.getValue(); // 得到房子的价值
    char color = house.getColor(); // 得到房子的颜色
    System.out.println("房子的户型是：" + house_type + "\n颜色是：" + color + "\n价值：" + value + "W");
  }
}
/*

*/
