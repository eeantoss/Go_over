package Day12;
/*
@ClassName:     CollectionDemo2
@Author:        YangXu
@Need:
@Date:          2022/4/5
@Time:          11:10
*/

//

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo2 {
  public static void main(String[] args) {
    //
    Collection<String> collection = new ArrayList<>();
    collection.add("王五");
    collection.add("刘六");
    collection.add("王八");
    collection.add("刘能");

    Iterator<String> i = collection.iterator();
    while (i.hasNext()) {
      String s = i.next();
      System.out.println(s);
    }
  }
}
/*

*/
