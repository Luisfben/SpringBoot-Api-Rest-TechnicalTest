package com.hackerrank.challenges.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hackerrank.challenges.model.RequestPayment;
import com.hackerrank.challenges.model.ResponsePayment;
import com.hackerrank.challenges.service.CurrencyFormatterService;

@RestController
public class CurrencyFormatterController {

	@Autowired
	CurrencyFormatterService currencyFormatterService;

  	@PostMapping("/currencyformatter")
	public ResponsePayment currencyformatter(@RequestBody RequestPayment payment) {
		return currencyFormatterService.ejecute(payment.getPayment());
	}
 
}