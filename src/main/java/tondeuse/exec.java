package tondeuse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exec {
	


	    public static void main(String args[]) throws FileNotFoundException, NumberFormatException, CommandeInvalideException, LimitePelouseException {
	 
	        //creating File instance to reference text file in Java
	        File text = new File("C:\\Users\\Rayan\\Downloads\\Exercise\\src\\main\\resources\\testExemple.txt");
	        List<String> entry = new ArrayList<String>();
	        try (//Creating Scanner instance to read File in Java
			Scanner scnr = new Scanner(text)) {
				//Reading each line of the file using Scanner class
				int lineNumber = 1;
				
				while(scnr.hasNextLine()){
				    String line = scnr.nextLine();
				    entry.add(line);
				   
				    lineNumber++;
				}
			}
	    
	      String lp = (String) entry.get(0);
	      String[] limitePelouse=lp.split(" ");
	     
	      String tond1 =  (String) entry.get(1);
	      String[] tondstr = tond1.split(" ");
	      String commande1 = (String) entry.get(2);
	      Tondeuse tondeuse1  = new Tondeuse(new Position(new PointCardinal(Integer.parseInt(tondstr[0])),new PointCardinal(Integer.parseInt(tondstr[1]))), Orientation.valueOf(tondstr[2]));
	      new TondeuseControl().controlerTondeuse( Integer.parseInt(limitePelouse[0]), tondeuse1, commande1);
	    System.out.println( tondeuse1.getPosition().getX().toString()+" "+ tondeuse1.getPosition().getY().toString()+" "+ tondeuse1.getOrientation().toString());
	  
	   
	    }  
	 
	}

	