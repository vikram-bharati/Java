package first;

public class Snake {
	public static final int SIZE = 15;
	int x;
	int y;
	int direction;
	SnakeSection tail;
	public void move() {
		if (direction == 0) {
			x = x+SIZE;
		}
		if (direction == 3) {
			x = x-SIZE;
		}
		if (direction == 7) {
			y = y-SIZE;
			
		}
		if (direction == 8) {
			y = y+SIZE;
		}
		if (tail!= null) {
			tail.move();
		}
			}
	
	
	public void checkKeys() {
		if ( Zen.isKeyPressed('w') ) 
		{
			direction = 7;
		}
		if (Zen.isKeyPressed('a')  ) 
		{
			direction = 3;
		}
			
	    if (Zen.isKeyPressed('s')  ) 
	    {
	    	direction = 8 ;
	    }
	   
	    if (Zen.isKeyPressed('d')  ) 
	    {
	    	direction = 0;
	    }
	 }
					
	
	
	
	
	
	public void draw() {
		Zen.setColor(0, 0, 255);
		Zen.fillRect(x-SIZE/2,y-SIZE/2,SIZE,SIZE);
		if(tail!= null) {
			tail.draw();
		
		}
		
		

	}


	public void addsection() {
		if(tail==null)      {
			tail = new SnakeSection();
			tail.set(x, y, direction);
			
		}
	}
}
