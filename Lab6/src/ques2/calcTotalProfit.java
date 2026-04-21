package ques2;

import java.util.Scanner;

public class calcTotalProfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of attendees: ");
        int n = sc.nextInt();
        double cost = 20 + 0.5*n;
        double revenue = 5.0*n;
        double profit = revenue-cost;
        System.out.println("The total profit earned by the show is: "+profit);
    }
}
