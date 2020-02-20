package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

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
    }

    @Test
    public void setFirstName() {
    }

    @Test
    public void setLastName() {
    }

    @Test
    public void getNumberOfExamsTaken() {
    }

    @Test
    public void getExamScores() {
    }

    @Test
    public void addExamScore() {
    }

    @Test
    public void setExamScore() {
    }

    @Test
    public void getAverageExamScore() {
    }

    @Test
    public void testToString() {
    }
}