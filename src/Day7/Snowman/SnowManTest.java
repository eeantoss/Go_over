package Day7.Snowman; /*
                      @ClassName:     SnowManTest
                      @Author:        YangXu
                      @Need:            雪人的测试类
                      @Date:          2022/3/28
                      @Time:          11:45
                      */

//

public class SnowManTest {
  public static void main(String[] args) {
    //
    SnowMan snowMan = new SnowMan();
    snowMan.setColour('白'); // 颜色
    snowMan.setSize(20); // 大小
    snowMan.setAppearance("漂亮"); // 外貌

    String appearance = snowMan.getAppearance(); // 得到雪人的外貌
    char colour = snowMan.getColour(); // 得到雪人的颜色
    double size = snowMan.getSize(); // 得到雪人的大小

    System.out.println("雪人的颜色是:" + colour + "\n雪人是" + appearance + "\n雪人有" + size + "米");
  }
}
/*

*/
