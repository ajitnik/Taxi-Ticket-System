package com.springerNature;

import com.springerNature.model.TaxiTicket;
import com.springerNature.service.CalculationService;
import com.springerNature.service.PrinterService;
import com.springerNature.service.RouteService;
import com.springerNature.serviceImpl.CalculationServiceImpl;
import com.springerNature.serviceImpl.ConsolePrinterServiceImpl;
import com.springerNature.serviceImpl.PDFPrinterServiceImpl;
import com.springerNature.serviceImpl.RouteServiceImpl;

public class TaxiTicketSystem {

	public static void main(String[] args) {

		RouteService routeService = new RouteServiceImpl();
		CalculationService calculationService = new CalculationServiceImpl();
		PrinterService console = new ConsolePrinterServiceImpl();
		PrinterService pdf = new PDFPrinterServiceImpl();
		TaxiTicket taxiTicket;
		
		// Add initial route config data
		routeService.addInitialRouteData();

		// User Input Data
		String source = "Pune";
		String destination = "Mumbai";
		Integer travellers = 2;

		// Get distance based on source and destination
		Integer distance = routeService.getRoute(source, destination);

		// Calculate the cost for traveling
		if (distance > 0)
			taxiTicket = calculationService.calculateTotalTravelCost(source, destination, travellers, distance);
		else {
			System.out.println("Travel Distance Should Be Greater Than 0");
			taxiTicket = null;
		}

		// Generate console log
		if (taxiTicket != null)
			console.generate(taxiTicket);

		// Generate Pdf file
		if (taxiTicket != null)
			pdf.generate(taxiTicket);

	}

}
