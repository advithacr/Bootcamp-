import java.util.Scanner;
public class PrimeNumbers{
public static void main (String[] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the number of the array: ");
    int n = sc.nextInt();
    int[] a = new int[n];

    System.out.println("Enter the elements of the array: ");
    for(int i=0; i<n; i++)
    {
        a[i] = sc.nextInt();
    }

    for(int i=0; i<a.length; i++){
        boolean isPrime = true;
        
        for (int j=2; j<a[i]; j++){
            
            if(a[i]%j==0){
                isPrime = false;
                break;
            }
        }
    
        if(isPrime)

            System.out.println(a[i] + " are the prime numbers in the array ");
    }
}
}