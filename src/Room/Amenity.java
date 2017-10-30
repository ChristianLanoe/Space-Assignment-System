package Room;

public enum Amenity {
	TV, 
	OverheadProjector,
	DocumentCamera,
	Chalkboard,
	Whiteboard;
	
	@Override
	public String toString() {
		switch(this) {
		case TV: return "TV";
		case OverheadProjector: return "Overhead Projector";
		case DocumentCamera: return "Document Camera";
		case Chalkboard: return "Chalkboard";
		case Whiteboard: return "Whiteboard";
		default: return "unspecified";
		}
	}
}
