package lesson23;

import java.util.TreeSet;

public class TreeSetLesson {
    public static void main(String[] args) {
        TreeSet<Integer> myTreeSet = new TreeSet<>();
        myTreeSet.add(59);
        myTreeSet.add(18);
        myTreeSet.add(-2000);
        myTreeSet.add(1);
        myTreeSet.add(1994);
        myTreeSet.add(18);

        System.out.println("Sorted Integer Tree Set is: " + myTreeSet);
        System.out.println("The first element of Sorted Integer Tree Set is: " + myTreeSet.first());
        System.out.println("The last element of Sorted Integer Tree Set is: " + myTreeSet.last());

        myTreeSet.remove(18);
        System.out.println("We removed 18 and Sorted Integer Tree Set now is " + myTreeSet);

        TreeSet<String> myStringTreeSet = new TreeSet<>();
        myStringTreeSet.add("Oxana");
        myStringTreeSet.add("Cake");
        myStringTreeSet.add("Artjoms");
        myStringTreeSet.add("Martins");
        myStringTreeSet.add("Cat");
        myStringTreeSet.add("Dog");

        System.out.println("Sorted String Tree Set is: " + myStringTreeSet);

    }
}
