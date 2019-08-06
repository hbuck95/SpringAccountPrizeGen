package com.bae.service;

import org.springframework.stereotype.Service;

@Service
public class PrizeGenServiceImpl implements PrizeGenService {

	@Override
	public int generatePrize(String accountNumber) {
		System.out.println(accountNumber);
		char letter = accountNumber.charAt(0);
		int length = accountNumber.length() - 1;

		switch (letter) {

		case 'A':
			return 0;

		case 'B':
			switch (length) {
			case 6:
				return 50;
			case 8:
				return 500;
			case 10:
				return 5000;
			}

			break;

		case 'C':

			switch (length) {
			case 6:
				return 100;
			case 8:
				return 750;
			case 10:
				return 10000;
			}

			break;

		default:
			return -1;
		}
		return -1;

	}

}
