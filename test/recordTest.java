package test;

public class recordTest{
    public static void main(String[] args) {
//        Point p = new Point(66, 88);
//        System.out.println(p.x());
//        System.out.println(p.y());
//        System.out.println(p);

        Point z = Point.of();
        Point pp = Point.of(22,33);
        System.out.println(z.x());
        System.out.println(z.y());
        System.out.println(pp.x());
        System.out.println(pp.y());
    }

    public record Point(int x , int y){

          public static Point of(){
              return new Point(0, 0);
          }

          public static Point of(int x , int y){
              return new Point(x, y);
          }
    };

}
