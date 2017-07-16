package com.sundaydev.duck.webapp.auth;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.web.authentication.WebAuthenticationDetails;

public class DuckAuthenticationProvider implements AuthenticationProvider {

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {

		Collection<SimpleGrantedAuthority> roles = new ArrayList<SimpleGrantedAuthority>();
		
		WebAuthenticationDetails webAuthentication = (WebAuthenticationDetails) authentication.getDetails();
		
		//////////////////////////////////////////////////////////////////////////
		// 사용자인증 검증 사항 반
		//////////////////////////////////////////////////////////////////////////
		UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken("admin", "pwd1", roles);
		
		return authenticationToken;
	}

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return arg0.equals(UsernamePasswordAuthenticationToken.class);
	}

}
