package com.springerNature.serviceImpl;

import com.springerNature.model.TaxiTicket;
import com.springerNature.service.CalculationService;

public class CalculationServiceImpl implements CalculationService {

	static final Integer FIXED_KMS = 100;
	static final Integer FIXED_COST = 750;

	static final Integer POST_FIXED_KMS = 1;
	static final Integer POST_FIXED_COST = 5;

	@Override
	public TaxiTicket calculateTotalTravelCost(String source, String destination, Integer travellers,
			Integer distance) {
		float travelCost = 0;
		int remainTravelDistance = distance;
		remainTravelDistance = remainTravelDistance - FIXED_KMS;

		if (remainTravelDistance > 0)
			travelCost = (FIXED_COST + ((remainTravelDistance / POST_FIXED_KMS) * POST_FIXED_COST)) * travellers;
		else
			travelCost = FIXED_COST * travellers;

		return new TaxiTicket(source, destination, distance, travellers, travelCost);
	}

}
