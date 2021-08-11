package lesson5;

import java.util.ArrayList;
import java.util.List;

public class GreatRandomizer {
    public static void main(String[] args) {

        List students = new ArrayList();
        students.add("Oxana");
        students.add("Laura");
        students.add("Nikola");

        System.out.println("There are our students: " + students);
        // Math random is [0...1]
        // As we don't need to get 0 by multiplying Math.random()=0 by students.size(),
        // we subtract 1 from students.size(), and after multiplication
        // by Math.random() we receive 1 instead of 0.
        System.out.println("We select the student # " + (int) Math.round((Math.random() * (students.size() - 1)) + 1));
        // When searching by name we don't need to plus 1, because indexes are from 0 to size-1.
        System.out.println("We select the student with name " + students.get((int) Math.round
                (Math.random() * (students.size() - 1))));
    }
}