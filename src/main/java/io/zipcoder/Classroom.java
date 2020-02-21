package io.zipcoder;

import java.util.Arrays;

public class Classroom {
    private Student[] students;

    public Classroom(int maxNumberOfStudents){

    }

    public Classroom(Student[] enrolled){

    }

    public Classroom(){
        this.students = new Student[30];
    }

    public Student[] getStudents(){
        return this.students;
    }

    public double getAverageExamScore(){
        double sum = 0.0;
        for(int i = 0;i<this.students.length;i++){
            sum += this.students[i].getAverageStudentExamScore();
        }
        return sum/this.students.length;
    }
}
