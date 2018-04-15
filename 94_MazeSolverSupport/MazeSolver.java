public class MazeSolver{
	
	Maze candidate;
	
	/**
	Create a maze
	*/
	public MazeSolver(Maze mazeToSolve){
		candidate = mazeToSolve;
	}
	
	/**
	String representation of Maze
	*/
	public String toString(){
		return candidate.toString();
	}
	
	/**
	returns the boolean value of the statement there exists a path through 
	the maze starting at a designated beginning and ending at a treasure	
	*/
	public boolean solve(){
		//System.out.println("here we go" + System.lineSeparator() + candidate);
		//System.out.println(candidate.explorerIsOnA() == Maze.TREASURE);
		//System.out.println("snapshot below" + System.lineSeparator());
		
		if (candidate.explorerIsOnA() == Maze.WALL){}
		
		else if (candidate.explorerIsOnA() == Maze.TREASURE){
			return true;
		}

		else {		 
			for (int d = 0; d < Maze.directions.length; d++) {
				
				Maze snapshot = new Maze(candidate);
				
				candidate.dropA(Maze.WALL);
				candidate.go(Maze.directions[d]);
				
				if (solve()) return true;
			
				candidate = new Maze(snapshot);	
			}			
			
		}
	
		return false;
	}
}