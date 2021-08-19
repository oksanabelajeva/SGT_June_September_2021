package lesson23;

import java.util.Collections;
import java.util.HashMap;

public class HashMapHashSetLesson {
    public static void main(String[] args) {
        HashMap<String, Integer> productPrices = new HashMap<>();
        productPrices.put("Apple", 1);
        productPrices.put("Milk", 2);
        productPrices.put("Cheese", 6);
        productPrices.put("Computer", 900);
        productPrices.put("Couch", 500);
        productPrices.put("Chocolate", 1);
        productPrices.put("Mobile Phone", 400);
        productPrices.put("Sour cream", 1);

//      Find out how many products are under 1 eur.
        int counterOfPricesBelowOne = 0;
        for (Integer price : productPrices.values()) {
            if (price <= 1) {
                counterOfPricesBelowOne++;
            }
        }
        System.out.println("There are " + counterOfPricesBelowOne + " items below one eur.");

        //     Find out which product price is the lowest.
        int lowestPrice = Integer.MAX_VALUE;
        for (String productName : productPrices.keySet()) {
            if (productPrices.get(productName) < lowestPrice) {
                lowestPrice = productPrices.get(productName);
            }
        }
        System.out.println("The lowest price is " + lowestPrice + " eur.");

        for (String productName : productPrices.keySet()) {
            if (productPrices.get(productName) == lowestPrice) {
                System.out.println(productName + " has the lowest price.");
            }
        }

//     Find out which product price is the largest.
        int highestPrice = Integer.MIN_VALUE;
        for (Integer price : productPrices.values()) {
            if (price > highestPrice) {
                highestPrice = price;
            }
        }
        System.out.println("The highest price is " + highestPrice + ".");

        for (String productName: productPrices.keySet()){
            if(productPrices.get(productName) == highestPrice){
                System.out.println(productName + " has the highest price.");
            }
        }

//     Create a new HashMap with other products.
//     Merge both HashMaps and print out how many products are in the merged HashMap.


//     Sort all values in ascending order.


//     Repeat the same tasks with HashTable.
    }
}
