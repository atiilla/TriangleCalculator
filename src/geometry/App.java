package geometry;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		TriangleUtils triangle = new TriangleUtils();

		Scanner in = new Scanner(System.in);
		System.out.print("Side-1: ");
		double side1 = in.nextDouble();
		System.out.print("Side-2: ");
		double side2 = in.nextDouble();
		System.out.print("Side-3: ");
		double side3 = in.nextDouble();
		System.out.println(
				is_Valid(side1, side2, side3)
						? "The area of the triangle is " + triangle.area_triangle(side1, side2, side3) + "\nHypotenuse: "
								+ triangle.getHypotenuse()
						: "Invalid triangle");
	}

	private static boolean is_Valid(double side1, double side2, double side3) {

		if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2)
			return true;
		else
			return false;

	}

}