package com.bridgelabz;

import java.util.ArrayList;
import java.util.Collections;

public class MaximumNumber <T extends Comparable<T>> {
    T variable1;
    T variable2;
    T variable3;
    T variable4;
    T variable5;
    T variable6;

    public MaximumNumber(T variable1, T variable2, T variable3, T variable4, T variable5, T variable6) {
        this.variable1 = variable1;
        this.variable2 = variable2;
        this.variable3 = variable3;
        this.variable4 = variable4;
        this.variable5 = variable5;
        this.variable6 = variable6;

    }

    public void findMax() {
        MaximumNumber<T> maximumNumber;
        MaximumNumber.findMax(this.variable1, this.variable2, this.variable3, this.variable4, this.variable5, this.variable6);
    }

    static <E> void printMax(E Maximum, ArrayList<E>list){
        System.out.println();
        System.out.println(Maximum+" is maximum out of =" +list);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Generics Problems");
        System.out.println("\n Test the Maximum Three Numbers ");
        Integer firstNumber = 12;
        Integer secondNumber = 15;
        Integer thirdNumber = 18;
        Integer fourthNumber = 30;
        Integer fiveNumber = 25;
        Integer sixNumber = 19;
        Float floatNumber1 = 10.2f;
        Float floatNumber2 = 18.80f;
        Float floatNumber3 = 15.70f;
        Float floatNumber4 = 17.5f;
        Float floatNumber5 = 40.56f;
        Float floatNumber6 = 75.12f;
        String string1 = "Apple";
        String string2 = "Banana";
        String string3 = "Peach";
        String string4 = "Lion";
        String string5 = "Tiger";
        String string6 = "Elephant";

        findMax(firstNumber, secondNumber, thirdNumber, fourthNumber, fiveNumber, sixNumber);
        findMax(floatNumber1, floatNumber2, floatNumber3, floatNumber4, floatNumber5, floatNumber6);
        findMax(string1, string2, string3, string4, string5, string6);
    }

    static <E extends Comparable<E>> void findMax(E firstVariable, E secondVariable, E thirdVariable, E fourthVariable, E fiveVariable, E sixVariable) {
        E maximumVariable;

        ArrayList<E> list = new ArrayList<>();
        list.add(firstVariable);
        list.add(secondVariable);
        list.add(thirdVariable);
        list.add(fourthVariable);
        list.add(fiveVariable);
        list.add(sixVariable);
        System.out.println();
        System.out.println(Collections.max(list) + " is max out of " + list);

    }
}