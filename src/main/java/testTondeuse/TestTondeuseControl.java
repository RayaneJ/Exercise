package testTondeuse;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import tondeuse.CommandeInvalideException;
import tondeuse.LimitePelouseException;
import tondeuse.Orientation;
import tondeuse.PointCardinal;
import tondeuse.Position;
import tondeuse.Tondeuse;
import tondeuse.TondeuseControl;

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
	tondeuseControl = new TondeuseControl();
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

    @org.junit.Test
    public void shouldControTondeuse() throws LimitePelouseException, CommandeInvalideException {

	

	Tondeuse tond = new Tondeuse(new Position(new PointCardinal(1), new PointCardinal(3)), Orientation.N);

	tondeuseControl.controlerTondeuse(pelousePosMax, T1, commande1);
	assertEquals(T1, tond);

    }
    
    @Test
    public void shouldMoveWhenCommandIsAOrientationN() throws LimitePelouseException {
	
	int yattendu = P2.getPoint()+1;
	T1.avancer(pelousePosMax);
	assertEquals(yattendu, T1.getPosition().getY().getPoint());
	
    }
    
    @Test
    public void shouldChangeDirectionWhenCommandIsAOrientationG() throws LimitePelouseException, CommandeInvalideException {
	tondeuseControl.controlerTondeuse(pelousePosMax, T1,"G");
	Orientation ort = Orientation.W;
	T1.tournerGauche();
	assertEquals(ort, T1.getOrientation());
	
    }
    
  

    @Test(expected = CommandeInvalideException.class)
    public void ShouldThrowExepctionWhenWrongCommand() throws CommandeInvalideException, LimitePelouseException  {
        tondeuseControl.controlerTondeuse(pelousePosMax, T1, "R");
    }

}