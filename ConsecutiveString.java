import java.util.Arrays;

public class ConsecutiveString {
    public static boolean solve(String s){
        if(s.length() == 1){
          return true;
        }
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        char[] input = s.toCharArray();
        Arrays.sort(input);
        int position = alphabets.indexOf(input[0]);
        for(char c : input){
          if(position == alphabets.length()){
              return false;
          }
          if(c == alphabets.charAt(position)){
            position++;
            continue;
          }else{
            return false;
          }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(solve("abc"));//true
        System.out.println(solve("abd"));//false
        System.out.println(solve("dabc"));//true
        System.out.println(solve("abbc"));//false
        System.out.println(solve("v"));//true
    }

}
