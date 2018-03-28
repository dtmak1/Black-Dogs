# Black Dogs

## personnel
Shin Bamba, Dylan Mak

## statement of problem
returns the boolean value of the statement “there exists one path through a maze
starting at a designated beginning and ending at treasure”

## recursive abstraction
when i am asked to find a path through a maze with n choices,
the recursive abstraction can find a path through a maze with n-1 choices.

## base case
when you get to the treasure or end
if treasure return true, if end return false

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
