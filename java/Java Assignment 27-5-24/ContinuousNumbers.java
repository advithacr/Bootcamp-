import java.util.Scanner;
public class ContinuousNumbers {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
    
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        boolean result = ThreeContinuousNumbers(a);
        System.out.println(result ? "True" : "False");

        sc.close();
    }
   
    public static boolean ThreeContinuousNumbers(int[] a) {
        for (int i = 0; i < a.length - 2; i++) {
            if (a[i + 1] == a[i] + 1 && a[i + 2] == a[i] + 2) {
                return true;
            }
        }
        return false;
    }
    }