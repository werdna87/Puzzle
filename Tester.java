import java.awt.Point;


public class Tester {
	public static void main(String[] args){
		Board b = new Board();
		System.out.println(b.setPiece(Board.PIECES[0],new Point(2,1)));
		System.out.println(b);
		System.out.println(b.setPiece(Board.PIECES[3],new Point(2,0)));
		System.out.println(b);
	}
}
