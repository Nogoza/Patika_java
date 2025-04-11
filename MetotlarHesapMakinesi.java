import java.util.Scanner;

public class MetotlarHesapMakinesi {

    static int sum(int a, int b){
        int result = a + b;
        System.out.println("Result: " + result);
        return result;
    }

    static int extraction(int a, int b){
        int result = a - b;
        System.out.println("Result: " + result);
        return result;
    }

    static int multiplication(int a, int b){
        int result = a * b;
        System.out.println("Result: " + result);
        return result;
    }
    static int division(int a, int b){
        int result = a / b;
        System.out.println("Result: " + result);
        return result;
    }

    static int exponentiation(int a, int b){
        double result = Math.pow(a, b);
        System.out.println("Result: " + result);
        return (int) result;
    }

    static int mod(int a, int b){
        int result = a % b;
        System.out.println("Result: " + result);
        return result;
    }
    static int rectangular(int a, int b){
        int area = a * b;
        int perimeter = 2 * (a + b);
        System.out.println("Area: " + area + "\nPerimeter: " + perimeter);
        return area;
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int select;

        String menu = """
                 1 - Toplama işlemi
                 2 - Çıkarma işlemi
                 3 - Çarpma
                 4 - Bölme
                 5 - Üs Alma
                 6 - Mod Alma
                 7 - Dikdörgen Alan ve Çevre Hesaplama
                 0 - Çıkış Yap""";

        while(true){
            System.out.println(menu);
            System.out.print("Bir işlem seçiniz: ");
            select = input.nextInt();

            if(select <= 0 || select > 7 ){
                break;
            }

            System.out.print("Birinci Sayıyı Giriniz:");
            int a = input.nextInt();

            System.out.print("İkinci Sayıyı Giriniz:");
            int b = input.nextInt();

            switch (select){
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    extraction(a, b);
                    break;
                case 3:
                    multiplication(a, b);
                    break;
                case 4:
                    division(a, b);
                    break;
                case 5:
                    exponentiation(a, b);
                    break;
                case 6:
                    mod(a, b);
                    break;
                case 7:
                    rectangular(a , b);
                default:
            }
        }
        int x = rectangular(5, 3);
        System.out.println(x);
    }
}