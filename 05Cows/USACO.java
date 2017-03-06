import java.util.io.*;
import java.util.*;

public class USACO {

    private int[][] lake;
    private ArrayList<int[]> instructions;
    
    public int bronze(String filename) {
	
	try {
	    File f = new File( filename );
	    Scanner in = new Scanner( f );
	    String[] firstLine = in.nextLine().split(' ');
	    int rows = Integer.parseInt( firstLine[0] );
	    int cols = Integer.parseInt( firstLine[1] );
	    lake = new int[ rows ][ cols ];
	    for (int i = 0; i < rows; i++) {
		String[] numbers = in.nextLine().split(' ');
		for (int j= 0;j < cols; j++) {
		    lake[ i ][ j ] = Integer.parseInt( numbers[j] );
		}
	    }
	    instructions = new ArrayList<>();
	    int upTo = 0;
	    while ( in.hasNextLine() ) {
		String line = in.nextLine().split(' ');
		for (int i = 0; i < 3; i++) {
		    instructions.get(upTo)[i] = line[i];
		}
	    }
	}
	catch (Exception e) {}
    }
		    
		
		
	    
	    
	    
	
	
