package com.company;

public class TowersOfHanoi {

    static void solve(int n, char fTower, char aTower, char tTower )
    {
        if (n == 1)
        {
            System.out.println("Move disk 1 from tower " +  fTower + " to tower " + tTower);
        }
        else
        {
            solve(n - 1, fTower, tTower, aTower);
            System.out.println("Move disk " + n + " from tower " + fTower + " to tower " + tTower);
            solve(n - 1, aTower, fTower, tTower);
        }
    }

}
