import java.util.HashMap;
import java.util.Map;

/*
 * https://www.codewars.com/kata/54da539698b8a2ad76000228/train/java
 */
public class TenMinutesWalk {
    
    public static boolean isValid(char[] walk) {
        if(walk.length!= 10){
            return false;
        }
        Map<Character,Integer> steps = new HashMap<Character,Integer>();
        for(char c : walk){
            steps.put(c, steps.get(c)!=null ? steps.get(c)+1 : 1);
        }
        System.out.println(steps.size());
        if(steps.get('n')!=null && steps.get('s')!=null)
        {
            if(steps.get('n') == steps.get('s'))
            {
                steps.remove('n');
                steps.remove('s');
            }
        } 
        if(steps.get('e')!=null && steps.get('w')!=null)
        {
            if(steps.get('e') == steps.get('w'))
            {
                steps.remove('e');
                steps.remove('w');
            }
        } 
        return steps.isEmpty();
    }

    public static boolean isValidOption2(char[] walk) {
        // Insert brilliant code here
        if(walk.length!= 10){
            return false;
        }
        int ns = 0;
        int ew = 0;
        for(char c : walk){
            switch(c){
                case 'n' : ns++;break;
                case 's' : ns--;break;
                case 'e' : ew++;break;
                case 'w' : ew--;break;
            } 
        }
        return ns == 0 && ew == 0;
    }

    public static void main(String[] args) {
        char[] exampleTest1 = { 'w','n'}; 
        boolean result = TenMinutesWalk.isValidOption2(exampleTest1);
        System.out.println("result == " + result);//false

        char[] exampleTest2 = { 'w','e','w','e','w','e','w','e','w','e','w','e'}; 
        result = TenMinutesWalk.isValidOption2(exampleTest2);
        System.out.println("result == " + result);//false

        char[] exampleTest3 = { 'n','s','n','s','n','s','n','s','n','s'}; 
        result = TenMinutesWalk.isValidOption2(exampleTest3);
        System.out.println("result == " + result);//true

        char[] exampleTest4 = { 'n','n','n','s','n','s','n','s','n','s'}; 
        result = TenMinutesWalk.isValidOption2(exampleTest4);
        System.out.println("result == " + result);//false
    }

}
