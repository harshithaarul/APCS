
public class Point {
	int x = 0;
	int y= 0;
	public Point (int initialX, int initialY){
		x = initialX;
		y = initialY;
	}

	public Point(){

	}

	public void translate (int dx, int dy){
		x+=dx;
		y+=dy;
	}

	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}

	public void setXY(int setX, int setY){
		x = setX;
		y = setY;
	}

	public double distanceToOrigin() {
		double dist1 = Math.sqrt(x * x + y * y);
		return dist1;
	}

	public int getQuadrant() {
		if ((x >-1)&&(y >-1)){
			return 1;
		} else if((x <=-1)&&(y >-1)){
			return 2;
		} else if ((x <=-1)&&(y <=-1)){
			return 3;
		} else {
			return 4;
		}
	}
	public String toString() {
	return "(" + x + ", " + y + ")";
	}
	public double slope(Point p){
	    double dy = (double)(y - p.y);
        double dx = (double)(x - p.x);
        return dy / dx;

	}
}
