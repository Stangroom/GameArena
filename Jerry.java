public class Jerry extends Rectangle{
	
	private double speed = 5;
	int gameWidth, gameHeight;
	
	public Jerry(int gameWidth, int gameHeight, String colour){
		super(gameHeight/2,gameWidth/2, 10, 10 ,colour);
		this.gameWidth = gameWidth;
		this.gameHeight = gameHeight;
	}
	
	public void move(GameArena game){//takes the press values from game and moves jerry by his speed
		if(game.upPressed()){
			this.setYPosition(this.getYPosition()-speed);
			if(this.getYPosition() < 0)
				this.setYPosition(0);
		}
		if(game.downPressed()){
			this.setYPosition(this.getYPosition()+speed);
			if(this.getYPosition() > gameHeight)
				this.setYPosition(gameHeight);
		}
		if(game.leftPressed()){
			this.setXPosition(this.getXPosition()-speed);
			if(this.getXPosition() < 0)
				this.setXPosition(0);
		}
		if(game.rightPressed()){
			this.setXPosition(this.getXPosition()+speed);
			if(this.getXPosition() > gameWidth)
				this.setXPosition(gameWidth);
		}
	}
	
}