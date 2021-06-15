import java.util.Scanner;

public class Positioning {

	static int counter=0;
	static int broiCherniRicari=0;
	static int broiCherniDjudjeta=0;
	static int broiCherniElfi=0;
	static int broiCherveniRicari=0;
	static int broiCherveniDjudjeta=0;
	static int broiCherveniElfi=0;
	
	    public static void Menu(Object[][] board){

		Scanner input=new Scanner(System.in);
		//2 djudjeta @, 2 elf &, 2 ricarq %
		while(true)
		{
			if(counter==12) {
				break;
			}
			if(counter%2==0) {
				counter++;

				System.out.println("Черните са на ход.\r\n" + 
						"Разполагате със следните фигури:"
						+ "(1) Рицар\r\n" + 
						  "(2) Джудже\r\n" + 
						  "(3) Елф\r\n" + 
						  "Коя единица искате да позиционирате?");
				int figure=input.nextInt();
			    VisualisationBlack(board);
			    int row;
				do {
				System.out.println("На кой ред ?");
				row=input.nextInt();}
			    while(row<5 && row>7);
				System.out.println("На коя колона");
				int col=input.nextInt();
				switch(figure) {
				case 1:
					if(broiCherniRicari==2) {
						System.out.println("Нямате право на повече рицари. Въведете избора си отново:");
						Menu(board);
					}
					broiCherniRicari++;
					board[row][col]=new Pawn("%",8,3,15,1,1);
					System.out.println("Фигурата е успешно позиционирана");
					break;
				case 2:
					if(broiCherniElfi==2) {
						System.out.println("Нямате право на повече елфи. Въведете избора си отново:");
						Menu(board);
					}
					broiCherniElfi++;
					board[row][col]=new Pawn("&",5,1,10,3,3);
					System.out.println("Фигурата е успешно позиционирана");
					break;
				case 3:
					if(broiCherniDjudjeta==2) {
						System.out.println("Нямате право на повече джуджета. Въведете избора си отново:");
						Menu(board);
					}
					broiCherniDjudjeta++;
					board[row][col]=new Pawn("@",6,2,12,2,2);
					System.out.println("Фигурата е успешно позиционирана");
					break;
				}
			}
			
			if(counter%2==1) {
				counter++;
				
				System.out.println("Червените са на ход.\r\n" + 
						"Разполагате със следните фигури:"
						+ "(1) Рицар\r\n" + 
						  "(2) Джудже\r\n" + 
						  "(3) Елф\r\n" + 
						  "Коя единица искате да позиционирате?");
				int figure=input.nextInt();
			    VisualisationRed(board);
			    int row;
				do {
				System.out.println("На кой ред ?");
				row=input.nextInt();}
			    while(row>=2);
				System.out.println("На коя колона");
				int col=input.nextInt();
				switch(figure) {
				case 1:
					if(broiCherveniRicari==2) {
						System.out.println("Нямате право на повече рицари. Въведете избора си отново:");
						Menu(board);
					}
					broiCherveniRicari++;
					board[row][col]=new Pawn("%",8,3,15,1,1);
					
					System.out.println("Фигурата е успешно позиционирана");
					break;
				case 2:
					if(broiCherveniElfi==2) {
						System.out.println("Нямате право на повече елфи. Въведете избора си отново:");
						Menu(board);
					}
					broiCherveniElfi++;
					board[row][col]=new Pawn("&",5,1,10,3,3);
					System.out.println("Фигурата е успешно позиционирана");
					break;
				case 3:
					if(broiCherveniDjudjeta==2) {
						System.out.println("Нямате право на повече джуджета. Въведете избора си отново:");
						Menu(board);
					}
					broiCherveniDjudjeta++;
					board[row][col]=new Pawn("@",6,2,12,2,2);;
					System.out.println("Фигурата е успешно позиционирана");
					break;
				}
			}
			}
		}		

	private static void VisualisationRed(Object[][] board) {
		Object [][] copy=new String[board.length][board[0].length];
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				if(board[i][j]=="*") {
				copy[i][j]=board[i][j];
				} else {
					copy[i][j]=((Pawn) board[i][j]).getSign();
				}
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<board[0].length;j++) {
				if(board[i][j]=="*") {
				copy[i][j]="X";
				}
			}
		}
		Board.Render1(copy);	
	}

	private static void VisualisationBlack(Object[][] board) {
		Object [][] copy=new String[board.length][board[0].length];
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				if(board[i][j]=="*") {
					copy[i][j]=board[i][j];
					} else {
						copy[i][j]=((Pawn) board[i][j]).getSign();
					}
			}
		}
		for(int i=5;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				if(board[i][j]=="*") {
				copy[i][j]="X";
				}
			}
		}
		Board.Render1(copy);
	}
	
}
