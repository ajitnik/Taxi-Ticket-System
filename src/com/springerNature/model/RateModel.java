package com.springerNature.model;

public class RateModel {

	private Integer kms;
	private Integer price;

	public RateModel(Integer i, Integer price) {
		super();
		this.kms = i;
		this.price = price;
	}

	public Integer getKms() {
		return kms;
	}

	public void setKms(Integer kms) {
		this.kms = kms;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

}
