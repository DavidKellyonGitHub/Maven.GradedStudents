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

}
