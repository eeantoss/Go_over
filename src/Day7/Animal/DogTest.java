package Day7.Animal;
/*
@ClassName:     DogTest
@Author:        YangXu
@Need:           狗的测试类
@Date:          2022/3/28
@Time:          11:16
*/

//

public class DogTest {
  public static void main(String[] args) {
    //
    Dog d = new Dog(); //

    d.setBody_type("小型"); // 设置狗的体型
    d.setVariety("柯基"); // 设置狗的品种
    d.setLineage("纯种"); // 设置狗的血统

    // 获取狗的血统，体型，品种
    String type = d.getBody_type();
    String lineage = d.getLineage();
    String variety = d.getVariety();
    System.out.println("狗品种是:" + variety + "\n血统是：" + lineage + "\n体型是:" + type);
  }
}
/*

*/
