package service_book.vehicle;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import service_book.vehicle.Part;

public class TestPart {

	@org.junit.Test
	public void testSetServicePrice() {
		Part part = new Part();
		part.setServicePrice(new BigDecimal("0.123"));
		Assert.assertEquals("0.12" ,part.getServicePrice().toString());

		part = new Part();
		part.setServicePrice(new BigDecimal("0.128"));
		Assert.assertEquals("0.13" ,part.getServicePrice().toString());

		part = new Part();
		part.setServicePrice(new BigDecimal("0.1"));
		Assert.assertEquals("0.10" ,part.getServicePrice().toString());
	}
}