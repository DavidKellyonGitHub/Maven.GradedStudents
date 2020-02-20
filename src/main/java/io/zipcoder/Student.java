package io.zipcoder;

import java.util.ArrayList;
import java.util.Formatter;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String first, String last, Double[] scores) {
        this.firstName = first;
        this.lastName = last;
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
        int i = 0;
        String output = "Exam Scores:%n       Exam)";
        Formatter outputFormat = new Formatter();
        while (this.examScores.get(i) !=null && this.examScores.get(i)!= -1){
            output += outputFormat.format(" %d ->%4d",i+1,this.examScores.get(i));

        }
        return output;

    }

    public void addExamScore(double examScore){
        this.examScores.add(examScore);
        Formatter outputFormat = new Formatter();
        System.out.println(outputFormat.format("Exam Scores:%n     Exam %d -> %4d",this.examScores.size()-1,this.examScores.get(this.examScores.size()-1)));
    }

    public void setExamScore(int examNumber,double newScore){
        this.examScores.set(examNumber-1,newScore);
        Formatter outputFormat = new Formatter();
        System.out.println(outputFormat.format("Exam Scores:%n     Exam %d -> %4d",this.examScores.size()-1,this.examScores.get(this.examScores.size()-1)));
    }

    public double getAverageExamScore(){
        Double sum = 0.0;
        for (Double grade : examScores){
            sum += grade;
        }
        return sum/examScores.size();
    }

    @Override
    public String toString(){
        Formatter summary = new Formatter();
        String output = "";
        output += summary.format("Student Name: %s %s %n > Average Score: %d %n > %s ",this.getFirstName(),getLastName(),getAverageExamScore(),getExamScores());
        return output;

    }

}
