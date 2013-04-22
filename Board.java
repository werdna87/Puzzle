import java.awt.Point;

public class Board{

	public boolean doesFit(Piece p, Point location){
		return false;
	}

	public Piece getPiece(Point p){
		return board[(int) p.getX()][(int) p.getY()];
	}

	public boolean isValid(Point p){
		if(p.getX()<=0||p.getY()<=0||p.getX()>=xDim||p.getY()>=yDim){
			return false;
		}
		else return true;
	}

	public boolean isOccupied(Point p){
		if(getPiece(p)==null){
			return false;
		}
		else return true;
	}

	public boolean setPiece(Piece p, Point location){
		return false;
	}

	public Board(){
		new Board(3,3);
	}

	public Board(int xDim, int yDim){
		this.xDim=xDim;
		this.yDim=yDim;
		board = new Piece[xDim][yDim];
	}

	public static final Piece[] PIECES = {  new Piece(Piece.CLUB_OUT, Piece.DIAMOND_IN, Piece.CLUB_IN, Piece.HEART_OUT),
		new Piece(Piece.SPADE_OUT, Piece.SPADE_IN, Piece.HEART_IN, Piece.DIAMOND_OUT),
		new Piece(Piece.HEART_OUT, Piece.SPADE_IN, Piece.CLUB_IN, Piece.SPADE_OUT),
		new Piece(Piece.HEART_OUT, Piece.CLUB_IN, Piece.CLUB_IN, Piece.DIAMOND_OUT),
		new Piece(Piece.SPADE_OUT, Piece.HEART_IN, Piece.CLUB_IN, Piece.SPADE_OUT),
		new Piece(Piece.HEART_OUT, Piece.DIAMOND_IN, Piece.HEART_IN, Piece.DIAMOND_OUT),
		new Piece(Piece.SPADE_OUT, Piece.HEART_IN, Piece.DIAMOND_IN, Piece.DIAMOND_OUT),
		new Piece(Piece.CLUB_OUT, Piece.SPADE_IN, Piece.HEART_IN, Piece.HEART_OUT),
		new Piece(Piece.CLUB_OUT, Piece.DIAMOND_IN, Piece.DIAMOND_OUT, Piece.CLUB_IN)};
	private Piece[][] board = new Piece[0][0];
	private int xDim;
	private int yDim;
}
