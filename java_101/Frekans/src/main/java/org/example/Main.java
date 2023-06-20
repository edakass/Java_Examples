package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    /*
     * A program in Java language that finds the frequency of the elements in the array.
     */
    public static void main(String[] args) {
        int[] myArray = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println(Arrays.toString(myArray));
        System.out.println("--- Number of Repetitions ---");

        int counter = 0;
        HashMap<Integer, Integer> controlList = new HashMap<>();

        for (int i= 0; i < myArray.length; i++) {
            for (int j = 0 ; j < myArray.length; j++) {
                if (myArray[i] == myArray[j]) {
                    counter ++;
                }
            }
            controlList.put(myArray[i], counter);

            counter = 0;
        }
        for(Map.Entry m : controlList.entrySet()) {
            System.out.println(m.getKey() + " sayisi "+ m.getValue() + " kere kullanildi" );
        }
    }
}