package first;

public class Food {
	int x;
	int y;
	
	public Food() {
		x= (int) (Math.random() * 600);
	    y=(int) (Math.random() * 600);
	}
	
	public void draw() {
		Zen.fillOval(x, y, 10, 11);
	}

}
