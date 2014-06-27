package intro2java.chap8;

public class PE8 {
	
	public static void main(String[] args) {
		Fan f1 = new Fan();
		Fan f2 = new Fan();
		f1.setSpeed(3);
		f2.setSpeed(2);
		f1.setRadius(10);
		f2.setRadius(5);
		f1.setOn(true);
		f2.setOn(false);
		f1.setColor("yellow");
		f2.setColor("blue");
		System.out.println(f1);
		System.out.println(f2);
	}
	
}

class Fan {

	public final int SLOW = 1;
	public final int MEDIUM = 2;
	public final int FAST = 3;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	String color = "blue";

	public Fan() {

	}

	public String toString() {
		String description = "\n";
		if (on) {
			switch (speed) {
			case 1: description += "speed is SLOW\n";
			break;
			case 2: description += "speed is MEDIUM\n";
			break;
			case 3: description += "speed is FAST\n";
			break;
			}
		}
		else
			description += "fan is off\n";
		description += ("radius is " + radius);
		description += ("\ncolor is " + color);
		return description;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speedParam) {
		if ((speedParam < 1) || (speedParam > 3)) {
			System.out.println("Invalid fan speed \nMust choose a value between 1 and 3");
		}
		else
			speed = speedParam;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean onParam) {
		on = onParam;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radiusParam) {
		radius = radiusParam;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String colorParam) {
		color = colorParam;
	}

}
