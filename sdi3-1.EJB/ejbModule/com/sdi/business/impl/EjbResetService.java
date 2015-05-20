package com.sdi.business.impl;

import javax.ejb.Stateless;
import javax.jws.WebService;

import com.sdi.business.impl.classes.reset.Reset;

@Stateless
@WebService(name = "ResetService")
public class EjbResetService implements RemoteResetService, LocalResetService {

	@Override
	public void reset() {
		new Reset().reset();
	}

}
