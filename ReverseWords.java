public class ReverseWords {
  public static String reverseWords(final String original)
  {
    if(original.trim().isEmpty()){
        return original;
    }
    String[] str = original.split(" ");
    for(int i = 0;i<str.length;i++){
        StringBuilder s1 = new StringBuilder(str[i]);
        str[i] = s1.reverse().toString();
    }
    return String.join(" ",str);
  }

  public static void main(String[] args) {
    System.out.println("ehT kciuq nworb xof spmuj revo eht yzal .god === "
            + reverseWords("The quick brown fox jumps over the lazy dog."));
    System.out.println("    === "
            + reverseWords("   ").length());
    }
}
