package Recursion;

import java.util.Scanner;

//Given a rope of length N meters,
// and the rope can be cut in only 3 sizes
// A, B and C.
// The task is to maximize the number
// of cuts in rope.
// If it is impossible to make cut then
// print the number else print -1.

public class RopeCuttingProblem {
    static int maxCuts(int n, int a, int b, int c){
        if(n == 0) return 0;
        if(n <= -1) return -1;
        int res = Math.max(maxCuts(n - a, a, b, c), Math.max(maxCuts(n - b, a, b, c), maxCuts(n - c, a, b, c)));
        if(res == -1) return -1;

        return res + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(maxCuts(n, a, b, c));
    }
}
