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
    public static void main(String[] args) {
        ArrayList<Integer> argsInt = new ArrayList<>();
        System.out.println("Args in string");
        try {
            for (String arg : args) {
                System.out.println(arg);
                argsInt.add(StringToInt(arg));
            }
        }catch(Exception ex){
            System.out.println("Inputs are not numbers");
        }
        Collections.sort(argsInt);
        System.out.println("Args in int");
        for (int i: argsInt) {
            System.out.println(i);
        }
    }
}
