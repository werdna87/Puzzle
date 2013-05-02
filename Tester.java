import java.awt.Point;


public class Tester {
	public static void main(String[] args){
		Piece p1 = Board.PIECES[0];
		Piece p2 = Board.PIECES[1];
		Board b = new Board(5,5);
		System.out.println(b.setPiece(p1,new Point(1,1)));
//		System.out.println(b);
		System.out.println(b.setPiece(p2,new Point(2,1)));
//		System.out.println(b);
//		System.out.println(Board.PIECES[1].)
		p1.piecePrinter();
		p2.piecePrinter();
		System.out.println(p1.getBottom());
		System.out.println(p2.getTop());
		System.out.println(b.topFits(p2,new Point(2,0)) + "\n" + b);
		
		
	}
}
