import java.awt.Point;
import java.util.ArrayList;

public class Solver{
	private ArrayList<Piece> used = new ArrayList<Piece>();
	
	public void solve(Board b){
		for(Piece p:Board.PIECES){
			used.add(p);
		}
		solve(b,new Point(0,0),0);
	}
	public void solve(Board b, Point p,int i){
//		if(i>=used.size()){
		if(p.x>=b.getCols()||p.y>=b.getRows()){
			i=0;
		}
		if(p.y>b.getRows()){
			return;
		}
		Boolean bool;
		Piece piece = used.get(i);
		for(int j=0;j<4;j++){
			if(b.doesFit(piece,p)){
				b.setPiece(piece,p);
				bool=true;
				used.set(i,null);
				break;
			}
			piece.cRotate();
		}
		if(bool=true){
			if(p.getX()> b.getCols()-1){
				solve(b,new Point(p.x+1,p.y),i+1);
			}
			else{
				p.x=0;
				p.y=p.y+1;
				solve(b,p,i+1);
			}
		}else{
			if(p.getX()-1>=0){
				solve(b,new Point(p.x-1,p.y),i+1);
				}
			else{
				p.x=b.getCols()-1;
				p.y=p.y-1;
			}
		}
		used.set(i,piece);
	}
	
	public static void main(String[]args){
		Solver solve = new Solver();
		Board b = new Board(3,3);
		solve.solve(b);
	}
}
