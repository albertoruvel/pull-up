package com.pullup.app.resource;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.pullup.app.delegate.AccountDelegate;
import com.pullup.app.dto.request.CreatePullupRequest;

public class PullupRequestResource {
	 @Inject
	    private AccountDelegate delegate; 
	    @Path("registerPullupResource")
	    @POST
	    @Consumes("application/json")
	    @Produces("application/json")
	    public Response createPullupRequest(CreatePullupRequest request){
	        return delegate.registerPullupResource(request); 
	    }
}
