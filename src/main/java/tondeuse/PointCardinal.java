package tondeuse;
import java.util.Objects;

public class PointCardinal {
	
	int point = 0;
			
			

	public PointCardinal(int point) {
		super();
		this.point = point;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	
	public void incrementer (int positionPelouse) throws LimitePelouseException {
		point ++;
		 if (point > positionPelouse) {
	        throw new LimitePelouseException("la tondeuse de peut pas sortir de la pelouse");	
	        }
	}
	
	public void decrementer (int positionPelouse) throws LimitePelouseException {
		
        point --; 
        if (point > positionPelouse) {
        	
        	if (point > positionPelouse) {
    	        throw new LimitePelouseException("la tondeuse de peut pas sortir de la pelouse");	
    	  
        	
        }
	}
			
	
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(point);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PointCardinal other = (PointCardinal) obj;
		return point == other.point;
	}

	@Override
	public String toString() {
		return String.valueOf(point);
	}
	
	
}
