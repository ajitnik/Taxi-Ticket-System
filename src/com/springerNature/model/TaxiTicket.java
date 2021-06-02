package com.springerNature.model;

public class TaxiTicket {

	private String source;
	private String destination;
	private Integer kms;
	private Integer travellers;
	private Float total;

	public TaxiTicket(String source, String destination, Integer kms, Integer travellers, Float total) {
		super();
		this.source = source;
		this.destination = destination;
		this.kms = kms;
		this.travellers = travellers;
		this.total = total;
	}

	public String getSource() {
		return source;
	}

	public String getDestination() {
		return destination;
	}

	public Integer getKms() {
		return kms;
	}

	public Integer getTravellers() {
		return travellers;
	}

	public Float getTotal() {
		return total;
	}

}
