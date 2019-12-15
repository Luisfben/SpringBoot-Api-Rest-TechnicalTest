package com.hackerrank.challenges.model;

public class ResponsePayment {

	private String us;

	private String india;

	private String china;

	private String francia;
	
	public ResponsePayment(String us, String india, String china, String francia) {
		this.us = us;
		this.india = india;
		this.china = china;
		this.francia = francia;
	}

	public String getUs() {
		return us;
	}

	public void setUs(String us) {
		this.us = us;
	}

	public String getIndia() {
		return india;
	}

	public void setIndia(String india) {
		this.india = india;
	}

	public String getChina() {
		return china;
	}

	public void setChina(String china) {
		this.china = china;
	}

	public String getFrancia() {
		return francia;
	}

	public void setFrancia(String francia) {
		this.francia = francia;
	}

}
