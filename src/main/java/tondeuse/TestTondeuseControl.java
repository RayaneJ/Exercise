package tondeuse;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

import org.junit.Test;

public class TestTondeuseControl {
    Position pos1;
    Position pos2;
    PointCardinal P1;
    PointCardinal P2;
    PointCardinal P3;
    PointCardinal P4;

    Tondeuse T1;
    String commande1;
    Tondeuse T2;
    String commande2;
    int pelousePosMax;

    TondeuseControl tondeuseControl;

    @Before
    public void initialiser() {

	P1 = new PointCardinal(1);
	P2 = new PointCardinal(2);
	P3 = new PointCardinal(3);
	P4 = new PointCardinal(3);

	pos1 = new Position(P1, P2);
	pos2 = new Position(P3, P3);

	T1 = new Tondeuse(pos1, Orientation.N);
	commande1 = "GAGAGAGAA";
	T2 = new Tondeuse(pos2, Orientation.E);
	commande2 = "AADAADADDA";
	pelousePosMax = 5;

    }

    @Test
    public void shouldControTondeuse() throws LimitePelouseException, CommandeInvalideException {

	Tondeuse tondAttendu = new Tondeuse(new Position(new PointCardinal(1), new PointCardinal(3)), Orientation.N);

	tondeuseControl.controlerTondeuse(pelousePosMax, T1, commande1);
	assertEquals(T1, tondAttendu);

    }

    @Test
    public void ShouldMoveForwardWhenCommandIsA() throws LimitePelouseException {

	int attendu = P1.getPoint() + 1;
	T1.avancer(pelousePosMax);

	assertEquals(attendu, T1.getPosition().getY().getPoint());

    }

}