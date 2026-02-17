//Nia Prier
import java.lang.Object;

public class Pet {

   private String name;
   private String type;
   private int age;
   
   public Pet() {
      this.setName("Pet Name");
      this.setType("Animal");
      this.setAge(1);
   }
   
   public Pet(String name, String type, int age) 
   {
      this.setName(name);
      this.setType(type);
      this.setAge(age);
   }
   
   public void setName(String newName) 
   {
      this.name = newName;
   }
   
   public void setType(String newType)
   {
      this.type = newType;
   }
   
   public void setAge(int newAge)
   {
      this.age = newAge;
   }
      
   public String getName()
   {
      return this.name;
   }
   
    public String getType()
   {
      return this.type;
   }
   
   public int getAge()
   {
      return this.age;
   }
   
   public String speak() {
      if(this.type.equalsIgnoreCase("dog")) {
         return "Woof";
      }
      else if (this.type.equalsIgnoreCase("cat")) {
         return "Meow";
      }
      else {
         return "Yowl";
      }
   }
   
   public String toString()
   {
      String output = "Pet information:\n";
      output += "Name: " + this.getName() + "\n";
      output += "Type: " + this.getType() + "\n";
      output += "Age: " + this.getAge() + "\n";
      output += "Sound: " + this.speak() + "\n";
      return output;
   }
}