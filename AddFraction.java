public class AddFraction {
    public static int[] addFractions( int[] fraction1, int[] fraction2){
       int[] result = { (fraction1[0]*fraction2[1])+(fraction1[1]*fraction2[0]), fraction1[1]*fraction2[1]};
       System.out.println("Resulting Fraction : " + result[0] + "," +result[1]);
        return result;
    }

    public static void main(String[] args) { 
        int[] fraction1 = { 2, 3}; 
        int[] fraction2 = { 1, 2}; 
        addFractions(fraction1,fraction2);
    }
}
