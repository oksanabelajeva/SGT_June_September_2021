package lesson23;

import java.util.*;

public class HashTableLesson {
    public static void main(String[] args) {
        Hashtable<String, Integer> edibleProductPrices = new Hashtable<>();
        edibleProductPrices.put("Apple", 1);
        edibleProductPrices.put("Milk", 2);
        edibleProductPrices.put("Cheese", 6);
        edibleProductPrices.put("Ice cream", 4);
        edibleProductPrices.put("Oysters", 50);
        edibleProductPrices.put("Chocolate", 1);
        edibleProductPrices.put("White truffles", 3000);
        edibleProductPrices.put("Sour cream", 1);

        int counterOfPriceBelowOne = 0;
        for (Integer price : edibleProductPrices.values()) {
            if (price <= 1) {
                counterOfPriceBelowOne++;
            }
        }
        System.out.println("There are " + counterOfPriceBelowOne + " items below or equals one eur.");

        int lowestPrice = Integer.MAX_VALUE;
        for (String edibleProductName : edibleProductPrices.keySet()) {
            if (edibleProductPrices.get(edibleProductName) < lowestPrice) {
                lowestPrice = edibleProductPrices.get(edibleProductName);
            }
        }
        System.out.println("The lowest price is " + lowestPrice + " eur.");

        for (String edibleProductName : edibleProductPrices.keySet()) {
            if (edibleProductPrices.get(edibleProductName) == lowestPrice) {
                System.out.println(edibleProductName + " has the lowest price.");
            }
        }

        int highestPrice = Integer.MIN_VALUE;
        for (String edibleProductName : edibleProductPrices.keySet()) {
            if (edibleProductPrices.get(edibleProductName) > highestPrice) {
                highestPrice = edibleProductPrices.get(edibleProductName);
            }
        }
        System.out.println("The highest price is " + highestPrice + ".");

        for (String edibleProductName : edibleProductPrices.keySet()) {
            if (edibleProductPrices.get(edibleProductName) == highestPrice) {
                System.out.println(edibleProductName + " has the highest price.");
            }
        }

        Hashtable<String, Integer> inedibleProductsPrices = new Hashtable<>();
        inedibleProductsPrices.put("Book", 6);
        inedibleProductsPrices.put("Bicycle", 250);
        inedibleProductsPrices.put("Computer", 900);
        inedibleProductsPrices.put("Umbrella", 15);
        inedibleProductsPrices.put("Calendar", 3);

        Hashtable<String, Integer> edibleAndInedibleProductsPrices = new Hashtable<>();
        edibleAndInedibleProductsPrices.putAll(edibleProductPrices);
        edibleAndInedibleProductsPrices.putAll(inedibleProductsPrices);

        System.out.println("There are " + edibleAndInedibleProductsPrices.size() + " in both stores.");
        System.out.println("Unsorted list of products in both stores: " + edibleAndInedibleProductsPrices);

        Map<String, Integer> sortedEdibleAndInedibleProductsPrices = new LinkedHashMap<>();
        // Method 1
        List<Map.Entry<String, Integer>> listEdibleAndInedibleProductsPrices = new LinkedList<>(sortedEdibleAndInedibleProductsPrices.entrySet());
        Collections.sort(listEdibleAndInedibleProductsPrices, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if (true) {
                    return o1.getValue().compareTo(o2.getValue());
                } else {
                    return o2.getValue().compareTo(o1.getValue());
                }
            }
        });
        for (Map.Entry<String, Integer> productPrice : listEdibleAndInedibleProductsPrices) {
            sortedEdibleAndInedibleProductsPrices.put(productPrice.getKey(), productPrice.getValue());
        }
        System.out.println("Sorted list of products in both stores (method 1): " + sortedEdibleAndInedibleProductsPrices.toString());

        // Method 2
        edibleAndInedibleProductsPrices.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> sortedEdibleAndInedibleProductsPrices.put(x.getKey(), x.getValue()));
        System.out.println("Sorted list of products in both stores (method 2): " + sortedEdibleAndInedibleProductsPrices);
    }
}