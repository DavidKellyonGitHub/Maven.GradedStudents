package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Formatter;

public class StudentTest {


    @Test
    public void getFirstNameTest(){
        Student testStudent = new Student("Bilbo","Baggins", new Double[]{100.0, 90.0, 30.0, 50.0, 100.0});
        String actual = testStudent.getFirstName();
        String expected = "Bilbo";
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getLastName() {
        Student testStudent = new Student("Gandalf", "Gray", new Double[]{100.0});
        String actual = testStudent.getLastName();
        String expected = "Gray";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setFirstNameTest() {
        Student testStudent = new Student("Bilbo", "Baggins", new Double[] {100.0});
        testStudent.setFirstName("Bulbous");
        String actual = testStudent.getFirstName();
        String expected = "Bulbous";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setLastNameTest() {
        Student testStudent = new Student("Bilbo", "Baggins", new Double[] {100.0});
        testStudent.setLastName("Boggingsly");
        String actual = testStudent.getLastName();
        String expected = "Boggingsly";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getNumberOfExamsTakenTest() {
        Student testStudent = new Student("Smeagol","O'Gollum",new Double[]{100.0,90.0});
        int expected = 2;
        int actual = testStudent.getNumberOfExamsTaken();
        Assert.assertEquals(expected,actual);
    }

//    @Test
//    public void getExamScores() {
//        Student testStudent = new Student("EyeOf","Sarumon", new Double[]{100.0,90.0});
//        Formatter expectedFormat = new Formatter();
//        String expected1 = expectedFormat.format(" %d ->%4f %n",1,100.0).toString();
//        String expected2 = expectedFormat.format(" %d ->%4f %n",2,90.0).toString();
//        Assert.assertEquals((expected1 + expected2),testStudent.getExamScores());


    @Test
    public void addExamScore() {
        Student testStudent = new Student("Smeagol","O'Gollum",new Double[]{100.0,90.0});
        testStudent.addExamScore(80.0);
        String actual = testStudent.getExamScores();
        String expected = "100.0, 90.0, 80.0, ";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setExamScore() {
    }

    @Test
    public void getAverageStudentExamScore() {
        Student bilbo = new Student("Bilbo","Baggins",new Double[] {100.0,90.0});
        double expected = 95.0;
        double actual = bilbo.getAverageStudentExamScore();
        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void testToString() {
    }
}