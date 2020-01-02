package com.hackerrank.challenges.impl;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.hackerrank.challenges.exception.PaymentValueNotAllowedException;
import com.hackerrank.challenges.model.RequestCurrencyFormatter;
import com.hackerrank.challenges.model.ResponseCurrencyFormatter;
import com.hackerrank.challenges.service.CurrencyFormatterService;

@Service
public class CurrencyFormatterServiceImpl implements CurrencyFormatterService {

	@Override
	public ResponseCurrencyFormatter execute(RequestCurrencyFormatter payment) {

		double p = payment.getPayment();

		/*1e9 express numbers in scientific notation 10ˆ9*/

		if (!(p >= 0 && p <= 1e9)) {
			throw new PaymentValueNotAllowedException(String.valueOf(p));
		}

		if (!(p >= 0 && p <= 1e9)) {
			throw new PaymentValueNotAllowedException(String.valueOf(p));
		}

		AtomicInteger aInt1 = new AtomicInteger(0);
		AtomicInteger aInt2 = new AtomicInteger(0);

		if (aInt1.equals(aInt2)) { 
			System.out.println("Noncompliant");
		}  
		
		Locale indiaLocale = new Locale("en", "IN");

		NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
		NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

		return new ResponseCurrencyFormatter(us.format(p), india.format(p), china.format(p), france.format(p));
	}

}
