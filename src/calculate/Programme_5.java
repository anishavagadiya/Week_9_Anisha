package calculate;
// Write a Java program to iterate through all elements in an array list using Iterator.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Programme_5 {
    public static void main(String[] args) {
        //Array List
        ArrayList<Integer> List = new ArrayList();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(6);
        List.add(7);
        List.add(8);
        Iterator i = List.iterator();
        System.out.println("The Arraylist elemrnts are :");
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }


}
