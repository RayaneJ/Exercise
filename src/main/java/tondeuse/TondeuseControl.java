package tondeuse;

public class TondeuseControl {

    public TondeuseControl() {
	super();
	// TODO Auto-generated constructor stub
    }

    public void controlerTondeuse(int pelousePositionMax, Tondeuse tondeuse, String commandes)
	    throws CommandeInvalideException, LimitePelouseException {

	for (char commande : commandes.toCharArray()) {

	    switch (Character.toUpperCase(commande)) {
	    case 'A':
		tondeuse.avancer(pelousePositionMax);
		break;
	    case 'G':
		tondeuse.setOrientationGauche();
		break;
	    case 'D':
		tondeuse.setOrientationDroite();
		break;

	    default:
		throw new CommandeInvalideException("commande inconnu");
	    }
	}

    }

}
