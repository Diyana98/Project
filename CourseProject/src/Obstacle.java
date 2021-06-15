
public class Obstacle {

	public static Object[][] SetObstacles(Object[][] board) {

		int obstacleCount=Util.random(5)+1;
	    boolean enoughObstacles=false;
			
		for(int i=2;i<5;i++) {
			for(int j=0;j<board[0].length;j++) {
				int setObstacle=Util.random(4);
				if(setObstacle==0) {
					
				if(obstacleCount==1) {
					board[i][j]="#";
					obstacleCount--;
				}
				else {
					int wallOrNot=Util.random(1);
					board[i][j]=(wallOrNot==1)?"#":"$";
					obstacleCount--;
				}					
				}
				if(obstacleCount==0) {
					enoughObstacles=true;
					break;
			}
		}  if(enoughObstacles) break;
		}

		return board;
	}

}
