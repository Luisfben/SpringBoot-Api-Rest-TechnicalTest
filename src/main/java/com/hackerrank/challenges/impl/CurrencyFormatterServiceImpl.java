package com.hackerrank.challenges.impl;

import java.text.NumberFormat;
import java.util.Locale;

import org.springframework.stereotype.Service;

import com.hackerrank.challenges.model.ResponseCurrencyFormatter;
import com.hackerrank.challenges.service.CurrencyFormatterService;

@Service
public class CurrencyFormatterServiceImpl implements CurrencyFormatterService {

	@Override
	public ResponseCurrencyFormatter execute(double payment) {
		Locale indiaLocale = new Locale("en", "IN");

		NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
		NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

		return new ResponseCurrencyFormatter(us.format(payment), india.format(payment), china.format(payment),
				france.format(payment));
	}

}
