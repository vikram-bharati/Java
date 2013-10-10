package first;

public class SnakeGame {
	

	public static void main(String[] args) {
		Zen.create(600,600);
		Snake dude = new Snake();
		Food f = new Food();
		
		
		while (true) {
			drawBackground();
			dude.draw();
			dude.move();
			dude.checkKeys();
			f.draw();
			
			
			int rise = dude.y - f.y;
			int run = dude.x  - f.x;
			if(Math.sqrt(rise*rise + run* run ) < Snake.SIZE*2){
				dude.addsection();
				f = new Food();
				
			}
			Zen.flipBuffer();
			Zen.sleep(100);
		}
	}


	public static void drawBackground() {
		Zen.setColor(0,0,0);
		Zen.fillRect(0, 0, 600,600);
	}
}
