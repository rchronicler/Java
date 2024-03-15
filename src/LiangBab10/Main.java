package LiangBab10;

// Program to run Triangle2D and MyString1 (10.12 & 10.22)
public class Main {
    public static void main(String[] args) {
        // Triangle2D (10.12)
        Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), new MyPoint(5, 3.5));
        System.out.println("Area = " + t1.getArea());
        System.out.println("Perimeter = " + t1.getPerimeter());

        System.out.println("Result of t1.contains(3,3) = " + t1.contains(new MyPoint(3, 3)));

        System.out.println("Result of t1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), MyPoint(1, 3" +
                ".4))) = " + t1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4))));

        System.out.println("Result of t1.overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3), MyPoint(2, " +
                "6.5))) = "
                + t1.overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3), new MyPoint(2, 6.5))));

        System.out.println("---------------------------------------------------------");
                
        // MyString1 (10.22)
        MyString1 s1 = new MyString1("DIMAS".toCharArray());
        MyString1 s2 = new MyString1("AKMAL".toCharArray());
        MyString1 s3 = new MyString1("DIMAS".toCharArray());

        System.out.println("s1 == s2 = " + s1.equals(s2));
        System.out.println("s1 == s3 = " + s1.equals(s3));
        System.out.println("s1.charAt(0) = " + s1.charAt(0));
        System.out.println("s1.length() = " + s1.length());
        System.out.println("s1.substring(1, 4) = " + s1.substring(0, 2));
        System.out.println("s1.toLowerCase() = " + s1.toLowerCase());

        
    }
}
