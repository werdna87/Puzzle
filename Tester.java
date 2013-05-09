import java.awt.Point;


public class Tester {
	public static void main(String[] args){
		Piece p1 = Board.PIECES[0];
		Piece p2 = Board.PIECES[1];
		Piece p3 = Board.PIECES[2];
		Board b = new Board();
		b.setPiece(p1,new Point(0,0));
		b.setPiece(p2, new Point(1,0));
		b.setPiece(p3, new Point(2,0));
		System.out.println(b + "" + p2.getRight() + p3.getLeft());
		

		
	}
}
