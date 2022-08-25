public class Test {
    
    public static void main (String[] args){
        int x = 5;
        int s = 3;
        System.out.println("The Binomial coefficient of the values " + x + " and " + s + " is: " + binomcoeff(x,s));
        //System.out.println("The Binomial coefficient of the values 5 and 3 is: " + binomcoeff(5, 0));
        //System.out.println("The Binomial coefficient of the values 5 and 3 is: " + binomcoeff(5, 3));
    }

    public static int binomcoeff (int x, int s){
        int resBinomcoeff = 0;
        if ((0 <= s) && (x < s)){
            System.out.println("0 <= " + x + " < " + s);
            resBinomcoeff = 0;
        } else if ((s == 0) || (x == s)){
            resBinomcoeff = 1;
        } else {
            System.out.println("Binomial!");
        }

        return resBinomcoeff;
    }
}
