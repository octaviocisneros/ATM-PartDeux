package com.theironyard.novauc;

public class User {

    String name;
    String option;
    double balance;
    double withdraw;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name, double balance) {                        //Added construct
        this.name = name;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public User() {
    }

    public void chooseName() throws Exception {
        System.out.println("Whats your name? ");
        name = ATM2.scanner.nextLine();
        ATM2.user.setName(name);

        if (ATM2.person.containsKey(name)) {
            System.out.println("Welcome " + name);
            ATM2.user.setBalance(ATM2.person.get(name));
            chooseOption();
        }

        else {
            ATM2.person.put(name, 100.00);
            System.out.println("Welcome " + name + "! Thank you for opening an account with INTERBANK!\nWe've added 100.00 bucks to your account as a sign of gratitude");
            chooseOption();
        }
    }


    public void chooseOption() throws Exception {
        System.out.println("\nWhat would you like to do today? (Type the number please)\n[1] Check my balance\n[2] Withdraw Funds\n[3] Cancel\n[4] Delete my account");
        option = ATM2.scanner.nextLine();

        int option2;
        double option3;

        option2 = Integer.valueOf(option);

        switch (option2) {

            case 1:

                System.out.println("Your balance today is: " + ATM2.person.get(ATM2.user.getName()));
                break;

            case 2:

                System.out.println("How much would you like to withdraw? ");
                option = ATM2.scanner.nextLine();
                option3 = Double.valueOf(option);

                if (option3 > ATM2.person.get(ATM2.user.getName())) {
                    throw new Exception ("Not enough funds available");
                }

                else {
                    System.out.println("Please take your cash: " + option3);
                    balance = (ATM2.person.get(ATM2.user.getName()) - option3);
                    System.out.println("Your new balance is: " + balance);
                    chooseOption();
                    break;
                }

            case 3:

                System.out.println("Thank you, good bye!");
                System.exit(0);

            case 4:

                ATM2.person.remove(ATM2.user.getName());
                System.out.println("YOUR ACCOUNT HAS BEEN DELETED\nWe are sorry to see you go\nGood Bye!");
                System.exit(0);
        }
    }
}














































































































