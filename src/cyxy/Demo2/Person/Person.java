package cyxy.Demo2.Person;
/*
@ClassName:     Person
@Author:        YangXu
@Need:
@Date:          2022/4/4
@Time:          12:05
*/

/*
10、定义一个Person类 {name, age, job}, 初始化Person 对象数组，有3个person对象，
    并按照 age 从 大到 小进行排序, 提示，使用冒泡排序
 */

public class Person {
  private String name;
  private int age;
  private String job;

  // 有参构造
  public Person(String name, int age, String job) {
    this.name = name;
    this.age = age;
    this.job = job;
  }

  // 提供get and set方法
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }
}

/*

*/
