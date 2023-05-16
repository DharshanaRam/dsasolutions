package com.dharsh.codewars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

/*
 * https://www.codewars.com/kata/554ca54ffa7d91b236000023/train/java
 * 
 */
public class DeleteNthOccurence {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        if(maxOccurrences == 0){
            return new int[]{};
        }
		Map<Integer,Integer> elementCheck = new HashMap<Integer,Integer>();
        List<Integer> objectArray = new ArrayList<>();
        for(int i : elements){
            if(elementCheck.containsKey(i)){
                int count = elementCheck.get(i);
                if(count<maxOccurrences){
                    objectArray.add(i);
                    elementCheck.put(i, count+1);
                }
            }else{
                objectArray.add(i);
                elementCheck.put(i, 1);
            }
        }

        int[] intArray = new int[objectArray.size()];

        for(int i=0; i<objectArray.size(); i++){
            intArray[i] = (int) objectArray.get(i);
        }
       return intArray;
	}
    
    public static int[] deleteNthModular(int[] elements, int maxOccurrences) {
		Map<Integer, Integer> occurrence = new HashMap<>();
		return IntStream.of(elements)
			.filter(motif -> occurrence.merge(motif, 1, Integer::sum) <= maxOccurrences)
			.toArray();
	}

    public static void main(String[] args) {
        int[] exampleTest1 = { 20, 37, 20, 21}; 
        int[] result = DeleteNthOccurence.deleteNth(exampleTest1,1);
        System.out.println("result == " + result.length );//3

        result = DeleteNthOccurence.deleteNthModular(exampleTest1,1);
        System.out.println("result == " + result.length );//3
    }
    
}
