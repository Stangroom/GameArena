import java.util.Random;

/**
 * Models a simple solid sphere. 
 * This class represents a Ball object. When combined with the GameArena class,
 * instances of the Ball class can be displayed on the screen.
 */
 
public class Ball 
{
	// The following instance variables define the
	// information needed to represent a Ball
	// Feel free to more instance variables if you think it will 
	// support your work... 
	
	private double xPosition;			// The X coordinate of this Ball
	private double yPosition;			// The Y coordinate of this Ball
	private double size;				// The diameter of this Ball
	private String colour = "WHITE";	// The colour of this Ball
	private int xMove, yMove;
	

										// Permissable colours are 8 bit hexadecimal 
                                        // RGB values in the format #RRGGBB. e.g.
                                        //
                                        // Pure red is FF0000
                                        // Pure red is 00FF00
                                        // Pure red is 0000FF

	/**
	 * Obtains the current position of this Ball.
	 * @return the X coordinate of this Ball within the GameArena.
	 */
	public double getXPosition()
	{
		return xPosition;
	}

	/**
	 * Obtains the current position of this Ball.
	 * @return the Y coordinate of this Ball within the GameArena.
	 */
	public double getYPosition()
	{
		return yPosition;
	}

	/**
	 * Moves the current position of this Ball to the given co-ordinates
	 * @param x the new x co-ordinate of this Ball
	 */
	public void setXPosition(double x)
	{
		this.xPosition = x;
	}

	/**
	 * Moves the current position of this Ball to the given co-ordinates
	 * @param y the new y co-ordinate of this Ball
	 */
	public void setYPosition(double y)
	{
		this.yPosition = y;
	}

	/**
	 * Obtains the size of this Ball.
	 * @return the diameter of this Ball,in pixels.
	 */
	public double getSize()
	{
		return size;
	}

	/**
	 * Obtains the colour of this Ball.
	 * @return a textual description of the colour of this Ball.
	 */
	public String getColour()
	{
		return colour;
	}
	
	public void move(){
		this.xPosition = xPosition + xMove;
		this.yPosition = yPosition + yMove;
	}

	public Ball(double dimentionX, double dimentionY, double diameter, String col)
	{
		Random rand = new Random();
		int randomNum = rand.nextInt((int)dimentionX + 1);
		xPosition = (double)randomNum;
		
		randomNum = rand.nextInt((int)dimentionY + 1);
		yPosition = (double)randomNum;

		size = diameter;
		colour = col;
		
		randomNum = rand.nextInt((10 - 1) + 1) + 1;
		xMove = randomNum;
		
		randomNum = rand.nextInt((10 - 1) + 1) + 1;
		yMove = randomNum;
	}	
}
