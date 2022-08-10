//Sydney Povey
//Started Sept 27 2021, Finished sept 27 2021.
//Project that calculates the grade average of 5 classes and assigns a letter grade.
import javax.swing.JOptionPane;
public class GradeAverageCalculator {
    public static void main (String[]args){
        //variable used to store the average
        double average = 0.0;
        
        //This code asks the user for five different class grades and assigns the answers a variable.
        double class1 = Double.parseDouble(JOptionPane.showInputDialog("Input your first class' grade:"));
        double class2 = Double.parseDouble(JOptionPane.showInputDialog("Input your second class' grade:"));
        double class3 = Double.parseDouble(JOptionPane.showInputDialog("Input your third class' grade:"));
        double class4 = Double.parseDouble(JOptionPane.showInputDialog("Input your fourth class' grade:"));
        double class5 = Double.parseDouble(JOptionPane.showInputDialog("Input your fifth class' grade:"));
        
        //This code calculates the average of all the grades and rounds it to two decimal placements:
        average = (class1 + class2 + class3 + class4 + class5)/5;
        average = average*100;
        average = Math.round(average);
        average = average/100;
        
        //This code uses the rounded average to decide what letter grade the user receives.
        //it also displays the average.
        if (average <= 100 && average >= 90) {
            JOptionPane.showMessageDialog(null, "Average: " + average + "\nA+, Excellent Job!");
        }
        
        if (average < 90 && average >= 80) {
            JOptionPane.showMessageDialog(null, "Average: " + average + "\nA, Very Good Job.");
        }
        
        if (average < 80 && average >= 70){
            JOptionPane.showMessageDialog(null, "Average: " + average + "\nB, Good Job.");
        }
        if (average < 70 && average >= 60){
            JOptionPane.showMessageDialog(null, "Average: " + average + "\nC, Satisfactory Work.");
        }
        if (average < 60 && average >= 50){
            JOptionPane.showMessageDialog(null, "Average: " + average + "\nD, Needs Improvement");
        }
        if (average <50){
            JOptionPane.showMessageDialog(null, "Average: " + average + "\nA for effort.");
        }
    }
}

/*
Ways to "break" the program:
1. The user inputs a values over 100 causing the average to be over 100 (the program would not display an answer).
2. The user inputs something that isn't anumber like "bread" (program crashes).
3. The user inputs nothing (program crashes).
*/
