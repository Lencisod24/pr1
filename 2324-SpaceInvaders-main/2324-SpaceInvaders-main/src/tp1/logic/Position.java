package tp1.logic;

/**
 * 
 * Immutable class to encapsulate and manipulate positions in the game board
 * 
 */
public class Position {

	private int col;
	private int row;

	//TODO fill your code



	public Position (int col, int row) {
		this.col=col;
		this.row=row;
	}
	public Position move(Move m) {
	if(this.col+m.getX()<9&&this.col+m.getX()>=0) {
		this.col+=m.getX();
		this.row+=m.getY();
	}
		return(this);
	}
	
	
	//public boolean equals(int col, int row) {
	//	return(this.Position.col=col&& this.Position.row=row)
	//}
	public boolean equals(Position pos) {
		
		return( this.col==pos.col && this.row==pos.row );
	}

}


