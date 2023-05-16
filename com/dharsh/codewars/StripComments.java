package com.dharsh.codewars;

import java.util.Arrays;
import java.util.List;

public class StripComments {
    public static String stripComments(String text, String[] commentSymbols) {
        String result = "";
        String[] strAray = text.split("\n");
        List<String> commentSymList = Arrays.asList(commentSymbols);
        String str;
        for(int i = 0;i< strAray.length;i++){
            str = "";
            char[] c = strAray[i].toCharArray();
            for(int j = 0;j< c.length;j++){
                if(commentSymList.contains(String.valueOf(c[j]))){
                    break;
                }else{
                    str = str + c[j];  
                }
            }
            if (!str.trim().equals("")) {
                str = str.stripTrailing();
                result = result + str;
            }
            if(i!=strAray.length-1){
                result = result + "\n";
            }
        }
        return result;
	}

    public static void main(String[] args) {
    System.out.println("apples, pears\ngrapes\n\n\nbananas == " 
            + StripComments.stripComments( "apples, pears # and bananas\ngrapes\n\n\nbananas !apples", new String[] { "#", "!" } ));
    System.out.println("a\nc\nd == " 
            + StripComments.stripComments( "a #b\nc\nd $e f g", new String[] { "#", "$" } ));
    String result = StripComments.stripComments( "##\n##\n##\n$\n$\na #b\nc\nd $e f g", new String[] { "#", "$" } );
    System.out.println("\n\n\n\n\na\nc\nd == " 
            + result);
    }
}
