import java.util.Scanner;
public class Selection2Student03 {
    
    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);

        System.out.print("Nilai uas    : ");
        float finalExam = input03.nextFloat();
        System.out.print("Nilai uts    : ");
        float midtermExam = input03.nextFloat();
        System.out.print("Nilai kuis   : ");
        float quiz = input03.nextFloat();
        System.out.print("Nilai tugas  : ");
        float assignment = input03.nextFloat();

        float total = (finalExam * 0.4F) + (midtermExam * 0.3F) + (quiz * 0.1F) + (assignment * 0.2F);
        String message = total < 65 ? "Retake" : "Pass";
        System.out.println("Final Grade = " + total + " and the decission is " + message);

    }
}
