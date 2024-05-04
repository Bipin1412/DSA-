import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        int balance = 50000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("ATM");
            System.out.println("1:withdraw");
            System.out.println("2:deposit");
            System.out.println("3:check balance");
            System.out.println("4:exit");
            System.out.println("choose the operation you want to perform");

            int choice= sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("enter the amount of money to withdraw:");
                    withdraw=sc.nextInt();
                    if(balance>=withdraw){
                        balance=balance-withdraw;
                        System.out.println("collect your money:");

                    }
                    else {
                        System.out.println("insufficient balance");
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Enter the amount of money to deposit:");
                    deposit= sc.nextInt();
                    balance=balance+deposit;
                    System.out.println("your money have been successfully deposit");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println(balance + "Balance");
                    System.out.println("");
                    break;

                case 4:
                        System.exit(0);
                default:
                    System.out.println("invalid choice");

            }
        }
    }
}
