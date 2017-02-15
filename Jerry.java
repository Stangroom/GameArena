public class Jerry extends Rectangle{
	
	private double speed = 5;
	
	public Jerry(int gameWidth, int gameHeight, String colour){
		super(gameHeight/2,gameWidth/2, 10, 10 ,colour);
	}
	
	public void move(GameArena game){//takes the press values from game and moves jerry by his speed
		if(game.upPressed()){
			this.setYPosition(this.getYPosition()-speed);
		}
		if(game.downPressed()){
			this.setYPosition(this.getYPosition()+speed);
		}
		if(game.leftPressed()){
			this.setXPosition(this.getXPosition()-speed);
		}
		if(game.rightPressed()){
			this.setXPosition(this.getXPosition()+speed);
		}
	}
	
}