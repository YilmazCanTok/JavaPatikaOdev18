
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("****************************************************");
        System.out.println("Prime Number Project with Recursive Functions");
        System.out.println("----------------------------------------------------");
        System.out.print("Please give the number you wanna check if it is prime or not: ");
        int number = scanner.nextInt();
        int i = number / 2;
        isPrime(number, i);
        
        boolean prime = isPrime(number, i);
        if (prime == true) {
            System.out.println("Your number is a prime number...");
        }
        else{
            System.out.println("Your number is not a prime number...");
        }

    }

    public static boolean isPrime(int number, int i) {
        if (i == 1) {
            return true;
        }
        else if (number % i == 0) {
            return false;
        } else {
            return isPrime(number, i-1);
        }
    }
}
