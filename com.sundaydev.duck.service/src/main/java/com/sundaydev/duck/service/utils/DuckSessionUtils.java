package com.sundaydev.duck.service.utils;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

import com.sundaydev.duck.beans.DuckSession;

public class DuckSessionUtils {

	public static DuckSession getSession()
	{
		DuckSession duckSession = null;
		
		SecurityContext securityContext = SecurityContextHolder.getContext();
		Authentication authentication = securityContext.getAuthentication();
		
		duckSession = (DuckSession)authentication.getDetails();
		
		return duckSession;
		
		
	}
	
}
