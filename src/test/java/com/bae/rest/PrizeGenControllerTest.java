package com.bae.rest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.service.PrizeGenServiceImpl;

@RunWith(SpringRunner.class)
public class PrizeGenControllerTest {

	@Mock
	private PrizeGenServiceImpl service;

	@InjectMocks
	private PrizeGenController controller;

	private static final String ACCOUNT_NUMBER_A6 = "A123456";
	private static final String ACCOUNT_NUMBER_A8 = "A12345678";
	private static final String ACCOUNT_NUMBER_A10 = "A0123456789";
	private static final String ACCOUNT_NUMBER_B6 = "B123456";
	private static final String ACCOUNT_NUMBER_B8 = "B12345678";
	private static final String ACCOUNT_NUMBER_B10 = "B0123456789";
	private static final String ACCOUNT_NUMBER_C6 = "C123456";
	private static final String ACCOUNT_NUMBER_C8 = "C12345678";
	private static final String ACCOUNT_NUMBER_C10 = "C0123456789";

	@Test
	public void generatePrizeTestA() {
		Mockito.when(service.generatePrize(ACCOUNT_NUMBER_A6)).thenReturn(0);
		assertEquals(0, controller.generatePrize(ACCOUNT_NUMBER_A6));
		Mockito.verify(service).generatePrize(ACCOUNT_NUMBER_A6);

		Mockito.when(service.generatePrize(ACCOUNT_NUMBER_A8)).thenReturn(0);
		assertEquals(0, controller.generatePrize(ACCOUNT_NUMBER_A8));
		Mockito.verify(service).generatePrize(ACCOUNT_NUMBER_A8);

		Mockito.when(service.generatePrize(ACCOUNT_NUMBER_A10)).thenReturn(0);
		assertEquals(0, controller.generatePrize(ACCOUNT_NUMBER_A10));
		Mockito.verify(service).generatePrize(ACCOUNT_NUMBER_A10);
	}

	@Test
	public void generatePrizeTestB() {
		Mockito.when(service.generatePrize(ACCOUNT_NUMBER_B6)).thenReturn(50);
		assertEquals(50, controller.generatePrize(ACCOUNT_NUMBER_B6));
		Mockito.verify(service).generatePrize(ACCOUNT_NUMBER_B6);

		Mockito.when(service.generatePrize(ACCOUNT_NUMBER_B8)).thenReturn(500);
		assertEquals(500, controller.generatePrize(ACCOUNT_NUMBER_B8));
		Mockito.verify(service).generatePrize(ACCOUNT_NUMBER_B8);

		Mockito.when(service.generatePrize(ACCOUNT_NUMBER_B10)).thenReturn(5000);
		assertEquals(5000, controller.generatePrize(ACCOUNT_NUMBER_B10));
		Mockito.verify(service).generatePrize(ACCOUNT_NUMBER_B10);
	}

	@Test
	public void generatePrizeTestC() {
		Mockito.when(service.generatePrize(ACCOUNT_NUMBER_C6)).thenReturn(100);
		assertEquals(100, controller.generatePrize(ACCOUNT_NUMBER_C6));
		Mockito.verify(service).generatePrize(ACCOUNT_NUMBER_C6);

		Mockito.when(service.generatePrize(ACCOUNT_NUMBER_C8)).thenReturn(750);
		assertEquals(750, controller.generatePrize(ACCOUNT_NUMBER_C8));
		Mockito.verify(service).generatePrize(ACCOUNT_NUMBER_C8);

		Mockito.when(service.generatePrize(ACCOUNT_NUMBER_C10)).thenReturn(10000);
		assertEquals(10000, controller.generatePrize(ACCOUNT_NUMBER_C10));
		Mockito.verify(service).generatePrize(ACCOUNT_NUMBER_C10);
	}

}