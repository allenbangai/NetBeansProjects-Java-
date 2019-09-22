/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7exercises;

/**
 *
 * @author DELL
 */
public class GradeBook2Implementation {
    public static void main(String[] args){
        //teo dimenstional array of student grades
        int[][] gradesArray = {{87, 96, 70},
                                {68, 87, 90},
                                {94, 100, 90},
                                {100, 81, 82},
                                {83, 65, 85},
                                {78, 87, 65},
                                 {85, 75, 83},
                                {91, 94, 100},
                                {76, 72, 84},
                                {87, 93, 73}};
        
        GradeBook2 myGradeBook2 = new GradeBook2("CS101 Introduction to Java Programming", gradesArray);
        
        System.out.printf("Welcome to the grade book for%n%s%n%n", myGradeBook2.getCourseName());
        myGradeBook2.processGrade();
        
    }
}//
