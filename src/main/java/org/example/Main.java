package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 4, 3, 2, 1, 4, 6, 7, 7, 3, 2, 1};
        System.out.println(Arrays.toString(numbers));

        Map<Integer, Integer> numbersMap = convertToMap(numbers);
        System.out.println(numbersMap);
    }

    public static Map<Integer, Integer> convertToMap(int[] numbers) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : numbers) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        return map;
    }
}