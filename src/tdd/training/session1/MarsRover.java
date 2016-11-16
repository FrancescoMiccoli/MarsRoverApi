package tdd.training.session1;

import java.util.Arrays;

import javax.management.monitor.StringMonitor;


public class MarsRover {
	int planet[][];
	public MarsRover(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: ?(o1_x,o1_y)(o2_x,o2_y)...(on_x,on_y)? with no white spaces. 
	 *  
		Example use:
		MarsRover rover = new MarsRover(100,100,"?(5,5)(7,8)?")  //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8) 
	 */
		//planet = new int[x][y];
		//Arrays.fill(planet, false);
		//positionObstacles(obstacles);
		
		

	}
	
	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The rover is on a 100x100 grid at location (0, 0) and facing NORTH. The rover is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: ?(x,y,facing)(o1_x,o1_y)(o2_x,o2_y)?..(on_x,on_y)?  
		 * Where x and y are the final coordinates, facing is the current direction the rover is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		
		return null;
	}
	
	public void positionObstacles(String obstacles){
		
		
		String word2 ="";
		for (int i = 1; i<obstacles.length()-1;i++) {
		    word2 = obstacles.substring(i, 5*i);
		    System.out.println(word2);
		}
		
		obstacles.replaceAll(")"," ");
		String coordinate[] = obstacles.split("\\s+");
		
		System.out.println(coordinate);
		
		
		String temp[] = obstacles.split(")");
		System.out.println("XC");
		temp[1].replace('(', ' ');
		temp[1] = temp[1].trim();
		String locationTemp[] = temp[1].split(",");
		obstacles.replaceAll(")", " ");
		
		
		
		//planet[Integer.parseInt(locationTemp[1])][Integer.parseInt(locationTemp[2])] = 0;
		
		
	}
}
