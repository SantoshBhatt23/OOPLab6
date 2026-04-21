package ques6;

public class Main {
   //Method to calculate distance between two points:
    public static double calcDist(SpacePoint p1, SpacePoint p2){
        return Math.sqrt(Math.pow(p1.x-p2.x,2)+Math.pow(p1.y-p2.y,2)+Math.pow(p1.z-p2.z,2));
    }
    //Main method:
    public static void main(String[] args) {
        SpacePoint p1 = new SpacePoint();
        SpacePoint p2 = new SpacePoint();
        p1.setCoordinates(5,10,15);
        System.out.println("Point p1: "+p1.getCoordinates());
        p2.setCoordinates(10,20,30);
        System.out.println("Point p2: "+p2.getCoordinates());
        System.out.println("Distance between p1 and p2: "+Main.calcDist(p1,p2));
    }
}
