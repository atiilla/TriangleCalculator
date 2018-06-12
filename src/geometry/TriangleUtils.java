package geometry;

public class TriangleUtils {
	private double side1;
	private double side2;
	private double side3;
	private double hypotenuse;

	public TriangleUtils() {

	}

	public TriangleUtils(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side2 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	public double area_triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side2 = side3;
		double area = 0;
		double s = (side1 + side2 + side3) / 2;
		area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}

	public double getHypotenuse() {
		this.side1 = side1;
		this.side2 = side2;
		return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
	}

}
