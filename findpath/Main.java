package findpath;

//FIND PATH
//=========
//Create algorithm which is able to find path from start position to target position in any given maze based on those rules:
//1. maze is rectangular 2d grid of mase elements
//2. maze element is free '.' or blocked '#'
//3. maze contains one start position marker 'S'
//4. maze contains target position 'X'
//Input into algorithm is maze data as described above. Output from algorithm is series of steps from 
//position 'S' to reach position 'X' or error in case that there is no direct path between them.
//Allowed steps are one position up 'u', down 'd', left 'l', right 'r'. Diagonal steps are not allowed.
//Program must be able to read inputs from file as well as from standard input and each option
//should be designed/implemented as extra class, e.g:
//1. class FindPathInputReaderStdIn extends AbstractFindPathInputReader { ...
//2. class FindPathInputReaderFile extends AbstractFindPathInputReader { ...
//It is mandatory to implement at least one unittest which verifies resulting path.
//
//Deliverables
//============
//It is mandatory that implementation of this task is done in Java. 
//Optionally, extra points are achieved if implementation:
//* clean architecture, layer separation and API design
//* is delivered as maven or gradle project, when is loaded into IDE (Eclipse or Intellij Idea).
//* unit tests are implemented to test partial functionality as well as whole solution.
//* is delivered as zipped git repository with clean history of commits.
//* multi-threaded implementation is used 
//* shortest possible path is calculated
//* performance tests are provided
//* runs in java 9 or 10
//
//Examples
//========
//
//input:
//....................................
//..S...#......................#......
//......#......................#......
//.............................#......
//....................................
//....................................
//..............#.....................
//............#.......................
//..........#.........................
//....................................
//.....................#..........#...
//.....................#....X.....#...
//.....................#..........#...
//....................................
//output:
//d,d,d,d,d,d,d,d,d,d,d,d,r,r,r,r,r,r,r,r,r,r,r,r,r,r,r,r,r,r,r,r,r,r,r,r,u,u,u
//
//


public class Main {

	final static char[][] maze = {
			{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},
			{'F','S','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'}
	};
	
	public static void main(String[] args) {
		// 

		System.out.println("Show the maze first");
		showMaze(maze);
		System.out.println("We start here at: " + getSymbolCoords(maze, 'S'));
		System.out.println("We end up here at: " + getSymbolCoords(maze, 'X'));
		finishIsInNeighborhood(getSymbolCoords(maze, 'S'), getSymbolCoords(maze, 'F'));
	}
	
	private static void showMaze(char[][] maze) {
		for (int i = 0; i < maze.length; i++) {
			for(int j = 0; j < maze[i].length; j++) {
				System.out.print(maze[i][j]);
			}
			System.out.println();
		}
		
	}

	public static String getSymbolCoords(final char[][] maze, char symbol) {
		String coords = "";
		for (int i = 0; i < maze.length; i++) {
			for(int j = 0; j < maze[i].length; j++) {
				if(maze[i][j] == symbol) {
					coords = i + "," + j;
					return coords;
				}
			}
		}
		return coords;
	}
	
	public static boolean finishIsInNeighborhood(final String startCoords, final String finishCoords) {
		final int xS = Integer.parseInt(startCoords.split(",")[0]);
		final int yS = Integer.parseInt(startCoords.split(",")[1]);
		System.out.println(xS + " " + yS);
		
		final int xF = Integer.parseInt(finishCoords.split(",")[0]);
		final int yF = Integer.parseInt(finishCoords.split(",")[1]);
		System.out.println(xF + " " + yF);
		
		// finish is right to start
		if((yS + 1 == yF) && (xS == xF)) {
			System.out.println("it's my neighbor...!");
			return true;
		}
		
	        // finish is left to start
		if((yS > 0 && yS < maze.length) &&  (yS - 1 == yF) && (xS == xF)) {
			System.out.println("it's my neighbor...!");
			return true;
		}
	
		return false;
	}

}
