package first;

public class SnakeSection {
	int x;
	int y;
	int direction;
	
	public void set(int newX, int newY, int newDir) {
		x = newX;
		y = newY;
		direction = newDir;
	}

	public void move() {
	}


	public void draw() {
		Zen.setColor(0,0,255);
		Zen.fillRect(x-Snake.SIZE/2, y- Snake.SIZE/2, Snake.SIZE, Snake.SIZE);



	}
}

	