# Black Dogs

## personnel
Shin Bamba, Dylan Mak

## statement of problem
returns the boolean value of the statement “there exists one path through a maze starting at a designated beginning and ending at treasure” OR "one path from the explorer to the treasure" (which is better?)

## recursive abstraction
when i am asked to find a path through a maze from the maze element the explorer is on,
the recursive abstraction can find a path through a maze starting 1 step from the explorer's current position

## base case
when the explorer has reached the treasure

## English or pseudocode description of algorithm
```
procedure bt(c)
  if the explorer is on a wall return
  if the explorer is on the treasure return true
  else {  
    for each direction
    step
    bt(s) // recursive abstraction
    undo step via the snapshot & copy constructor // backtracking piece
  }
  return false
```

## class(es), with fields and methods
<!-- what should we put here? -->

## version*n* wish list
considered focusing on the junctions / choices / hallways
return path or set of moves to reach treasure
return number of different possible paths to reach treasure
return all?
