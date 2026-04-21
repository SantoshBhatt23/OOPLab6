package ques6;

public class SpacePoint {
    int x;
    int y;
    int z;

    SpacePoint(){
        x = 0;
        y = 0;
        z = 0;
    }

    void setCoordinates(int x,int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    String getCoordinates(){
        return "("+x+","+y+","+z+")" ;
    }

}
