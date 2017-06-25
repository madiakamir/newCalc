package newCalc;
import javax.crypto.ExemptionMechanismException;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try{
            System.out.print("Введите превое число ");
            int number1 = reader.nextInt();
            System.out.print("Введите второе число ");
            int number2 = reader.nextInt();

            System.out.print(number1 + number2);

        }catch (java.util.InputMismatchException  e){
            System.out.print("Вы вели не число " + e);
        }

    }
}
