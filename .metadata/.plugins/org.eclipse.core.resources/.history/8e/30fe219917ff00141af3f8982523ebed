package com.sdi.business.impl;

import javax.ejb.Stateless;

import com.sdi.business.impl.classes.reset.Reset;

@Stateless
public class EjbResetService implements RemoteResetService, LocalResetService {

	@Override
	public void reset() {
		new Reset().reset();
	}

}
