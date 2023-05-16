package com.dharsh.incubation;

public class DotProduct {
    static long dotProduct( int[] array1, int array2[] ){
        return ((array1[0]*array2[0])+(array1[1]*array2[1]));
    }

    public static void main(String[] args) { 
        int[] fraction1 = { 2, 3}; 
        int[] fraction2 = { 1, 2}; 
        System.out.println(dotProduct(fraction1,fraction2));
    }
}
