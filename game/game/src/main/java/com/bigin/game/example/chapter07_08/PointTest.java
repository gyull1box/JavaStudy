package com.bigin.game.example.chapter07_08;

class PointTest {
    public static void main(String[] args) {
        Point3D p3 = new Point3D(1, 2, 3);
    }
}
class Point {
    int x,y;

    Point (int x, int y){
        this.x = x;
        this.y = y;
    }

    String getLocation(){
        return "X = " + x + ", Y=" + y;
    }
}

class Point3D extends Point {
    int z;

    Point3D(int x, int y, int z) {
        super(x, y);
         this.x = x;
         this.y = y ;
        /**
         * C:\Users\sohee\workspace\game\game\src\main\java\com\bigin\game\example\PointTest.java:23: error: constructor Point in class Point cannot be applied to given types;
         *     Point3D(int x, int y, int z) {
         *                                  ^
         *   required: int,int
         *   found:    no arguments
         *   reason: actual and formal argument lists differ in length
         */
        this.z = z;
    }

    String getLocation(){
        return "X = " + x + ", Y=" + y + ", Z= " + z;
    }
}
