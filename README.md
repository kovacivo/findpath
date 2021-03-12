# Findpath

java console app to find a path from start to finish in maze with obstacles in it

Create algorithm which is able to find path from start position to target position in any given maze based on those rules:

1. maze is rectangular 2d grid of mase elements
2. maze element is free '.' or blocked '#'
3. maze contains one start position marker 'S'
4. maze contains target position 'F'

Input into algorithm is maze data as described above. Output from algorithm is series of steps from 
position 'S' to reach position 'F' or error in case that there is no direct path between them.
Allowed steps are one position up 'u', down 'd', left 'l', right 'r'. Diagonal steps are not allowed.
Program must be able to read inputs from file as well as from standard input and each option
should be designed/implemented as extra class, e.g:

1. class FindPathInputReaderStdIn extends AbstractFindPathInputReader { ...
2. class FindPathInputReaderFile extends AbstractFindPathInputReader { ...

It is mandatory to implement at least one unittest which verifies resulting path.

## Deliverables

It is mandatory that implementation of this task is done in Java. 
Optionally, extra points are achieved if implementation:
* clean architecture, layer separation and API design
* is delivered as maven or gradle project, when is loaded into IDE (Eclipse or Intellij Idea).
* unit tests are implemented to test partial functionality as well as whole solution.
* is delivered as zipped git repository with clean history of commits.
* multi-threaded implementation is used 
* shortest possible path is calculated
* performance tests are provided
* runs in java 9 or 10
