package Day7.Fire; /*
                   @ClassName:     FireHydrantTest
                   @Author:        YangXu
                   @Need:           消防栓的测试类
                   @Date:          2022/3/28
                   @Time:          11:36
                   */

//

public class FireHydrantTest {
  public static void main(String[] args) {
    //
    FireHydrant fire = new FireHydrant();

    fire.setColor('黄'); // 设置消防栓的颜色
    fire.setWork("高压"); // 设置消防栓的工作原理
    fire.setMaterial("钛合金"); // 设置消防栓的材料

    char color = fire.getColor(); // 得到消防栓的颜色
    String material = fire.getMaterial(); // 得到消防栓的材料
    String work = fire.getWork(); // 得到消防栓的工作原理
    System.out.println("消防栓的颜色是:" + color + "\n材料是:" + material + "\n工作原理是:" + work);
  }
}
/*

*/
