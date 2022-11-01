package calculate;
// Write a Java program to retrieve an element (at a specified index) from a given array list


import java.util.ArrayList;

public class Programme_6 {
    public static void main(String[] args) {
        //create ArrayList for subject name
        ArrayList<String> list = new ArrayList<>();
        list.add("Maths");
        list.add("Science");
        list.add("Physics");
        list.add("Chemistry");
        list.add("Psychology");
        System.out.println("Subject Name :" + list); //Print list of subject

        //Retrive Third and fourth element
        String element = list.get(2);
        System.out.println("Third element :" + element);
        element = list.get(3);
        System.out.println("fourth element :" + element);


        }
    }
