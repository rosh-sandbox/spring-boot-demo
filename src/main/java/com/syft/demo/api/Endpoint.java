package com.syft.demo.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.springframework.stereotype.Component;

@Component
@Path("/test")
public class Endpoint {
	
	@GET
	public String message() {
		return "Hello";
	}

}
