package Schedule;

import java.io.Serializable;

/*Enumerated type for semester*/
public enum SemesterType implements Serializable {
	FALL, WINTER, SUMMER;

	@Override
	public String toString() {
		switch (this) {
		case FALL:
			return "Fall";
		case WINTER:
			return "Winter";
		case SUMMER:
			return "Summer";
		default:
			return "Unspecified";
		}
	}

	public int getValue() {
		switch (this) {
		case FALL:
			return 0;
		case WINTER:
			return 1;
		case SUMMER:
			return 2;
		default:
			return -1;
		}
	}
}
