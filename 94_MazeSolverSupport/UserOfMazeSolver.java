/**
Test Maze Solver

TEST CASES:
java UserOfMazeSolver mazes/4cell_treasureWest.txt -1 -1  # no explorer

java UserOfMazeSolver mazes/intersection_treasureNorth.txt 1 1
	treasure at starting point-
java UserOfMazeSolver mazes/treasure_at_start.txt 0 0
	no path to treasure -
java UserOfMazeSolver mazes/no_path.txt 1 1


*/
public class UserOfMazeSolver{

	public static void main(String[] commandLine)
		throws java.io.FileNotFoundException {
        System.out.println();
		
		Maze maze = new Maze( commandLine[0]
                            , Integer.parseInt( commandLine[1])
                            , Integer.parseInt( commandLine[2])
                            );
        System.out.println( maze + System.lineSeparator());
		
		// test constructor
		MazeSolver mazeSolver = new MazeSolver(maze);
		
		// test toString
		System.out.println(mazeSolver);
       
	   // test solver
	   System.out.println("SOLUTION STARTED");
		System.out.println(mazeSolver.solve());
	  
	   
    }

}
