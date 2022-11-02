package tondeuse;

import java.util.Objects;

public class Position {
    private PointCardinal x;
    private PointCardinal y;

    public Position(PointCardinal x, PointCardinal y) {
	this.x = x;
	this.y = y;
    }

    public PointCardinal getX() {
	return x;
    }

    public void setX(PointCardinal x) {
	this.x = x;
    }

    public PointCardinal getY() {
	return y;
    }

    public void setY(PointCardinal y) {
	this.y = y;
    }

    @Override
    public int hashCode() {
	return Objects.hash(x, y);
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Position other = (Position) obj;
	return Objects.equals(x, other.x) && Objects.equals(y, other.y);
    }

    @java.lang.Override
    public java.lang.String toString() {
	return "Position{" + "x=" + x + ", y=" + y + '}';
    }
}