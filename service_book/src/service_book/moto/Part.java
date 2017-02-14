package service_book.moto;

import java.math.BigDecimal;
import org.joda.time.*;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Part {
	

	protected LocalDate purchaseDate;
	protected LocalDate lastServiceDate;
	protected LocalDate expireDate;

	protected BigDecimal	purchasePrice;
	protected BigDecimal	servicePrice;
	
	protected String	description;
	protected String	name;
	
	final protected DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy-MM-dd");

	public Part()
	{
		this.purchaseDate = LocalDate.now();
		this.lastServiceDate = LocalDate.now();
		this.expireDate = LocalDate.now().plusYears(1);  
	}



	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}



	public void setPurchaseDate(String purchaseDate) {
		try {
			this.purchaseDate = dtf.parseLocalDate(purchaseDate);
		} catch (IllegalArgumentException ia) {
			System.out.println("Coœ jest nie tak z formatem daty!");
		}
		catch (Exception e)
		{
			System.out.println("B³¹d parsowania daty!");
		}
	}



	public LocalDate getLastServiceDate() {
		return lastServiceDate;
	}



	public void setLastServiceDate(String lastServiceDate) {
		try {
			this.lastServiceDate = dtf.parseLocalDate(lastServiceDate);
		} catch (IllegalArgumentException ia) {
			System.out.println("Coœ jest nie tak z formatem daty!");
		}
		catch (Exception e)
		{
			System.out.println("B³¹d parsowania daty!");
		}
	}



	public LocalDate getExpireDate() {
		return expireDate;
	}



	public void setExpireDate(String expireDate) {
		try {
			this.expireDate = dtf.parseLocalDate(expireDate);
		} catch (IllegalArgumentException ia) {
			System.out.println("Coœ jest nie tak z formatem daty!");
		}
		catch (Exception e)
		{
			System.out.println("B³¹d parsowania daty!");
		}
	}



	public BigDecimal getPurchasePrice() {
		return purchasePrice;
	}



	public void setPurchasePrice(BigDecimal purchasePrice) {
		this.purchasePrice = purchasePrice.setScale(2, BigDecimal.ROUND_HALF_UP);
	}



	public BigDecimal getServicePrice() {
		return servicePrice;
	}



	public void setServicePrice(BigDecimal servicePrice) {
		this.servicePrice = servicePrice.setScale(2, BigDecimal.ROUND_HALF_UP);
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name.toUpperCase();
	}
	
	

}
