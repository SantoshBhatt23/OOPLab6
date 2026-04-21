package ques1;
class A{
    int x = 50;
    A(){
        System.out.println("A class constructor.");
    }
    A(int x){
        System.out.println("A class parameterized constructor with parameter: "+x);
    }
}
class B extends A{
    int y = 10;
    B(){
        super(5); //calling super class parameterized constructor
        System.out.println("B class constructor.");
        System.out.println("Member of super class int x = "+ super.x);
        System.out.println("Member of this class int y = "+this.y);
    }
}
public class ThisSuperDemo {
    public static void main(String[] args) {
        B object = new B();
    }
}
