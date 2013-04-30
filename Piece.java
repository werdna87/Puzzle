public class Piece{
	private int top;
	private int bot;
	private int left;
	private int right;
	public static final int CLUB_IN = -1;
	public static final int CLUB_OUT = 1;
	public static final int DIAMOND_IN = -2;
	public static final int DIAMOND_OUT = 2;
	public static final int HEART_IN = -3;
	public static final int HEART_OUT = 3;
	public static final int SPADE_IN = -4;
	public static final int SPADE_OUT = 4;
	
	public String toString(){
		String s = "";
		return s+="["+getTop()+getRight()+getLeft()+getBottom()+"]";
		
	}
	
	public void cRotate(){
		int temp = right;
		right=top;
		top=left;
		left=bot;
		bot=temp;
	}

	public void ccRotate(){
		int temp = right;
		right=bot;
		bot=left;
		left=top;
		top=temp;
	}

	public int getTop(){
		return top;
	}

	public int getBottom(){
		return bot;
	}

	public int getLeft(){
		return left;
	}

	public int getRight(){
		return right;
	}

	public void setTop(int top){
		this.top=top;
	}

	public void setBottom(int bottom){
		bot=bottom;
	}

	public void setLeft(int left){
		this.left=left;

	}

	public void setRight(int right){
		this.right=right;
	}

	public Piece(int top, int bottom, int left, int right){
		this.top=top;
		this.bot=bottom;
		this.left=left;
		this.right=right;
	}			
}
