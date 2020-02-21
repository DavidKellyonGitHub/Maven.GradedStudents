package io.zipcoder;
import org.junit.Assert;
import org.junit.Test;
import io.zipcoder.Student;
import io.zipcoder.Classroom;

public class ClassroomTest {

   @Test
   public void getStudentsTest(){
       Student bilbo = new Student("Bilbo","Baggins",new Double[] {100.0});
       Classroom mordor = new Classroom();
       mordor.addStudent(bilbo);
       Student[] definite = new Student[]{bilbo};
       Student[] maybe = mordor.getStudents();
       Boolean actual = definite[0] == maybe[0];
       boolean expected = true;
       Assert.assertEquals(expected,actual);
   }

    @Test
    public void getAverageExamScoreTest() {
        Student bilbo = new Student("Bilbo","Baggins",new Double[] {100.0,100.0});
        Student gandalf = new Student("Gandalf","Gray",new Double[]{90.0,90.0});
        Classroom mordor = new Classroom();
        mordor.addStudent(bilbo);
        mordor.addStudent(gandalf);
        double expected = 95;
        double actual = mordor.getAverageExamScore();
        Assert.assertEquals(expected,actual, 0);
    }

    @Test
    public void addStudent() {
        Student bilbo = new Student("Bilbo","Baggins",new Double[] {100.0});
        Classroom mordor = new Classroom();
        mordor.addStudent(bilbo);
        Student[] definite = new Student[]{bilbo};
        Student[] maybe = mordor.getStudents();
        Boolean actual = definite[0] == maybe[0];
        boolean expected = true;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeStudent() {
        Student bilbo = new Student("Bilbo","Baggins",new Double[] {100.0});
        Classroom mordor = new Classroom();
        mordor.addStudent(bilbo);
        Student gandalf = new Student("Gandalf","Gray",new Double[]{90.0,90.0});
        mordor.addStudent(gandalf);
        mordor.removeStudent("Bilbo", "Baggins");
        Student[] definite = new Student[]{gandalf};
        Student[] maybe = mordor.getStudents();
        Boolean actual = definite[0] == maybe[1];
        boolean expected = true;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getStudentsByScore() {
        Student bilbo = new Student("Bilbo","Baggins",new Double[] {100.0});
        Classroom mordor = new Classroom();
        mordor.addStudent(bilbo);
        Student gandalf = new Student("Gandalf","Gray",new Double[]{90.0,90.0});
        mordor.addStudent(gandalf);
        mordor.removeStudent("Bilbo", "Baggins");
        mordor.getStudentsByScore();
    }

    @Test
    public void getGradeBook() {
    }
}
