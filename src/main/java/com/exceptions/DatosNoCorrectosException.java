package com.exceptions;

public class DatosNoCorrectosException extends Exception {

	public DatosNoCorrectosException() {

	}

	public DatosNoCorrectosException(String message) {
		System.out.println(message);
	}

}