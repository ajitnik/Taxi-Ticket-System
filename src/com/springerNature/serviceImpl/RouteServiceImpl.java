package com.springerNature.serviceImpl;

import java.util.HashMap;
import java.util.Map;

import com.springerNature.model.RouteModel;
import com.springerNature.service.RouteService;

public class RouteServiceImpl implements RouteService {

	static Map<RouteModel, Integer> routemap = new HashMap<RouteModel, Integer>();

	@Override
	public void addInitialRouteData() {
		routemap.put(new RouteModel("Pune", "Mumbai"), 120);
		routemap.put(new RouteModel("Pune", "Nashik"), 200);
		routemap.put(new RouteModel("Mumbai", "Goa"), 350);
		routemap.put(new RouteModel("Mumbai", "Nashik"), 180);

	}

	@Override
	public Integer getRoute(String source, String destination) {

		Integer route = routemap.get(new RouteModel(source, destination));
		if (route == null)
			route = routemap.get(new RouteModel(destination, source));
		return route;

	}

}
