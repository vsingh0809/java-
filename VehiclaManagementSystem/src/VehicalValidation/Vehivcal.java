package VehicalValidation;

import java.time.LocalDate;

public class Vehivcal {
	private String chasisNo;
	private colourType colour;
	private double price;
	private LocalDate manufactureDate;
	private LocalDate insuranceExpDate;
	private double pollutionLevel;

	public Vehivcal(String chasisNo, colourType color, double price, LocalDate manufactureDate,
			LocalDate insuranceExpDate, double pollutionLevel) {
		this.chasisNo = chasisNo;
		this.colour = colour;
		this.price = price;
		this.manufactureDate = manufactureDate;
		this.insuranceExpDate = insuranceExpDate;
		this.pollutionLevel = pollutionLevel;
	}

	@Override
	public String toString() {
		return "Vehivcal [chasisNo=" + chasisNo + ", color=" + colour + ", price=" + price + ", manufactureDate="
				+ manufactureDate + ", insuranceExpDate=" + insuranceExpDate + ", pollutionLevel=" + pollutionLevel
				+ "]";
	}

}
