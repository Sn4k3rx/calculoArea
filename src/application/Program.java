package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		List<Shape> formas = new ArrayList<>();
		
		System.out.print("Enter the numbers of shape: ");
		int num = in.nextInt();
		
		for (int i = 1; i <= num; i++) {
			System.out.println("Shape #" + i + " data: ");
			System.out.print("Rectangle ou Circle (r/c)");
			char c = in.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(in.next());
			if (c == 'r') {
				System.out.print("WIDTH: ");
				double width = in.nextDouble();
				System.out.print("HEIGHT: ");
				double height = in.nextDouble();
				formas.add(new Rectangle(color, width, height));
			}else {
				System.out.print("RADIUS: ");
				double radius = in.nextDouble();
				formas.add(new Circle(color, radius));
			}
		}
		
		System.out.println("Shape Areas: ");
		for (Shape c : formas) {
			System.out.println(String.format("%.2f" , c.Area()));
		}
		
		
		
		
		
		in.close();
	}

}
