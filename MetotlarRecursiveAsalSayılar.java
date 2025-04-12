import java.util.Scanner;

public class MetotlarRecursiveAsalSayılar {

    public static boolean isPrime(int number, int a){
        if(a == number){
            return true;
        }
        if (number % a == 0) {
            return false;
        }
        return isPrime(number, a + 1);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("Enter The Number: ");
            int number = input.nextInt();

            if (number > 1 && isPrime(number, 2)) {
                System.out.println(number + " is a prime number.");
            }
            else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }
}
