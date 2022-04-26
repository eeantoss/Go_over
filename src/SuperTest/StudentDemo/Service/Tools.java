package SuperTest.StudentDemo.Service;

import SuperTest.StudentDemo.Student.Student;

import java.util.ArrayList;

public interface Tools {
  public abstract void add(ArrayList<Student> arrayList);

  public abstract void update(ArrayList<Student> arrayList);

  public abstract void delete(ArrayList<Student> arrayList);

  public abstract void query(ArrayList<Student> arrayList);
}
