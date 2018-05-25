import java.util.InputMismatchException;
import java.util.Scanner;

public class TUI {
    public static void main(String[] args) {
        Bank UICBank = new Bank("UIC Bank");
        while(true){
            int selected_function = readPosInt("Type an action (total:1 add:2 list:3 withdraw:4 deposit:5 quit:6): ");
            switch (selected_function){
                case 1:
                    // total function
                    System.out.println("Total amount of money in the bank: " + UICBank.totalMoney());
                    break;
                case 2:
                    // add function
                    int selected_account_type = readPosInt("Type the account type (credit:1 student:2):");
                    switch (selected_account_type){
                        case 1:
                            String input_name_c = readLine("Enter the name of the customer: ");
                            int input_money_c = readPosInt("Enter the initial amount of money: ");
                            CreditAccount CA1 = new CreditAccount(input_name_c, input_money_c);
                            UICBank.addAccount(CA1);
                            System.out.println("Credit account for " + input_name_c + " with " + input_money_c + " yuan has been added");
                            break;
                        case 2:
                            String input_name_s = readLine("Enter the name of the customer: ");
                            int input_money_s = readPosInt("Enter the initial amount of money: ");
                            try{
                                StudentAccount SA1 = new StudentAccount(input_name_s, input_money_s);
                                UICBank.addAccount(SA1);
                                System.out.println("Student account for " + input_name_s + " with " + input_money_s + " yuan has been added");
                            }catch (NotEnoughMoneyException e){
                                System.out.println("BUG! This must never happen!");
                                System.exit(1);
                            }
                            break;
                        default:
                            System.out.println("Unknown type of account!");
                    }
                    break;
                case 3:
                    // list function
                    String list_name = readLine("Enter the name the customer: ");
                    try{
                        System.out.println(list_name + " has " + UICBank.getMoney(list_name) + " yuan in the bank");
                    }catch (UnknownCustomerException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    // withdraw function
                    String withdraw_name = readLine("Enter the name the customer:");
                    int withdraw_money = readPosInt("Enter the amount of money to withdraw: ");
                    try{
                        UICBank.withdraw(withdraw_name, withdraw_money);
                    }catch (UnknownCustomerException e){
                        System.out.println(e.getMessage());
                    }catch (NotEnoughMoneyException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    // deposit function
                    String deposit_name = readLine("Enter the name the customer:");
                    int deposit_money = readPosInt("Enter the amount of money to deposit: ");
                    try {
                        UICBank.withdraw(deposit_name, -deposit_money); // deposit by withdraw a negative money
                    }catch (UnknownCustomerException e){
                        System.out.println(e.getMessage());
                    }catch (NotEnoughMoneyException e){
                        System.out.println("BUG! This must never happen!"); // deposit only increase money
                        System.exit(1);
                    }
                    break;
                case 6:
                    // quit function
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Unknown action!");
            }
        }
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
