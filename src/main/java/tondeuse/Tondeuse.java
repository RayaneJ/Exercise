package tondeuse;

import java.util.Objects;

public class Tondeuse {

    private Position position;
    private Orientation orientation;

    public Tondeuse(Position position, Orientation orientation) {
	this.position = position;
	this.orientation = orientation;
    }

    public Position getPosition() {
	return position;
    }

    public void setPosition(Position position) {
	this.position = position;
    }

    public Orientation getOrientation() {
	return orientation;
    }

    public void setOrientation(Orientation orientation) {
	this.orientation = orientation;
    }

    protected void setOrientationDroite() {
	orientation = orientation.droite();
    }

    protected void setOrientationGauche() {
	orientation = orientation.gauche();
    }

    public void avancer(int posPelouse) throws LimitePelouseException {

	switch (orientation) {
	case E:
	    position.getX().incrementer(posPelouse);
	    ;
	    break;
	case W:
	    position.getX().decrementer(posPelouse);
	    break;
	case N:
	    position.getY().incrementer(posPelouse);
	    break;
	case S:
	    position.getY().decrementer(posPelouse);

	}

    }

    public void tournerGauche() {

    }

    public void tournerDroite() {

    }

    @Override
    public int hashCode() {
	return Objects.hash(orientation, position);
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Tondeuse other = (Tondeuse) obj;
	return orientation == other.orientation && Objects.equals(position, other.position);
    }

    @java.lang.Override
    public java.lang.String toString() {
	return "Tondeuse{" + "position=" + position + ", Orientation=" + orientation + '}';
    }
}