public class TestDriver{
	
	static int gameWidth = 500, gameHeight = 500;
	static boolean running = true;
	
	public static void main(String[] args){
		GameArena game = new GameArena(gameWidth, gameHeight);
		Jerry jerry = new Jerry(gameWidth, gameHeight, "GREEN");
		game.addRectangle(jerry);
		Ball[] ballArray = new Ball[10000];
		int ballCounter = 0;
		int ballAdder = 0;
		double initalTime = System.currentTimeMillis();
		
		while(running){
			game.pause();
			game.score(Double.toString(System.currentTimeMillis() - initalTime));
			if(ballAdder == 200){
				ballArray[ballCounter] = new Ball(gameWidth, gameWidth, 25, "RED");
				game.addBall(ballArray[ballCounter]);
				ballCounter++;
				ballAdder = 0;
			}else{
				ballAdder++;
			}
			jerry.move(game);
			for(int i = 0; i<ballCounter; i++){
				ballArray[i].move();
				/*if(does jerry intersect with(ballArray[i])){ warning this method doesnt exist but should go here
					running = false;
				}*/
			}
			if (collision(jerry, ballArray, ballCounter))
			{
				running = false;
			}
		}
		System.out.println("Final Score:" + Double.toString(System.currentTimeMillis() - initalTime));
		System.out.println("Game Over");
		game.exit();
	}
	
	public static boolean collision(Jerry jerry, Ball[] ballArray, int ballCounter)
	{
			double jerryX = jerry.getXPosition();
			double jerryY = jerry.getYPosition();
			double ballX, ballY, ballMinX, ballMinY, ballMaxX, ballMaxY;
			double jerryMinX = jerryX - 5.0;
			double jerryMinY = jerryY - 5.0;
			double jerryMaxX = jerryX + 5.0;
			double jerryMaxY = jerryY + 5.0;
			
			
			
			for(int i = 0; i<ballCounter; i++){
				ballX = ballArray[i].getXPosition();
				ballY = ballArray[i].getYPosition();
				
				ballMinX = ballX - 12.5;
				ballMinY = ballY - 12.5;
				ballMaxX = ballX + 12.5;
				ballMaxY = ballY + 12.5;
				
				
				if (jerryMaxX >= ballMinX && jerryMinX <= ballMaxX){
					if (jerryMaxY >= ballMinY && jerryMinY <= ballMaxY){
						return true;
					}
				}
			}
			return false;
	}
}