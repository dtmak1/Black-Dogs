public class MazeSolver{
	
	Maze candidate;
	Maze snapshot;
	
	/**
	Create a maze
	*/
	public MazeSolver(Maze mazeToSolve){
		candidate = mazeToSolve;
	}
	
	/**
	Maze Solver
	*/
	public boolean solve(){
		System.out.println("here we go" + System.lineSeparator() + candidate);
		System.out.println(candidate.explorerIsOnA() == Maze.TREASURE);
		System.out.println("snapshot below" + System.lineSeparator());
		System.out.println(snapshot);
		
		if (candidate.explorerIsOnA() == Maze.WALL){}
		
		else if (candidate.explorerIsOnA() == Maze.TREASURE){
			//System.out.println("DING DING!! PATH FOUND");
			return true;
		}

		else {		
			snapshot = new Maze(candidate);
						
			candidate.dropA(Maze.WALL);
			candidate.go(Maze.EAST);
			solve();
			
			candidate = new Maze(snapshot);
			candidate.dropA(Maze.WALL);
			candidate.go(Maze.NORTH);
			solve();
			
			candidate = new Maze(snapshot);
			candidate.dropA(Maze.WALL);
			candidate.go(Maze.WEST);
			solve();
			
			candidate = new Maze(snapshot);
			candidate.dropA(Maze.WALL);
			candidate.go(Maze.SOUTH);
			solve();
			
		}
	
		return false;
	}
}