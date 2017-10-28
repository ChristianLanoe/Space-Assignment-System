package Room;

public enum RoomType {
	Classroom,
	Gymnasium,
	Cafeteria,
	Theatre,
	Office;
	
	@Override
	public String toString() {
		switch(this) {
		case Classroom: return "Classroom";
		case Gymnasium: return "Gymnasium";
		case Cafeteria: return "Cafeteria";
		case Theatre: return "Theatre";
		case Office: return "Office";
		default: return "Unspecified";
		}		
	}
}
