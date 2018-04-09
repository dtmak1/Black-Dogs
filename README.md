# Black Dogs

## personnel
Shin Bamba, Dylan Mak

## statement of problem
returns the boolean value of the statement “there exists one path through a maze
starting at a designated beginning and ending at treasure”

## recursive abstraction
when i am asked to find a path through a maze from the maze element the explorer is on,

the recursive abstraction can find a path through a maze starting 1 step from the explorer's current position

## base case
if the explorer is on the treasure, return true

## English or pseudocode description of algorithm
for every step of a path
  base case?
  if reach an intersection (multiple possible paths)
    for every possible next step
      recursive abstraction
      return to the location of the intersection <-- recursive backtracking 
    
final return statement needs to be an 'or' to account for paths with dead ends

## class(es), with fields and methods

## version*n* wish list
return path or set of moves to reach treasure
return number of different possible paths to reach treasure
return all?
