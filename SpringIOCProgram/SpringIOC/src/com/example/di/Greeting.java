
package com.example.di;

import java.util.Objects;

public class Greeting {

	private String message;

	public Greeting() {
		message = "Zero-argument constructor";

	}

	public Greeting(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Greeting [message=" + message + "]";
	}

	public String greet() {
		return message;
	}

	/*
	 * @Override public int hashCode() { return Objects.hash(message); }
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; Greeting other = (Greeting) obj; return Objects.equals(message,
	 * other.message); }
	 */

}
