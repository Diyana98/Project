
public class Board {

	public static Object[][] Fill(Object[][] board) {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				board[i][j]="*";
			}
		}
		return board;
		}
	
	public static void Render(Object[][] board) {
		
		System.out.println("-------------------------");
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				Object gameBoardElement = board[i][j];

                if(gameBoardElement == "*") {
                    System.out.print("*");
                }
                else if(gameBoardElement == "$") {
                	 System.out.print("$");
                }
                else if(gameBoardElement == "#") {
                	System.out.print("#");
                }
                else {
                    ((Pawn)gameBoardElement).getSign();
                }
				//System.out.print(copy[i][j]+" ");
			}
			System.out.println();
		}	
		System.out.println("-------------------------");
	}
	
public static void Render1(Object[][] copy) {
		
		System.out.println("-------------------------");
		for(int i=0;i<copy.length;i++) {
			for(int j=0;j<copy[0].length;j++) {

				System.out.print(copy[i][j]+" ");
			}
			System.out.println();
		}	
		System.out.println("-------------------------");
	}
}
