package lesson23;


import java.util.*;

public class HashMapLesson {
    public static void main(String[] args) {
        HashMap<String, Integer> firstStoreProductPrices = new HashMap<>();
        firstStoreProductPrices.put("Apple", 1);
        firstStoreProductPrices.put("Milk", 2);
        firstStoreProductPrices.put("Cheese", 6);
        firstStoreProductPrices.put("Computer", 900);
        firstStoreProductPrices.put("Couch", 500);
        firstStoreProductPrices.put("Chocolate", 1);
        firstStoreProductPrices.put("Mobile Phone", 400);
        firstStoreProductPrices.put("Sour cream", 1);

        int counterOfPricesBelowOne = 0;
        for (Integer price : firstStoreProductPrices.values()) {
            if (price <= 1) {
                counterOfPricesBelowOne++;
            }
        }
        System.out.println("There are " + counterOfPricesBelowOne + " items below or equals one eur.");

        int lowestPrice = Integer.MAX_VALUE;
        for (String productName : firstStoreProductPrices.keySet()) {
            if (firstStoreProductPrices.get(productName) < lowestPrice) {
                lowestPrice = firstStoreProductPrices.get(productName);
            }
        }
        System.out.println("The lowest price is " + lowestPrice + " eur.");

        for (String productName : firstStoreProductPrices.keySet()) {
            if (firstStoreProductPrices.get(productName) == lowestPrice) {
                System.out.println(productName + " has the lowest price.");
            }
        }

        int highestPrice = Integer.MIN_VALUE;
        for (Integer price : firstStoreProductPrices.values()) {
            if (price > highestPrice) {
                highestPrice = price;
            }
        }
        System.out.println("The highest price is " + highestPrice + ".");

        for (String productName : firstStoreProductPrices.keySet()) {
            if (firstStoreProductPrices.get(productName) == highestPrice) {
                System.out.println(productName + " has the highest price.");
            }
        }

        HashMap<String, Integer> secondStoreProductsPrices = new HashMap<>();
        secondStoreProductsPrices.put("Book", 6);
        secondStoreProductsPrices.put("Bicycle", 250);
        secondStoreProductsPrices.put("Ice cream", 4);
        secondStoreProductsPrices.put("Umbrella", 15);
        secondStoreProductsPrices.put("Calendar", 3);

        HashMap<String, Integer> bothStoresProductsPrices = new HashMap<>();
        bothStoresProductsPrices.putAll(firstStoreProductPrices);
        bothStoresProductsPrices.putAll(secondStoreProductsPrices);

        System.out.println("There are " + bothStoresProductsPrices.size() + " in both stores.");
        System.out.println("Unsorted list of products in both stores: " + bothStoresProductsPrices);

        Map<String, Integer> sortedBothStoresProductsPrices = new LinkedHashMap<>();
        // Method 1
        List<Map.Entry<String, Integer>> listBothStoresProductsPrices = new LinkedList<>(bothStoresProductsPrices.entrySet());
        Collections.sort(listBothStoresProductsPrices, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if (true) {
                    return o1.getValue().compareTo(o2.getValue());
                } else {
                    return o2.getValue().compareTo(o1.getValue());
                }
            }
        });
        for (Map.Entry<String, Integer> productPrice : listBothStoresProductsPrices) {
            sortedBothStoresProductsPrices.put(productPrice.getKey(), productPrice.getValue());
        }
        System.out.println("Sorted list of products in both stores (method 1): " + sortedBothStoresProductsPrices);

        // Method 2
        bothStoresProductsPrices.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> sortedBothStoresProductsPrices.put(x.getKey(), x.getValue()));
        System.out.println("Sorted list of products in both stores (method 2): " + sortedBothStoresProductsPrices);
    }
}