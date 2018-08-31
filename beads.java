/*
  ID: dsipear1
  LANG: JAVA
  TASK: beads
  
 */
import java.io.*;
import java.util.*;

public class beads {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader f = new BufferedReader(new FileReader("H:src//beads.in")); 
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")));

		int numBeads = Integer.parseInt(f.readLine());
		String necklace = f.readLine();
		String test = necklace + necklace;
		char[] beads = test.toCharArray();
		int counter = 0;
		int max =0;
		boolean same = false;
		//char color = beads[0];
		for(int j = 0; j <numBeads; j++) {
			//if(beads[j] != 'w')
			counter = count(j, beads);
			if(counter > max)
				max = counter;
		}
		out.println(max);
		out.close();
	}
	public static int count(int b, char[] beads) {
		char color = beads[b];
		boolean change = true;
		int counter =0;
		//int back = b;
		for(int i =b; i<beads.length; i++) {
			if(change && (beads[i] == color || beads[i] == 'w')) {
				counter++;
				
			}
			else if (change){
				change = false;
				//char color2 = beads[i];
				System.out.println("1: " + counter);
				for(int j=i; j<beads.length; j++) {
					if(beads[j] != color) {
						counter++;
						System.out.println("2:" + counter);
					}
					else
						break;
				}
			}
			else
				break;
				
				
		}
		if(change)
			return counter/2;
		return counter;
	}

}

