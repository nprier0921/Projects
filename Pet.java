//Nia Prier
import java.lang.Object;

public class Pet {

   private String name;
   
   public Pet() {
      this.setName("Pet Name");
   }
   
   public void setName(String newName) 
   {
      this.name = newName;
   }
      
   public String getName()
   {
      return this.name;
   }
   
   public String toString()
   {
      String output = "Pet information:\n";
      output += "Name: " + this.getName();
      return output;
   }

//main 
    public static void main(String[] args) {
     Pet p1 = new Pet();
     System.out.println(p1 + "\n");
     
     Pet p2 = new Pet();
     p2.setName("Venus");
     System.out.println(p2);
     
    }
}