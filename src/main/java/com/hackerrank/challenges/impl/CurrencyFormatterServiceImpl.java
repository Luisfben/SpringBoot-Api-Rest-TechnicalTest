package com.hackerrank.challenges.impl;

import java.text.NumberFormat;
import java.util.Locale;

import org.springframework.stereotype.Service;

import com.hackerrank.challenges.model.ResponsePayment;
import com.hackerrank.challenges.service.CurrencyFormatterService;

@Service
public class CurrencyFormatterServiceImpl implements CurrencyFormatterService {

	@Override
	public ResponsePayment ejecute(double payment) {
		Locale indiaLocale = new Locale("en", "IN");

		NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
		NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat francia = NumberFormat.getCurrencyInstance(Locale.FRANCE);

		return new ResponsePayment(us.format(payment), india.format(payment), china.format(payment),
				francia.format(payment));
	}

}
