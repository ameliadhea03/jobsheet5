import java.util.Scanner;
public class Selection1Student03_2 {

    public static void main (String[] args){
        Scanner input03 = new Scanner (System.in);

        System.out.println("Input number: ");
        int nilai = input03.nextInt();

        if (nilai < 75 ){
            System.out.println("Remidial!");
        }
        else if (nilai <=75){
            System.out.println("Not Remidial!");
        }    
    }
}