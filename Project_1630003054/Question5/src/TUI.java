import java.util.InputMismatchException;
import java.util.Scanner;

public class TUI {
    public static void main(String[] args) {
        String str1 = readLine("Type some text: ");
        System.out.println("Text read is: " + str1);
        int i = readPosInt("Type an integer: ");
        System.out.println("Integer read is: " + i);
        String str2 = readLine("Type some text again: ");
        System.out.println("Text read is: " + str2);
    }


    private static String readLine(String str){
        System.out.print(str);
        Scanner scanner1 = new Scanner(System.in);
        String inputText = scanner1.nextLine();
        return inputText;
    }

    private static int readPosInt(String str){
        Scanner scanner1 = new Scanner(System.in);
        int inputInt;
        while(true){
            try {
                System.out.print(str);
                inputInt = scanner1.nextInt();
                scanner1.nextLine(); // read the line break (clean the stream)
            }catch (InputMismatchException e){
                System.out.println("You must type an integer!");
                scanner1.nextLine();
                continue;
            }
            if (inputInt >= 0){
                break;
            }else{
                System.out.println("Positive integers only!");
            }
        }
        return inputInt;
    }
}
