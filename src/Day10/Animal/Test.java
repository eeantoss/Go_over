package Day10.Animal;
/*
@ClassName:     Test
@Author:        YangXu
@Need:
@Date:          2022/4/1
@Time:          10:25
*/

//

public class Test {
  public static void main(String[] args) {
    // 向上转型
    Animal animal = new Cat("汤姆", 10);
    Animal animal1 = new Mouse("杰瑞", 9);
    //    animal.getName();
    //    animal.getAge();
    animal.eat();

    //    animal1.getName();
    //    animal1.getAge();
    animal1.eat();

    // 向下转型
    Cat cat = (Cat) animal;
    Mouse mouse = (Mouse) animal1;
    cat.eat();
    mouse.eat();
  }
}
/*

*/
