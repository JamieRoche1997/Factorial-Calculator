/**
 * This class calculates factorial via iterative approach and recursive approach
 *
 * @author Jing Hua Ye
 * @date Nov/6/2021
 * @version 1.0
 */
 public class FactorialCalculator
 {
     public static void main(String[] args)
     {   //calculate the factorial of 0 through 10
         for (int counter = 0; counter <= 10; counter++)
            System.out.printf("%d! = %d%n", counter, iterativeFac(counter));
         
         for (int counter = 0; counter <= 10; counter++)
            System.out.printf("%d! = %d%n", counter, recursiveFac(counter));
     }

    /**
     * Iterative calculate factorial
     *
     * @param number the number to be calculated for factorial
     * @return the factorial of number
     */
     private static long iterativeFac(long number)
     {
         long result = 1;
         for (int i = 1; i <= number; i++){
             result *= i;
         }
         return result;
         //to-complete

     }

    /**
     * Recursive calculate factorial
     *
     * @param number the number to be calculated for factorial
     * @return the factorial of number
     */
     private static long recursiveFac(long number)
     {
         if (number == 0) {
             return 1;
         }
         else if(number == 1){
             return 1;
         }
         else {
             return number * recursiveFac(number - 1);
         }
         //to-complete
     }
 }
