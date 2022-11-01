package calculate;
// Write a Java program to test an array list is empty or not. Define array list with underground tube names


import java.util.ArrayList;

public class Programme_7 {
    public static void main(String[] args) {
        ArrayList<String> tubeList = new ArrayList();
        tubeList.add("Metropolitan Line");
        tubeList.add("Jubilee Line");
        tubeList.add("Picadilly Line");
        tubeList.add("Elizabeth Line");
        tubeList.add("Northern Line");
        tubeList.add("Victoria Line");
        System.out.println("Original array list: " + tubeList);
        System.out.println("Checking the above array list is empty or not! " + tubeList.isEmpty());
        tubeList.removeAll(tubeList);
        System.out.println("Array list after remove all elements " + tubeList);
        System.out.println("Checking the above array list is empty or not! " + tubeList.isEmpty());

    }
}
