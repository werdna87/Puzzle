import java.awt.Point;

public class Solver{

	public void solve(Board b){
		solve(b,new Point(0,0),0);
	}
	public void solve(Board b, Point p,int i){
		Boolean bool;
		Piece piece = Board.PIECES[i];
		for(int j=0;j<4;j++){
			if(b.doesFit(piece,p)){
				b.setPiece(piece,p);
				bool=true;
				break;
			}
			piece.cRotate();
		}
		if(b.doesFit(piece,p)){
			
		}
	}
}
