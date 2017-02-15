public class TestDriver{
	
	static int gameWidth = 500, gameHeight = 500;
	static boolean running = true;
	
	public static void main(String[] args){
		GameArena game = new GameArena(gameWidth, gameHeight);
		Jerry jerry = new Jerry(gameWidth, gameHeight, "GREEN");
		game.addRectangle(jerry);
		Ball[] ballArray = new Ball[10000];
		int ballCounter = 0;
		int ballAdder = 200;

		while(running){
			game.pause();
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
		}
		
		System.out.println("Game Over");
		game.exit();
	}
}