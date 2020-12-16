package com.company;

class Calculator {
    /*
     *  Class serves for calculating values
     */

    public static float addition_operation(float one, float two) {
        float three = one + two;
        return three;
    }

    public static float deduction_operation(float one, float two) {
        float three = one - two;
        return three;
    }

    public static float multiplication_operation(float one, float two) {
        float three = one * two;
        return three;
    }

    public static float division_operation(float one, float two) {
        float three = one / two;
        return three;
    }

    public static float percentage_operation(float one, float two) {
        float three = one * two / 100;
        return three;
    }
}

class Main {

    public static void main(String[] args) {
        System.out.println(Calculator.addition_operation(1,2));
        System.out.println(Calculator.deduction_operation(2,1));
        System.out.println(Calculator.multiplication_operation(2,2));
        System.out.println(Calculator.division_operation(1,2));
        System.out.println(Calculator.percentage_operation(20,5));
    }
}
