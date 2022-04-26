package Day5; /*
              @ClassName:     ArrayTest2
              @Author:        YangXu
              @Need:
              @Date:          2022/3/25
              @Time:          9:54
              */

//

public class ArrayTest2 {
  public static void main(String[] agrs) {

    /*  double sum = test1(1, 4);
    System.out.println(sum);*/

    //    test2();
    //    test3();
    test4();
  }

  // 公开的  静态的  浮点型  方法名 (两个int参数)
  public static double test1(int num, int num1) {
    // 方法体
    double sum = num + num1;
    return sum;
  }

  // 二维数组
  public static void test2() {
    int[] arr = new int[] {1, 2, 3}; // 一维数组
    // 静态初始化二维数组
    int[][] arr1 = new int[][] {{1, 2, 3}, {5, 6}, {7, 8, 9}};
    // 动态初始化二维数组
    String[][] arr2 = new String[3][2];
    System.out.println(arr1[1][1]);
  }

  // 遍历二维数组
  public static void test3() {
    int[] arr4[] = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    /*// 第一种遍历方式
    for (int i = 0; i < arr4.length; i++) {
      int[] itens = arr4[i];
      for (int j = 0; j < itens.length; j++) {
        System.out.println(itens[j]);
        //
      }
      System.out.println();
      //
    }
    System.out.println("----------");
    // 第二种遍历方法

    for (int i = 0; i < arr4.length; i++){
      //
      for (int j = 0; j < arr4.length; j++) {
        //
      }
    }*/
  }

  public static void test4() {
    // 扩容旧的数组长度+1
    int[] arr2 = {1, 3, 5, 7, 9}; // 旧数组
    int[] arr3 = new int[arr2.length + 1]; // 扩容arr2数组的长度+1
    // 遍历旧的数组并赋值给新的数组
    for (int i = 0; i < arr2.length; i++) {
      arr3[i] = arr2[i];
    }

    arr3[arr3.length - 1] = 100; //  扩容并赋值
    arr2 = arr3; // 旧的数组赋值给新的数组长度+1
    for (int i = 0; i < arr2.length; i++) { // 遍历扩容后的的数组
      //
      System.out.println(arr2[i]);
    }
  }
}
/*

*/
