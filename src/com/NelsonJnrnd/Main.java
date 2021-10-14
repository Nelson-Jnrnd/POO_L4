package com.NelsonJnrnd;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static int StringToInt(String inputString) throws Exception {
        int sign = 1;
        int outputInt = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char charToProcess = inputString.charAt(i);
            if (Character.isDigit(charToProcess)) {
                outputInt += Math.pow(10, inputString.length() - 1 - i) * Character.getNumericValue(charToProcess);
            } else if (i == 0 && (charToProcess == '-' || charToProcess == '+')) {
                sign = (charToProcess == '-' ? 1 : -1);
            } else {
                throw new Exception("Not a number");
            }
        }
        return sign * outputInt;
    }

    public static <T extends Comparable<T>> void BubbleSort(ArrayList<T> inputArray) {
        if (!inputArray.isEmpty()) {
            for (int i = 0; i < inputArray.size() - 1; i++) {
                for (int j = 1; j < inputArray.size() - i; j++) {
                    if (inputArray.get(j).compareTo(inputArray.get(j - 1)) < 0) {
                        Collections.swap(inputArray, j, j - 1);
                    }
                }
            }
        }
    }


    public static void exe1(String[] args) {
        ArrayList<Integer> argsInt = new ArrayList<>();
        System.out.println("Args in string");
        try {
            for (String arg : args) {
                System.out.println(arg);
                argsInt.add(StringToInt(arg));
            }
        } catch (Exception ex) {
            System.out.println("Inputs are not numbers");
        }
        //Collections.sort(argsInt);
        BubbleSort(argsInt);
        System.out.println("Args in int");
        for (int i : argsInt) {
            System.out.println(i);
        }
    }

    public static void exe2() {
        System.out.println("Test de la classe Int");
        Int monInt = new Int(31);

        System.out.println("Constructeur et get value: " + monInt.get_value());
        monInt.set_value(13);
        System.out.println("set value :" + monInt.get_value());
    }

    public static void exe3(String[] args) {
        ArrayList<Int> argsInt = new ArrayList<>();
        System.out.println("Args in string");
        try {
            for (String arg : args) {
                System.out.println(arg);
                argsInt.add(new Int(StringToInt(arg)));
            }
        } catch (Exception ex) {
            System.out.println("Inputs are not numbers");
        }
        BubbleSort(argsInt);
        System.out.println("Args in int");
        for (Int i : argsInt) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        System.out.println("Exe 1");
        exe1(args);

        System.out.println("\nExe 2");
        exe2();

        System.out.println("\nExe 3");
        exe3(args);

    }
}
