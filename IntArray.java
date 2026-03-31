import java.util.Random;

public class IntArray {
   private int length;
   private int[] myArray;
   
   public IntArray(int l) {
      length = l;
      myArray = new int[length];
   }
   
   public void clear() {
      for (int i = 0; i < length; i++) {
         myArray[i] = 0;
      }
   }
   
   public void fillRand() {
      Random rand = new Random();
      for (int i = 0; i < length; i++) {
         myArray[i] = rand.nextInt(6) + 1;
      }
   }
    
   public int get(int element) {
      return myArray[element];
   }
    
   public void set(int element, int newValue) {
      myArray[element] = newValue;
   }
    
   public int size() {
      return length;
   }
    
   public boolean isEmpty() {
      return length == 0;
   }

   public void sort() {
      for (int i = 0; i < length - 1; i++) {
         for (int j = 0; j < length - i - 1; j++) {
            if (myArray[j] > myArray[j + 1]) {
               int temp = myArray[j];
               myArray[j] = myArray[j + 1];
               myArray[j + 1] = temp;
            }
         }
      }
   } 
    
   public String toString() {
      String result = "";
      for (int i = 0; i < length; i++) {
         result += myArray[i];
         if (i < length - 1) {
            result += " ";
         }
      }
      return result;
   }
}