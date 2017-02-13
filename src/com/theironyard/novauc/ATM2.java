package com.theironyard.novauc;

import java.util.HashMap;
import java.util.Scanner;

public class ATM2 {

    public static Scanner scanner = new Scanner(System.in);
    public static User user = new User();
    public static HashMap<String, Double> person = new  HashMap<>();

    public static void main(String[] args) throws Exception {

        person.put("Archimedes", 100.00);
        person.put("Beethoven", 200.00);
        person.put("Churchill", 300.00);
        person.put("DaVinci", 400.00);
        person.put("Einstein", 500.00);

        System.out.println("WELCOME TO INTERBANK");

        user.chooseName();
        user.chooseOption();

    }
}
