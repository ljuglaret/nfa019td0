package tp0.Ex2;

public class Point {
   private double x;
   private double y;
   public Point(double x , double y){
       this.x = x;
       this.y = y;
   } 

   public double distance(Point p2){
       return Math.sqrt(Math.pow(p2.x-x , 2) + Math.pow(p2.y-y, 2));
   }

   public void setX(double x) {
       this.x = x;
   }
   public void setY(double y) {
       this.y = y;
   }
   public double getX() {
       return x;
   }
   public double getY() {
       return y;
   }
}
