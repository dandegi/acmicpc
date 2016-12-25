
class Point {
	int xPos, yPos;

	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}

	public void showPointInfo() {
		System.out.println("[" + xPos + "," + yPos + "]");
	}
}

class Circle {
	Point origin;
	int radius;

	public Circle(int x, int y, int r) {
		origin = new Point(x, y);
		radius = r;
	}

	public void showCircleInfo() {
		System.out.println("반지름은 " + radius);
		origin.showPointInfo();
	}
}

class Ring {
	Circle circle1;
	Circle circle2;

	public Ring(int x, int y, int r, int x2, int y2, int r2) {
		Circle cir1 = new Circle(x, y, r);
		Circle cir2 = new Circle(x2, y2, r2);
		circle1 = cir1;
		circle2 = cir2;
	}

	public void showRingInfo() {
		System.out.println("Inner Circle Info...");
		circle1.showCircleInfo();
		System.out.println("Outter Circle Info...");
		circle2.showCircleInfo();
	}
}

public class Main {
	public static void main(String[] args) {
		Ring ring = new Ring(1, 1, 4, 2, 2, 9);
		ring.showRingInfo();
	}
}