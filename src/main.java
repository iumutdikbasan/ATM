import java.util.Scanner;

public class main {
    public static void main(String[] args){
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 10000;
        int select ;
        int price;
        while (right > 0) {
            System.out.print("Enter Username : ");
            userName = input.nextLine();
            System.out.print("Enter password : ");
            password = input.nextLine();

            if(userName.equals("umut") && password.equals("dev123")){
                System.out.println("Welcome to Umut Bank. ");
                do {
                    System.out.println("please select action you want to do");
                    System.out.println("1-Deposit to money\n"+"2-Withdraw money\n"+"3-Check account\n"+
                            "4-Exit");
                     select =input.nextInt();
                     switch (select){
                         case 1 :
                             System.out.println("Amount of money: ");
                             price = input.nextInt();
                             balance += price;
                             break;
                         case 2 :
                             System.out.println("Amount of money: ");
                             price = input.nextInt();
                             if(price > balance){
                                 System.out.println("Insufficient balance. ");
                             }else{
                                 balance -= price;
                             }
                             break;
                         case 3 :
                             System.out.println("Amount of money : " + balance );
                             break;
                     }
                }while(select !=4);
                System.out.println("See you. ");
                break;
            }
            else{
                right--;
                System.out.println("Wrong username or password. Try again. ");
                if(right==0){
                    System.out.println("Your access denied");
                }else{
                    System.out.println("Kalan Hakkiniz : " + right);
                }
            }
        }

    }
}
