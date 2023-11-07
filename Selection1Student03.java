import java.util.Scanner;

/**
 * Selection1Student03
 */
public class Selection1Student03 {

    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        System.out.print("Input Number: ");
        int number = input05.nextInt();

        if (number%2 == 0)
        System.out.println(number+" is an even number!");
        else
        System.out.println(number+" is an odd number!");
    
    }
}