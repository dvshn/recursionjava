package recursionjava;

/**
 *
 * @author deeso
 */
public class Recursion 
{
    public static void main(String[] args) {
        int n = 7;
        
        System.out.println(n + " factorial equals ");
        System.out.println(Recursion.factorial(n));
        System.out.println();
    }

    public static int factorial(int n) 
    {
     
        System.out.println("Method call -- calculating Factorial of: " + n); 
  
            int temp;
            if (n == 0) 
            {
                return 1;
            }
            else 
            {
            temp = factorial(n - 1);
            System.out.println("Factorial of: " + (n - 1) + " is " + temp);
            return (temp * n);
            }
}
}