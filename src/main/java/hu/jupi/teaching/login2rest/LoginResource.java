package hu.jupi.teaching.login2rest;

import com.sun.jersey.api.core.InjectParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/login")
@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
@Produces(MediaType.APPLICATION_JSON)
public class LoginResource {

	public LoginResource() {
	}

	@POST
	public LoginResponse login(@InjectParam LoginRequest requestData) {
		LoginResponse response;
		if (requestData != null && "alma@korte.hu".equals(requestData.getEmail())
				&& "alma".equals(requestData.getPassword())) {
			response = LoginResponse.getSuccess();
		} else {
			response = LoginResponse.getError();
		}
		return response;
	}
	
}
