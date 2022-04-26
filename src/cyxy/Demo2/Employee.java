package cyxy.Demo2;
/*
@ClassName:     Employee
@Author:        YangXu
@Need:
@Date:          2022/4/4
@Time:          11:50
*/

/*
8、创建一个Employee类， 属性有(名字，性别，年龄，职位，薪水)， 提供3个构造方法，可以初始化
(1) (名字，性别，年龄，职位，薪水),
(2) (名字，性别，年龄) (3) (职位，薪水), 要求充分复用构造器
 */

public class Employee {
  private String name;
  private char sex;
  private int age;
  private String Position;
  private double salary;

  public Employee(String name, char sex, int age, String position, double salary) {
    this.name = name;
    this.sex = sex;
    this.age = age;
    Position = position;
    this.salary = salary;
  }

  public Employee(String position, double salary) {
    Position = position;
    this.salary = salary;
  }

  public Employee(String name, char sex, int age) {
    this.name = name;
    this.sex = sex;
    this.age = age;
  }
}

/*

*/
