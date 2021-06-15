import java.util.Scanner;

public class Application {

    static int MAP_WIDTH = 7;
    
	static int MAP_HEIGHT = 9;

	public static void main(String[] args) {
		// da oprawq identifikatorite i cweta na peshkite
		Object[][] board=new Object[MAP_WIDTH][MAP_HEIGHT];
		board=Board.Fill(board);
		Positioning.Menu(board);
		Board.Render(board);
		//steni, barikadi - mogat da budat preskachani i razrushavani
		board=Obstacle.SetObstacles(board);
		Board.Render(board);
		
	}
}
