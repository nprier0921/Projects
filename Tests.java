//Nia Prier
import java.util.Scanner;

public class Tests {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.println("Please enter 3 test scores.");
  
  double score1 = scan.nextDouble();
  System.out.println("Test score 1: " + score1);
  
  double score2 = scan.nextDouble();
  System.out.println("Test score 2: " + score2);  
  
  double score3 = scan.nextDouble();
  System.out.println("Test score 3: " + score3); 
  
  double avgScore;
  avgScore = (score1 + score2 + score3)/3.0;
  System.out.printf("The average of 3 test scores is: " + avgScore);
  
 }
}