import java.util.Scanner;
public class OverloadShapeArea
 { void calculateArea(float x) {
System.out.println("Area of the square:_"+x*x+"sq_units");
}
void calculateArea(float x,float y) {
System.out.println("Area of the rectangle:_"+x*y+"sq_units");

}
void calculateArea(double r) { 
double area=3.14*r*r;
System.out.println("Area of the circle:_"+area+"sq_units");
}

public static void main(String args[])
 { OverloadShapeArea obj=new OverloadShapeArea(); 
System.out.println("Enter the side of a square:_");
 Scanner sc=new Scanner(System.in);
 
float side=sc.nextFloat(); 
obj.calculateArea(side);
System.out.println("Enter the sides of the rectangle:_");
//Scanner sc1=new Scanner(System.in);
 float side1=sc.nextFloat();
float side2=sc.nextFloat(); 
obj.calculateArea(side1,side2);
 System.out.println("Enter the radius of the circle:_");
//Scanner sc=new Scanner(System.in);
 double rad=sc.nextDouble(); 
obj.calculateArea(rad);
}
}

