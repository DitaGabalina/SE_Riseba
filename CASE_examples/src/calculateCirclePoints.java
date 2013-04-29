import java.awt.Point;


public class calculateCirclePoints {

	
	
	public static void main(String[] args) {
		int points = 8;
		Point center = new Point(240,320);
		int radius = 120;
	
		
		double slice = 2 * Math.PI / points;
	    for (int i = 1; i < points; i++)
	    {
	        double angle = slice * i;
	        int newX = (int)(center.x + radius * Math.cos(angle));
	        int newY = (int)(center.y + radius * Math.sin(angle));
	        Point p = new Point(newX, newY);
		
		System.out.println(p);
	}

	}
}
