package VehicalValidation;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;

public class VehicalValidationnRule {

	public static final int pollution_range;
	static {
		pollution_range = 20;
	}

	public static void polution_check(double pollution) throws pollutionOutOfRange {
		if (pollution < pollution_range) {
			throw new pollutionOutOfRange("your pollutaion leval is good");
		}
		if (pollution > pollution_range) {
			throw new pollutionOutOfRange("your pollutaion leval is out polluionRange ");
		}
	}

	public static void colour_check(String colour) throws colourOutOfRange {
		for (colourType colourType : colourType.values()) {
			if (colourType.name().equalsIgnoreCase(colour)) {
				System.out.println("colour is not valid");

			} else {

				throw new colourOutOfRange(" good choice of colour");
			}
		    }
	}
}
