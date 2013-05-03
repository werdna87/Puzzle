import java.awt.Point;

public class Board{

	public boolean doesFit(Piece p, Point location){
		//		if(getPiece(location) == null){
		//			if(getTop(location)== null||p.getTop()+getTop(location).getBottom()==0)
		//				System.out.println("top works");
		//			if(getRight(location)== null||p.getRight()+getRight(location).getLeft()==0){
		//				System.out.println("Right works");
		//		}
		if(topFits(p,location) && rightFits(p,location) && bottomFits(p,location) && leftFits(p,location)){
			return true;
		}
		else return false;
	}

	public Piece getTop(Point p){
		Point test = new Point((int) p.x, (int) p.y-1);
		if(isValid(test)){
			return board[(int) test.y][(int)test.x];
		}
		else return null;
	}
	public boolean topFits(Piece p, Point location){
		if(getTop(location)== null){
			return true;
		}
		else if(p.getTop()+getTop(location).getBottom()==0){
			return true;
		}
		else return false;
	}	
	private boolean rightFits(Piece p, Point location){
		if(getTop(location)== null){
			return true;
		}
		else if(p.getRight()+getRight(location).getLeft()==0){
			return true;
		}
		else return false;
	}
	private boolean leftFits(Piece p, Point location){
		if(getTop(location)== null){
			return true;
		}
		else if(p.getLeft()+getLeft(location).getRight()==0){
			return true;
		}
		else return false;
	}
	private boolean bottomFits(Piece p, Point location){
		if(getTop(location)== null){
			return true;
		}
		else if(p.getBottom()+getBottom(location).getTop()==0){
			return true;
		}
		else return false;
	}
	private Piece getRight(Point p){
		if(isValid(new Point((int) p.x+1,(int) p.y))){
			return board[(int) p.y][(int) p.x+1];
		}
		else return null;
	}
	private Piece getBottom(Point p){
		if(isValid(new Point((int) p.x,(int) p.y+1))){
			return board[(int) p.y+1][(int) p.x];
		}
		else return null;
	}
	private Piece getLeft(Point p){
		if(isValid(new Point((int) p.x-1,(int) p.y))){
			return board[(int) p.y][(int) p.x-1];
		}
		else return null;
	}

	public Piece getPiece(Point p){
		if(isValid(p)){
			return board[(int) p.y][(int) p.x];
		}
		else return null;
	}

	public boolean isValid(Point p){
		if(p.getX()<0||p.getY()<0||p.x>=xDim||p.y>=yDim){
//			System.out.println("A NON-VALID SPOT WAS FOUND AT" + p);
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

	public int getRows(){
		return yDim;
	}
	public int getCols(){
		return xDim;
	}
	public boolean setPiece(Piece p, Point location){
		if(getPiece(location)==null && doesFit(p,location)){
			board[(int) location.y][(int) location.x] = p;
			return true;
		}
		else return false;
	}
	public void clear(){
		for(int i = 0;i<=xDim;i++){
			for(int j = 0;j<=yDim;j++){
				setPiece(null,new Point(i,j));
			}
		}
	}

	public String toString(){
		String s = "";
		for(int i=0;i<xDim;i++){
			for(int j=0;j<yDim;j++){
				if(getPiece(new Point(j,i))==null){
					s+="[      ]";
				}
				else{
					s+=getPiece(new Point(j,i)).toString();
				}
			}
			s+="\n";
		}
		return s;
	}

	public Board(){
		this(3,3);
	}

	public Board(int xDim, int yDim){
		this.xDim=xDim;
		this.yDim=yDim;
		board = new Piece[yDim][xDim];
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
