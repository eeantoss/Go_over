package Day16;
/*
@ClassName:     ThreadDemo01
@Author:        YangXu
@Need:          多线程的另一种实现方式
@Date:          2022/4/15
@Time:          2022-04-15 8:50
*/

//

public class ThreadDemo01 extends Thread {
  public static void main(String[] args) throws InterruptedException {
    // 抛出异常
    ThreadImp threadDemo01 = new ThreadImp();

    Thread thread = new Thread(threadDemo01, "线程1");
    Thread thread1 = new Thread(threadDemo01, "线程2");
    Thread thread2 = new Thread(threadDemo01, "线程3");

    // 设置线程优先级
    thread.setPriority(10);
    thread1.setPriority(9);
    thread2.setPriority(8);

    // 等待线程忙死再运行其他 .join

    // 启动线程
    thread.start();
    thread.join(); // 让线程1先忙完再让其他线程忙

    //

    thread1.start();
    thread1.join(); // 让线程2忙完再忙其他

    thread2.start();
  }
}
/*
多线程的步骤
1、继承 extends Thread类
2、重写run方法
3、new 对象
4、new出来的对象.start
*/
