package com.sdi.rest;

import com.sdi.business.ResetService;
import com.sdi.infrastructure.Factories;

public class ResetServiceRestImpl implements ResetServiceRest {

	ResetService service = Factories.services.getResetService();

	@Override
	public void reset() {
		service.reset();
	}

}
