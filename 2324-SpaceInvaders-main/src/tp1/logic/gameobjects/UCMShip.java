package tp1.logic.gameobjects;

import tp1.logic.Game;
import tp1.logic.Move;
import tp1.logic.Position;
import tp1.view.Messages;

public class UCMShip {
	
	 
	private int numvidas;
	private int points;
	private Position Position;	//public¿?
	private Game game;
	private boolean shockwave;
	private static final int resistencia = 3;
	private static final int danyo = 1;
	
	public UCMShip(Game game) {
		this.Position= new Position(4,7);
		this.numvidas= 3;
		this.points=0;
		this.shockwave=false;
	
	}
	/*public Position nuevaPos(int i, int j) {
		return this.Position.nuevaPos(i, j);
	}*/
	public boolean isAlive() {
		return(this.numvidas>0);
	}
	public String stateToString() {
		StringBuilder buffer = new StringBuilder();
		/* @formatter:off */
		String s;
		if(this.shockwave)s="ON";
		else s="OFF";
		buffer
		.append("Life: ").append(this.numvidas).append("\nPoints: ").append(this.points)
		.append("\nShockwave: ").append(s).append('\n');
		
		return buffer.toString();
	
	}
	public String getSymbol() {
		String s;
		if(isAlive())s=Messages.UCMSHIP_SYMBOL;
		else s=Messages.UCMSHIP_DEAD_SYMBOL;
		
		return s;
		
	}
	public String toString() {
		return getSymbol();
	}
	public String toString(Position Pos) {
		String s;
		if( this.Position.equals(Pos))s=this.toString();
		else s="";
		return s;//si es asi devuelve toString si no ""
	}
	public String getDescription() {
		return Messages.UCMSHIP_DESCRIPTION;
	}
	
	
	
	protected String getInfo() {
		StringBuilder buffer = new StringBuilder();
		/* @formatter:off */
		buffer
		.append(this.getDescription()).append(":  Harm: ").append(this.danyo).append("- Shield: ")
		.append(this.numvidas).append('\n');
		
		return buffer.toString();
	}
	
	public Position nuevaPos(Move m) {
		return(this.Position.nuevaPos(m));
	}
	
	
	
}
