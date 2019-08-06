package com.bae.service;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class PrizeGenServiceTest {

	private static PrizeGenServiceImpl service;

	private static final String ACCOUNT_NUMBER_A6 = "A123456";
	private static final String ACCOUNT_NUMBER_A8 = "A12345678";
	private static final String ACCOUNT_NUMBER_A10 = "A0123456789";
	private static final String ACCOUNT_NUMBER_B6 = "B123456";
	private static final String ACCOUNT_NUMBER_B8 = "B12345678";
	private static final String ACCOUNT_NUMBER_B10 = "B0123456789";
	private static final String ACCOUNT_NUMBER_C6 = "C123456";
	private static final String ACCOUNT_NUMBER_C8 = "C12345678";
	private static final String ACCOUNT_NUMBER_C10 = "C0123456789";

	@BeforeClass
	public static void setup() {
		service = new PrizeGenServiceImpl();
	}

	@Test
	public void testAccountNumberA() {
		assertEquals(0, service.generatePrize(ACCOUNT_NUMBER_A6));
		assertEquals(0, service.generatePrize(ACCOUNT_NUMBER_A8));
		assertEquals(0, service.generatePrize(ACCOUNT_NUMBER_A10));
	}

	@Test
	public void testAccountNumberB() {
		assertEquals(50, service.generatePrize(ACCOUNT_NUMBER_B6));
		assertEquals(500, service.generatePrize(ACCOUNT_NUMBER_B8));
		assertEquals(5000, service.generatePrize(ACCOUNT_NUMBER_B10));
	}

	@Test
	public void testAccountNumberC() {
		assertEquals(100, service.generatePrize(ACCOUNT_NUMBER_C6));
		assertEquals(750, service.generatePrize(ACCOUNT_NUMBER_C8));
		assertEquals(10000, service.generatePrize(ACCOUNT_NUMBER_C10));
	}

}
