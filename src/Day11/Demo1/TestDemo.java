package Day11.Demo1;
/*
@ClassName:     TestDemo
@Author:        YangXu
@Need:
@Date:          2022/4/4
@Time:          10:09
*/

//

public class TestDemo {
  public static void main(String[] args) {
    //
    Animal cat = new Cat();

    cat.setName("汤姆");
    cat.setAge(6);
    cat.eat();
    cat.jump();
    System.out.println("-------------");

    Jump cat1 = new Cat("张三", 6);
    //    cat1.eat();
    cat1.jump();
    System.out.println("-------------");

    Animal mouse = new Mouse();
    mouse.setAge(6);
    mouse.setName("杰瑞");
    mouse.eat();
    mouse.jump();
    System.out.println("-------------");

    Jump mouse1 = new Mouse("李四", 6);

    mouse1.jump();
  }
}
/*

*/
