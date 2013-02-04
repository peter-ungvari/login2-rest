package hu.jupi.teaching.login2rest;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;

public class LoginApplication extends Application {

	private Set<Object> singletons = new HashSet<Object>();
	
	public LoginApplication() {
		singletons.add(new LoginResource());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
	
}
