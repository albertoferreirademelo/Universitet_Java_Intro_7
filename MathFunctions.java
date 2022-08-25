public class MathFunctions{

    public static void main (String[] args){
        System.out.println("Testing the signum value 0: " + sgn(0));
        System.out.println("Testing the factorial of 5: " + factorial(5));
        System.out.println("The Binomial coefficient of the values 5 and 3 is: " + binomcoeff(5, 3));
        System.out.println("The Binomial coefficient of the values 5 and 5 is: " + binomcoeff(5, 5));
        System.out.println("The Binomial coefficient of the values 3 and 5 is: " + binomcoeff(3, 5));
    }

    public static int sgn (int value){
        int resSgn = -10;
        if (value < 0){
            resSgn = -1;
        } else if (value == 0){
            resSgn = 0;
        } else if (value > 0){
            resSgn = 1;
        }
        return resSgn;
    }

    public static int factorial (int value){        
        int resFact = 1;

        switch (sgn(value)){
            case -1:
            System.out.println("The value " + value + " must be positive, please insert another value.");
            System.exit(0);

            default:
            for (int i=1; i < (value+1); i++){
                resFact *= i;
            }
            return resFact;
        }
    }

    public static int binomcoeff (int x, int s){
        int resBinomcoeff = 0;
        if ((0 <= s) && (x < s)){
            resBinomcoeff = 0;

        } else if ((s == 0) || (x == s)){
            resBinomcoeff = 1;

        } else {
            resBinomcoeff = factorial(x)/(factorial(s)*factorial(x-s));
        }

        return resBinomcoeff;
    }
}