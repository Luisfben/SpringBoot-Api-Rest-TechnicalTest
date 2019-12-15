package com.hackerrank.challenges.service;

import com.hackerrank.challenges.model.ResponseCurrencyFormatter;

public interface CurrencyFormatterService {

	public abstract ResponseCurrencyFormatter execute(double payment);

}
