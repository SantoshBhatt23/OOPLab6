package ques3;

import java.util.Scanner;

class WashingMachine{
    int state = 0;
    int cntClothes = 0;
    int maxCap = 16;

    void switchOn(){
        if(state==0) {
            state = 1;
            System.out.println("Washing machine turned on!");
        }else{
            System.out.println("Machine already on!");
        }
    }

    void switchOff(){
        if(state==1){
            state = 0;
            System.out.println("Washing machine switched off!");
        }else{
            System.out.println("Washing machine already off!");
        }
    }

    void acceptDet(int n){
        System.out.println(n+ "spoons of Detergent added!");
    }

    int acceptClothes(int n){
        int cap = maxCap - (cntClothes);
        if(cap<n){
            System.out.println("Insufficient space! only "+cap+" more clothes can be added!");
        }
        else {
            cntClothes+=n;
            System.out.println("Clothes added! now number of clothes in machine : "+cntClothes);
        }
        return cntClothes;
    }
}
public class Main {
    public static void main(String[] args) {
        int exit = 0;
        Scanner sc = new Scanner(System.in);
        WashingMachine w = new WashingMachine();
        System.out.println("Welcome to the Washing Machine Program");
        while(exit == 0){
            System.out.println("Washing machine operations Menu: ");
            System.out.println("Press 0 to turn off the machine");
            System.out.println("Enter 1 to turn on the machine!");
            System.out.println("Press 2 to add new clothes");
            System.out.println("Press 3 to add detergent");
            System.out.println("Press 9 to quit the program");
            int choice = sc.nextInt();
            switch(choice){
                case 0:
                    w.switchOff();
                    break;
                case 1:
                    w.switchOn();
                    break;
                case 2:
                    if(w.state == 1) {
                        System.out.println("enter the no of clothes: ");
                        int n = sc.nextInt();
                        int num = w.acceptClothes(n);
                        System.out.println("No of clothes in machine now : "+num);
                    }else{
                        System.out.println("Please turn on the machine first!");
                    }
                    break;
                case 3:
                    if(w.state==1) {
                        System.out.println("enter the no of spoon of det: ");
                        int m = sc.nextInt();
                        w.acceptDet(m);
                    }else{
                        System.out.println("Please turn on the machine first!");
                    }
                    break;
                case 9:
                    System.out.println("Washing machine program quitted!");
                    exit = 1;
                    break;
                default:
                    System.out.println("Invalid choice! pls try again.");
            }
        }
    }
}
