package com.example;

public class Welcome {

	private String welcomeMsg;

	public String getWelcomeMsg() {
		return welcomeMsg;
	}

	public void setWelcomeMsg(String welcomeMsg) {
		this.welcomeMsg = welcomeMsg;
	}

	@Override
	public String toString() {
		return "Welcome [welcomeMsg=" + welcomeMsg + "]";
	}
}
