import java.util.Scanner;

public class MetotlarRecursiveÇıkarma {

    public static void Recurive(int number){

        System.out.println(number + " ");

        if (number <= 0) {
            return;
        }
        Recurive(number - 5);
        System.out.println(number + " ");
    }




    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        Recurive(number);
    }
}
