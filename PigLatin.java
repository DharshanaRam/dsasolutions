
/*
 * https://www.codewars.com/kata/520b9d2ad5c005041100000f/train/java
 */
public class PigLatin {
    public static String pigIt(String str) {
        String result = "";
        String[] strArray = str.split(" ");
        String pattern = "[a-zA-Z0-9.]*";
        for(String s : strArray)
        {
            if(s.matches(pattern)){
                s.charAt(0);
                result = result.concat(s.substring(1,s.length()).concat(s.substring(0, 1)).concat("ay"));
            }else{
                result = result.concat(s); 
            }
            result = result + " ";
        }
        return result.trim();
    }

    public static void main(String[] args) {
        String result = pigIt("TestString");
        System.out.println("result == " + result);//false

        result = pigIt("This is my string");
        System.out.println("result == " + result);//false

        result = pigIt("Pig latin is cool");
        System.out.println("result == " + result);//true

        result = pigIt("One More !");
        System.out.println("result == " + result);//false
    }
}
