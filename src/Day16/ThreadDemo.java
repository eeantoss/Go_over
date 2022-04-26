package Day16;
/*
@ClassName:     ThreadDemo
@Author:        YangXu
@Need:
@Date:          2022/4/14
@Time:          2022-04-14 8:59
*/

//

public class ThreadDemo extends Thread {
  private int a = 1;

  public static void main(String[] args) {
    //
    ThreadDemo t = new ThreadDemo();
    ThreadDemo t1 = new ThreadDemo();
    ThreadDemo t2 = new ThreadDemo();

    // 设置线程名称
    t.setName("线程1");
    t1.setName("线程2");
    t2.setName("线程3");

    // 设置优先级
    t1.setPriority(1);
    t2.setPriority(2);
    t.setPriority(3);

    // 让线程忙死再执行其他
    try {
      t.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    // 启动线程
    t1.start();
    t.start();
    t2.start();
    //    t1.run();
  }

  @Override
  public void run() {
    for (; a < 10000; a++) {
      //      beiginCount(a);
      try {
        sleep(a);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(getName() + " : " + a);
    }
  }
}

/*
多线程的步骤
1、继承 extends Thread类
2、重写run方法
3、new 对象
4、new出来的对象.start
*/
