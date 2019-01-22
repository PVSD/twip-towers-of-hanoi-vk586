package com.company;

public class TowersOfHanoi {

    static int count = 1;

    public TowersOfHanoi(int n, char f, char a, char t)
    {
        solve(n, f, a, t);
    }

    static void solve(int n, char fTower, char aTower, char tTower )
    {
        if (n == 1)
        {
            System.out.println("Move disk 1 from tower " +  fTower + " to tower " + tTower);
            count++;
        }
        else
        {
            count++;
            solve(n - 1, fTower, tTower, aTower);
            System.out.println("Move disk " + n + " from tower " + fTower + " to tower " + tTower);
            solve(n - 1, aTower, fTower, tTower);
        }
    }

}
