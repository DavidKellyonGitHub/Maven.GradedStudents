package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores = new ArrayList<Double>();
    private String finalGrade;

    public Student(String first, String last, Double[] scores) {
        this.firstName = first;
        this.lastName = last;
        for (int i = 0;i<scores.length;i++){
            this.examScores.add(scores[i]);
        }
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumberOfExamsTaken(){
        return this.examScores.size();
    }

    public String getExamScores(){
        String output = "";
        for (int i = 0;i<examScores.size();i++) {
            output += this.examScores.get(i) + ", ";
        }
        return output;
    }

    public void addExamScore(double examScore){
        this.examScores.add(examScore);

    }

    public void setExamScore(int examNumber,double newScore){
        this.examScores.set(examNumber-1,newScore);

    }

    public double getAverageStudentExamScore(){
        Double sum = 0.0;
        for (Double grade : examScores){
            sum += grade;
        }
        return sum/examScores.size();
    }



    public String getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(String finalGrade) {
        this.finalGrade = finalGrade;
    }

    @Override
    public String toString() {
        Formatter summary = new Formatter();
        String output = "";
        String examScoreString = "";
        for (int i = 0; i < this.examScores.size();i++) {
            examScoreString += "Exam " + (i + 1) + " -> " + this.examScores.get(i) + "\n";
        }
        output += summary.format("Student Name: %s %s %n > Average Score: %f %n > %s ", getFirstName(), getLastName(), getAverageStudentExamScore(), examScoreString);
        return output;

    }
}
