package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String args[])
    {
        System.out.print("Tower of Hanoi Game." +
                "\nThis puzzle will solve this puzzle for you." +
                "\nEnter number of discs: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Instructions:");
        TowersOfHanoi h = new TowersOfHanoi(n, 'A', 'B', 'C');
    }
}

