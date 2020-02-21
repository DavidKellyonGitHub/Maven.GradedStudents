package io.zipcoder;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;

public class Classroom {
    private Student[] students;

    public Classroom(int maxNumberOfStudents){
        this.students = new Student[maxNumberOfStudents];

    }

    public Classroom(Student[] enrolled){
        for (int i = 0;i < enrolled.length;i++){
            this.students[i] = enrolled[i];
        }
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

    public void addStudent(Student student){
        for (int i = 0;i<this.students.length;i++){
            if (this.students[i]==null){
                this.students[i] = student;
                break;
            }
        }
    }

    public void removeStudent(String firstName, String lastName){
        for (int i = 0;i<this.students.length;i++){
            if ((this.students[i].getFirstName() == firstName) && this.students[i].getLastName()== lastName){
                this.students[i] = null;
            }
        }
    }

}
