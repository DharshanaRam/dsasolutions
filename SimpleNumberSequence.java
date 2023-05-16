/*
 * https://www.codewars.com/kata/5a28cf591f7f7019a80000de/train/java
 */
public class SimpleNumberSequence {

    public static int missing(String s){
       
        return -1;
    }

    public static void main(String[] args) { 
    System.out.println("4 == " + SimpleNumberSequence.missing("123567"));//3
    System.out.println("92 == " +  SimpleNumberSequence.missing("899091939495"));
    System.out.println("-1 == " +  SimpleNumberSequence.missing("599600601602"));
    }
    
}
