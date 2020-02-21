package io.zipcoder;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

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
        int studentCounter = 0;
        for(int i = 0;i<this.students.length;i++) {
            if (this.students[i] != null) {
                sum += this.students[i].getAverageStudentExamScore();
                studentCounter++;
            }
        }
        return sum/studentCounter;
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
            if (((this.students[i] != null) && this.students[i].getFirstName() == firstName) && this.students[i].getLastName()== lastName){
                this.students[i] = null;
            }
        }
    }

    public Student[] getStudentsByScore(){
        Stack sortedStack = new Stack();
        Student[] sortedArray = new Student[sortedStack.size()];
        double highScore = -1;
        for (int i = 0;i<this.students.length;i++) {
            if (this.students[i] != null) {
                if (this.students[i].getAverageStudentExamScore() > highScore) {
                    sortedStack.push(this.students[i]);
                }
            }
        }
        for (int i = 0;i<sortedStack.size();i++){
            sortedArray[i] = (Student) sortedStack.elementAt(i);
        }
        return sortedArray;
    }

    public HashMap getGradeBook() {
        double sum = 0.0;
        for (int i = 0; i < this.students.length; i++) {
            sum += this.students[i].getAverageStudentExamScore();
        }
        HashMap<String, Student> gradeBook = new HashMap();
        for (int i = 0; i < this.getStudentsByScore().length; i++) {
            if (this.getStudentsByScore()[i] != null) {
                if (this.getStudentsByScore()[i].getAverageStudentExamScore() / sum >= .9) {
                    gradeBook.put("A", this.getStudentsByScore()[i]);
                } else if (this.getStudentsByScore()[i].getAverageStudentExamScore() / sum >= .71 && this.getStudentsByScore()[i].getAverageStudentExamScore() / sum < .9) {
                    gradeBook.put("B", this.getStudentsByScore()[i]);
                } else if (this.getStudentsByScore()[i].getAverageStudentExamScore() / sum >= .5 && this.getStudentsByScore()[i].getAverageStudentExamScore() / sum < .71) {
                    gradeBook.put("C", this.getStudentsByScore()[i]);
                } else if (this.getStudentsByScore()[i].getAverageStudentExamScore() / sum >= .11 && this.getStudentsByScore()[i].getAverageStudentExamScore() / sum < .5) {
                    gradeBook.put("D", this.getStudentsByScore()[i]);
                } else if (this.getStudentsByScore()[i].getAverageStudentExamScore() / sum <= .11) {
                    gradeBook.put("F", this.getStudentsByScore()[i]);
                }
            }
        }
        return gradeBook;
    }

}
