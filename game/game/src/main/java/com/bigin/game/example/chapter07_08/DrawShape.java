package com.bigin.game.example.chapter07_08;

class DrawShape {

    public static void main(String[] args) {
        Point[] p = {new Point(100, 100),
                new Point(140, 50),
                new Point(200, 100)};
        Point.Triasngle t = new Point.Triasngle(p);
        Point.Circle c = new Point.Circle(new Point(150,150), 50);

        t.draw(); // p1= (X: 100Y: 100) p2 = (X: 140Y: 50) p3 = (X: 200Y: 100) co =  black
        c.draw(); // center= 50 Co = black center = 150, 150
    }


    static class Shape{
        String color = "black";
        void draw(){
            System.out.println("co : " +  color);
        }
    }

    static class Point{
        int x;
        int y ;

        Point(int x, int y){
            this.x = x;
            this.y = y;
        }

        Point(){this(0,0);}

        String getXY(){
            return "(X: " + x + "Y: " + y + ")";
        }

        static class Circle extends Shape{
            Point center;
            int r;

            Circle(Point center, int r){
                this.center = center;
                this.r = r;
            }

            Circle(){
                this(new Point(0, 0), 100);
            }

            void draw(){
                System.out.println("center= " + r + " Co = " + color + " center = " + center.x + ", " + center.y);
            }
        }

        static class Triasngle extends Shape{
            Point[] p = new Point[3];

            Triasngle(Point[] p){
                this.p = p;
            }

            void draw(){
                System.out.println("p1= " + p[0].getXY() + " p2 = " + p[1].getXY() + " p3 = " + p[2].getXY() + " co =  " + color);
            }
        }

    }
}
