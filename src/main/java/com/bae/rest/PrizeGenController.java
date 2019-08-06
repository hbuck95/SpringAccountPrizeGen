package com.bae.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.service.PrizeGenService;
import com.bae.service.PrizeGenServiceImpl;

@RestController
@RequestMapping("/prizegen")
public class PrizeGenController {
	private PrizeGenService service;

	@Autowired
	public PrizeGenController(PrizeGenServiceImpl service) {
		this.service = service;
	}

	@GetMapping("/{accountNumber}")
	public int generatePrize(@PathVariable String accountNumber) {
		return service.generatePrize(accountNumber);
	}

}
