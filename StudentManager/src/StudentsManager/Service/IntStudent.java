package StudentsManager.Service;

import StudentsManager.Student.Student;

import java.sql.SQLException;

public interface IntStudent {

  public void addStudent() throws SQLException;

  public void delStudent(Student student) throws SQLException;

  public void findAllStu(Student student) throws SQLException;

  public void findByStu(Student student);

  public void update(Student student);
}
