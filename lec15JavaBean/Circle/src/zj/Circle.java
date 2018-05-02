package zj;

import java.io.Serializable;

public class Circle implements Serializable {
int radius;

public int getRadius() {
	return radius;
}

public void setRadius(int radius) {
	this.radius = radius;
}
public double getCirclePerimeter(){
	return Math.PI*radius*2;
}
public double getCircleArea(){
	return Math.PI*radius*radius;
}
public static void main(String[] args) {
	Circle circle=new Circle();
	circle.setRadius(10);
	System.out.println(circle.getRadius());
	System.out.println(circle.getCirclePerimeter());
}
}
