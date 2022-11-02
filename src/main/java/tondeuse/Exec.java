package tondeuse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exec {
	


	    public static void main(String args[]) throws FileNotFoundException, NumberFormatException, CommandeInvalideException, LimitePelouseException {
	 
	      
	        File text = new File("C:\\Users\\Rayan\\Downloads\\Exercise\\src\\main\\resources\\testExemple.txt");
	        List<String> entry = new ArrayList<String>();
	        try (
			Scanner scnr = new Scanner(text)) {
				
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
	 
	     
	      String tond2 =  (String) entry.get(3);
	      String[] tondstr2 = tond2.split(" ");
	      String commande2 = (String) entry.get(4);
	      Tondeuse tondeuse2  = new Tondeuse(new Position(new PointCardinal(Integer.parseInt(tondstr2[0])),new PointCardinal(Integer.parseInt(tondstr2[1]))), Orientation.valueOf(tondstr2[2]));
	      new TondeuseControl().controlerTondeuse( Integer.parseInt(limitePelouse[0]), tondeuse2, commande2);
	    System.out.println( tondeuse2.getPosition().getX().toString()+" "+ tondeuse2.getPosition().getY().toString()+" "+ tondeuse2.getOrientation().toString());
	
	  
	   
	    }  
	 
	}

	