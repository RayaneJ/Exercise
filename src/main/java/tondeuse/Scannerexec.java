package tondeuse;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scannerexec {

    public static void main(String args[])
	    throws FileNotFoundException, NumberFormatException, CommandeInvalideException, LimitePelouseException {

	try (Scanner scnr = new Scanner(System.in)) {
	    // Reading each line of the file using Scanner class

	    while (true) {
		System.out.println("entrez la position maximale de la pelouse svp !");
		String lp = scnr.nextLine();

		String[] limitePelouse = lp.split(" ");
		int maxPosPelouse = Integer.parseInt(limitePelouse[0]);

		System.out.println("faites entrez le point cardinal x de la tondeuse svp !/n");
		PointCardinal ptx = new PointCardinal(scnr.nextInt());
		scnr.nextLine();
		System.out.println("faites entrez le point cardinal y de la tondeuse svp !");
		PointCardinal pty = new PointCardinal(scnr.nextInt());
		scnr.nextLine();
		System.out.println("faites entrez l'orientation initial de la tondeuse svp !");
		String ort = scnr.nextLine();

		System.out.println("faites entrez la suite de commandes svp ! ");
		String commande = scnr.nextLine();
		Tondeuse tondeuse = new Tondeuse(new Position(ptx, pty), Orientation.valueOf(ort));
		new TondeuseControl().controlerTondeuse(maxPosPelouse, tondeuse, commande);
		System.out.println(tondeuse.getPosition().getX().toString() + " "
			+ tondeuse.getPosition().getY().toString() + " " + tondeuse.getOrientation().toString());

	    }
	}
    }
}
