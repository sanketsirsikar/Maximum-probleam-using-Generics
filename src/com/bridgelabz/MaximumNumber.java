package com.bridgelabz;
public class MaximumNumber <T extends Comparable> {
    T variable1;
    T variable2;
    T variable3;
    public MaximumNumber(T variable1, T variable2, T variable3){
        this.variable1 = variable1;
        this.variable2 = variable2;
        this.variable3 = variable3;

    }
    public void findMax(){
        MaximumNumber.findMax(this.variable1, this.variable2, this.variable3);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Generics Problems");
        System.out.println("\n Test the Maximum Three Numbers ");
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
        findMax(string1, string2, string3);
    }
    static<E extends Comparable<E>> void findMax(E firstVariable,E secondVariable,E thirdVariable ){
        E maximumVariable;

        if(firstVariable.compareTo(secondVariable)>0 && firstVariable.compareTo(thirdVariable)>0) {
            maximumVariable = firstVariable;
        }
        else if(secondVariable.compareTo(firstVariable)>0 && secondVariable.compareTo(thirdVariable)>0) {
            maximumVariable = secondVariable;
        }
        else {
            maximumVariable = thirdVariable;
        }
        System.out.println(maximumVariable + " is max out of "+firstVariable+", "+secondVariable+" and "+thirdVariable);
    }

}

