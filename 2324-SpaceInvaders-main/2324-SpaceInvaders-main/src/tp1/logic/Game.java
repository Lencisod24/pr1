package tp1.logic;

import java.util.Random;

import tp1.logic.gameobjects.UCMShip;

// TODO implementarlo
public class Game {

	public static final int DIM_X = 9;
	public static final int DIM_Y = 8;
	private UCMShip player;	//public¿?
	//TODO fill your code

	public Game(Level level, long seed) {
		
		player= new UCMShip();
		
	}

	public String stateToString() {
		;
		return this.player.stateToString(); 
	}

	public int getCycle() {
		//TODO fill your code
		return 0;
	}

	public int getRemainingAliens() {
		//TODO fill your code
		return 0;
	}

	public String positionToString(int col, int row) {
		Position pos= new Position(col,row);
		
		return this.player.toString(pos);
	}

	public boolean playerWin() {
		//TODO fill your code
		return false;
	}

	public boolean aliensWin() {
		//TODO fill your code
		return false;
	}

	public void enableLaser() {
		//TODO fill your code		
	}

	public Random getRandom() {
		//TODO fill your code
		return null;
	}

	public Level getLevel() {
		//TODO fill your code
		return null;
	}
	public Position move(Move m) {
		
		return(this.player.move(m));
	}
}
