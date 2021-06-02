package com.springerNature.service;

import com.springerNature.model.TaxiTicket;

public interface CalculationService {

	TaxiTicket calculateTotalTravelCost(String source, String destination, Integer travellers, Integer distance);

}
