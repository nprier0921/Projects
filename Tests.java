//Nia Prier
import java.util.Scanner;

public class Tests {

   private double ave;
   private int count;
   private int score;
   
   public Tests() {
      ave = 0.0;
      count = 0;
      score = 0;
    }
   
   public double getAve() {
      return ave;
    }
   
   public int getScore() {
      return score;
    }
   
   public void setScore(int newScore) {
      score = newScore;
    }
  
   public void getAverage() {
      Scanner scan = new Scanner(System.in);
      double sum = 0.0;
     
      System.out.println("Enter a test score (type '-1' when finished entering scores): ");
      setScore(scan.nextInt());
     
      while (getScore() != -1) {
         sum += getScore();
         count++;
      
         System.out.println("Enter test scores (type '-1' when finished entering scores): ");
         setScore(scan.nextInt());
     } 
    ave = sum/count;
   }
   
   public String toString(){
      return "The average of the " + count + " scores entered is " + String.format("%2f", ave) + ".";
     }
     
 }