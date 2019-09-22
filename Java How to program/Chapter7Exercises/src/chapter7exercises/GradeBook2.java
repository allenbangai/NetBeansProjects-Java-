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
public class GradeBook2 {
    private String courseName; // name of course this grade book represents
    private int[][] grades; // two-dimensional array of student grades
    
    //two argurment constructor, courseName and grades
    public GradeBook2(String courseName, int grades[][]){
        this.courseName = courseName;
        this.grades = grades;
    }
    
    public void setCourseName(String coursesName){
        this.courseName = courseName;
    }
    
    public String getCourseName(){
        return courseName;
    }
    
    public void processGrade(){
        outputGrade();
        
        // call methods getMinimum and getMaximum
        System.out.printf("%n%s %d%n%s %d%n%n", "Lowest grade in the grade book is", getMinimum(),
            "Highest grade in the grade book is", getMaximum());

        // output grade distribution chart of all grades on all tests
        outputBarChart();
    }
    
    public int getMinimum(){
        int lowGrade = grades[0][0];
        //loop through rows of grade array 
        for(int[] studentGrades : grades ){
            // loop through column of current row
            for(int actualGrade : studentGrades){
                if(actualGrade<lowGrade){
                    lowGrade = actualGrade;
                }
            }
        }
        
        return lowGrade;
    }
    
    //find maximum grade
    public int getMaximum(){
        int maxGrade = grades[0][0];
        
        for(int studentGrades[] : grades){
            for(int actualGrade : studentGrades){
                if(actualGrade > maxGrade){
                     maxGrade = actualGrade;
                }
            }
        }
        return maxGrade;
    }

    //determine the average grade from a particular set if Grades
    public double getAverage(int[] setOfGrades){
        int total = 0;
        double average = 0;
        //sum grade for ine student
        for(int grade : setOfGrades){
            total += grade;
        }
        
        average = total/setOfGrades.length;
        return average;
    }
    
    //output the content of the content array
    private void outputGrade() {
        System.out.println("The Grades are \n\n");
        System.out.print("          ");//align column heads
        
        //creat a column heading for each of the test
        for(int test = 0; test < grades[0].length; test++){
            System.out.printf("test %d", test+1);
        }
        System.out.println("Average");
        
        //create rows and column of text representing array grades
        for(int student =0; student <grades.length; student++){
            System.out.printf("Student %2d", student + 1);
            
            for(int test : grades[student]){
                System.out.printf("%8d ", test);                
            }            
            // call method getAverage to calculate student's average grade;
            // pass row of grades as the argument to getAverage
            double average = getAverage(grades[student]);
            System.out.printf("%9.2f%n", average);
        }
    }

    private void outputBarChart() {
        System.out.println("Overall grade Distribution");
        int[] frequency = new int[11];
        //Stores frquency of grades in each range of 10 grades
        for(int[] studentGrades : grades){
            for(int grade : studentGrades){
                
                ++frequency[grade/10];
            }
        }
        
        //for each grade of frequency, print a bar chart
        for(int count=0; count <frequency.length; count++){
            // output bar label ("00-09: ", ..., "90-99: ", "100: ")
            if(count == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
            
            //print bar of asterisk
            for(int stars = 0; stars<frequency[count]; stars++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}//end class
