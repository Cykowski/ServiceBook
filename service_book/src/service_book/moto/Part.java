package service_book.moto;
import java.math.BigDecimal;

import org.joda.time.*;

public class Part {
	

	protected LocalDate purchaseDate;
	protected LocalDate lastServiceDate;
	protected LocalDate lexpireDate;

	protected BigDecimal	purchasePrice;
	protected BigDecimal	servicePrice;
	
	protected String	description;
	protected String	name;
	
	
	
	public Part()
	{
		this.purchaseDate = LocalDate.now();
		this.lastServiceDate = LocalDate.now();
		this.lexpireDate = LocalDate.now().plusYears(1);
	}
	

}
