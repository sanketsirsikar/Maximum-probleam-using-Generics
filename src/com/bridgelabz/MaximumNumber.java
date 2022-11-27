package com.bridgelabz;
public class MaximumNumber {

    public static void main(String[] args) {
        System.out.println("Welcome to the Generics Problems");
        System.out.println("\n Test the Maximum Three Numbers \n");
        Integer firstNumber = 12;
        Integer secondNumber = 15;
        Integer thirdNumber = 18;
        Float floatNumber1 = 10.2f;
        Float floatNumber2 = 18.80f;
        Float floatNumber3 = 15.70f;
        String string1 = "Apple";
        String string2 = "Banana";
        String string3 = "Peach";

        findMax(firstNumber,secondNumber,thirdNumber);
        findMax(floatNumber1, floatNumber2, floatNumber3);
        findMaxString(string1, string2, string3);
    }
    static void findMax(Integer firstNumber,Integer secondNumber,Integer thirdNumber ){
        Integer maximumNumber;

        if(firstNumber.compareTo(secondNumber)>0 && firstNumber.compareTo(thirdNumber)>0) {
            maximumNumber = firstNumber;
        }
        else if(secondNumber.compareTo(firstNumber)>0 && secondNumber.compareTo(thirdNumber)>0) {
            maximumNumber = secondNumber;
        }
        else {
            maximumNumber = thirdNumber;
        }
        System.out.println(maximumNumber + " is max out of "+firstNumber+", "+secondNumber+" and "+thirdNumber);
    }
    public static void findMax(Float firstNumber, Float secondNumber, Float thirdNumber) {
        Float maximumNumber;

        if (firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thirdNumber) > 0) {
            maximumNumber = firstNumber;
        } else if (secondNumber.compareTo(firstNumber) > 0 && secondNumber.compareTo(thirdNumber) > 0) {
            maximumNumber = secondNumber;
        } else {
            maximumNumber = thirdNumber;
        }
        System.out.println(maximumNumber + " is max out of " + firstNumber + ", " +secondNumber + " and " +thirdNumber);
    }
    public static void findMaxString(String firstString, String secondString, String thirdString) {
        String maximumstring;

        if (firstString.compareTo(secondString) > 0 && firstString.compareTo(thirdString) > 0) {
            maximumstring = firstString;
        } else if (secondString.compareTo(firstString) > 0 && secondString.compareTo(thirdString) > 0) {
            maximumstring = secondString;
        } else {
            maximumstring = thirdString;
        }
        System.out.println(maximumstring + " is max out of " + firstString + ", " +secondString + " and " +thirdString);
    }
}