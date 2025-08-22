package com.template;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Collections;

public class App {

    // 1. Sum of Two Integers
    public int sum(int a, int b) {
        return a + b;
    }

    // 2. Check Even or Odd
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    // 3. Maximum of Two Numbers
    public int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // 4. Factorial of a Number
    public int factorial(int n) {
        if (n < 0) return -1;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // 5. Count Characters in a String
    public int countChars(String input) {
        if (input == null) return 0;
        return input.length();
    }

    // 6. Reverse a String
    public String reverse(String input) {
        if (input == null) return "";
        return new StringBuilder(input).reverse().toString();
    }

    // 7. Check Prime Number
    public boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // 8. Find the Smallest Element in an Array
    public int findMin(int[] array) {
        if (array == null || array.length == 0) return 0;
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // 9. Sum of Elements in an Array
    public int arraySum(int[] array) {
        if (array == null) return 0;
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // 10. Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // 11. Sum of Elements in a List
    public int sumList(List<Integer> list) {
        if (list == null || list.isEmpty()) return 0;
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }

    // 12. Find the Largest Element in a List
    public int findMax(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("La lista no puede estar vacía o ser nula");
        }
        return Collections.max(list);
    }

    // 13. Filter Even Numbers from a List
    public List<Integer> filterEvenNumbers(List<Integer> list) {
        if (list == null) {
            throw new IllegalArgumentException("La lista no puede ser nula");
        }

        List<Integer> evenNumbers = new ArrayList<>();
        for (int num : list) {
            if (num % 2 == 0) {   // si el número es par
                evenNumbers.add(num);
            }
        }
        return evenNumbers;
    }


    // 14. Concatenate Two Lists
    public List<String> concatenateLists(List<String> list1, List<String> list2) {
        if (list1 == null || list2 == null) {
            throw new IllegalArgumentException("Las listas no pueden ser nulas");
        }
        List<String> result = new ArrayList<>(list1);
        result.addAll(list2);
        return result;
    }


    // 15. Check if List Contains Element
    public boolean listContains(List<String> list, String element) {
        if (list == null) {
            throw new IllegalArgumentException("La lista no puede ser nula");
        }
        return list.contains(element);
    }

    // 16. Convert Strings to Uppercase
    public List<String> toUpperCase(List<String> list) {
        if (list == null) {
            throw new IllegalArgumentException("La lista no puede ser nula");
        }
        List<String> result = new ArrayList<>();
        for (String s : list) {
            if (s != null) {
                result.add(s.toUpperCase());
            } else {
                result.add(null); // mantiene nulos si existieran
            }
        }
        return result;
    }

    // 17. Remove Duplicates from a List
    public List<Integer> removeDuplicates(List<Integer> list) {
        if (list == null) {
            throw new IllegalArgumentException("La lista no puede ser nula");
        }
        Set<Integer> set = new HashSet<>(list);  // elimina duplicados
        return new ArrayList<>(set);
    }

    // 18. Convert List to Set for Unique Elements
    public Set<Integer> listToSet(List<Integer> list) {
        if (list == null) {
            throw new IllegalArgumentException("La lista no puede ser nula");
        }
        return new HashSet<>(list);
    }

    // 19. Check if Map Contains Key
    public boolean mapContainsKey(Map<String, String> map, String key) {
        if (map == null) {
            throw new IllegalArgumentException("El mapa no puede ser nulo");
        }
        return map.containsKey(key);
    }

    // 20. Check if Map Contains Value
    public boolean mapContainsValue(Map<String, String> map, String value) {
        if (map == null) {
            throw new IllegalArgumentException("El mapa no puede ser nulo");
        }
        return map.containsValue(value);
    }

    // 21. Iterate Over a Map
    public List<String> iterateMap(Map<String, String> map) {
        if (map == null) {
            throw new IllegalArgumentException("El mapa no puede ser nulo");
        }

        List<String> result = new ArrayList<>();
        for (String key : map.keySet()) {
            String value = map.get(key);
            result.add(key + " -> " + value);
        }
        return result;
    }
}


