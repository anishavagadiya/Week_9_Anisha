package calculate;
// Write a Java program to create a new array list, add some colours (string) and
//printout the collection using for each loop.


import java.util.ArrayList;

public class Programme_4 {
   public static void main(String[] args) {
      ArrayList<String  > colorName = new ArrayList<>();    //Array list
      colorName.add("Pink");
      colorName.add("Red");
      colorName.add("Black");
      colorName.add("Blue");
      colorName.add("Yellow");
      colorName.add("White");
      colorName.add("Orange");
      colorName.add("Green");

      //Using Advance for loop
      for (String name : colorName){
         System.out.println(name);
      }

   }

   }

