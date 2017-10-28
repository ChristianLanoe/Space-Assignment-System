package Room;

public enum Amenity {
	TV, 
	Projector;
	
	@Override
	public String toString() {
		switch(this) {
		case TV: return "TV";
		case Projector: return "Projector";
		default: return "unspecified";
		}
	}
}
