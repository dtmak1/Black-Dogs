public class MazeSolver{
	
	Maze maze;
	Maze snapshot;
	
	/**
	Create a maze
	*/
	public MazeSolver(Maze mazeToSolve){
		maze = mazeToSolve;
	}
	/**
	String representation of string
	*/
	public String toString(){
			return maze.toString();
	}
	/**
	Maze Solver
	Currently- base case working
	
	Not sure when to take a snapshot
	*/
	public boolean solve(){
		System.out.println("SOLVING" + System.lineSeparator()+ maze);
		
		if (maze.explorerIsOnA() == maze.WALL){
			System.out.println("Explorer on wall");
			return false;
		}
		
		if (maze.explorerIsOnA() == maze.TREASURE){
			System.out.println("DING DING!! PATH FOUND");
			return true;
		}
		
		else {
			
			for(int direction = 1; direction <= 8;direction = direction * 2){
				// Snapshot taken
				System.out.println("taking snapshot");
				snapshot = new Maze(maze);
				maze.dropA(maze.WALL);
				System.out.println("Moving in direction " + direction);
				maze.go(direction);
				solve();
				System.out.println("reverting to snapshot");
				maze = snapshot;
			}
		}
		
		return false;
	}
	
}