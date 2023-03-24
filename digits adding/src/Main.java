import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number,digit,total =0;
        System.out.print("Please enter a number: ");
        number = scanner.nextInt();
        int tempNumber = number;
        while (tempNumber != 0){
            digit = tempNumber % 10;
            total += digit;
            tempNumber /= 10;
        }
        System.out.println(number+" sum of digits of the number: "+total);
    }
}
