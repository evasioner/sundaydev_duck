package com.sundaydev.duck.beans;

import java.util.Locale;

public class DuckSession {

	protected DuckUser duckUser = null;
	protected long remoteIpAdrr = 0L;
	
	protected String sessionId = "defualt";
	protected String token = null;
	
	protected Locale locale = Locale.getDefault();

	public DuckUser getDuckUser() {
		return duckUser;
	}

	public void setDuckUser(DuckUser duckUser) {
		this.duckUser = duckUser;
	}

	public long getRemoteIpAdrr() {
		return remoteIpAdrr;
	}

	public void setRemoteIpAdrr(long remoteIpAdrr) {
		this.remoteIpAdrr = remoteIpAdrr;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}
	
	
	
}
