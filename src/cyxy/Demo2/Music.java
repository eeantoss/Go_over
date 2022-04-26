package cyxy.Demo2;
/*
@ClassName:     Music
@Author:        YangXu
@Need:
@Date:          2022/4/4
@Time:          11:45
*/

// 7、定义Music类，里面有音乐名name、音乐时长times属性，并有播放play功能和返回本身属性信息的功能方法getInfo

public class Music {
  private String name;
  private double times;

  public void play() {
    System.out.println("当前播放的是《" + getName() + "》");
  }

  public void getInfo() {
    System.out.println("当前的歌曲是:《" + getName() + "》 \t歌曲总时长为：" + getTimes());
  }

  public Music(String name, double times) {
    this.name = name;
    this.times = times;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getTimes() {
    return times;
  }

  public void setTimes(double times) {
    this.times = times;
  }
}

/*

*/
