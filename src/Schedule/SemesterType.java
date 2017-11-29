package Schedule;

/*Enumerated type for semester*/
public enum SemesterType {
	FALL, WINTER, SUMMER;
	
	@Override
	public String toString() {
		switch(this) {
		case FALL: return "Fall";
		case WINTER: return "Winter";
		case SUMMER: return "Summer";
		default: return "Unspecified";
		}
	}
}
