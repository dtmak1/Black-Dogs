# Black Dogs

## personnel
Shin Bamba, Dylan Mak

## v1
fix up the readme, implement for loop, implement displayer

## statement of problem
returns the boolean value of the statement “there exists a path through the maze starting at a designated beginning and ending at a treasure”

## recursive abstraction
when i am asked to find if “there exists a path through the maze starting at a designated beginning and ending at a treasure”,  
the recursive abstraction can find if there exists a path through the maze starting 1 step from the explorer's current position and ending at a treasure

## base case
when the explorer is on a wall  
when the explorer is on a treasure

## English or pseudocode description of algorithm
```
procedure bt() {
  if the explorer is on a wall return
  else if the explorer is on a treasure return true
  else {  
	for each direction {
		take a snapshot
		drop a wall
		step
		if (bt()) return true
		restore snapshot
	}
  }		
  return false
}
```

## known bugs
NullPointerException occurs when asked to solve a null maze.
NumberFormatException occurs when starting position of explorer is unreasonably large or non-integer number
ArrayIndexOutOfBoundsException when not given proper parameters at command line

## class(es), with fields and methods
<!-- what should we put here? -->

## version*n* wish list
considered focusing on the junctions / choices / hallways
return path or set of moves to reach treasure
return number of different possible paths to reach treasure
return all
