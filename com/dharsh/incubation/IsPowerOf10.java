package com.dharsh.incubation;

public class IsPowerOf10 {
    static boolean isPowerOf10(int x){
        return x%10==0?true:false;
    }

    public static void main(String[] args) { 
        System.out.println(isPowerOf10(3));
        System.out.println(isPowerOf10(220));
    }
   
}
