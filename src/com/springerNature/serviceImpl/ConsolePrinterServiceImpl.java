package com.springerNature.serviceImpl;

import com.springerNature.model.TaxiTicket;
import com.springerNature.service.PrinterService;

public class ConsolePrinterServiceImpl implements PrinterService {

	@Override
	public void generate(TaxiTicket taxiTicket) {
		System.out.println("Source			:	" + taxiTicket.getSource());
		System.out.println("Destination		:	" + taxiTicket.getDestination());
		System.out.println("KMs			:	" + taxiTicket.getKms());
		System.out.println("No. Of Travellers	:	" + taxiTicket.getTravellers());
		System.out.println("Total			:	" + taxiTicket.getTotal());
	}

}
