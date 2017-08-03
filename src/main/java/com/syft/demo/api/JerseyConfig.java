package com.syft.demo.api;

import org.glassfish.jersey.server.ResourceConfig;

public class JerseyConfig extends ResourceConfig {
	
	public JerseyConfig() {
		register(Endpoint.class);
	}

}
