package com.dilip.optional;

import java.util.Optional;

public class OptionalEmpty {
	public static void main(String[] args) {
		Optional<String> value = Optional.empty();
		
		System.out.println(value);
		//Throws Exception java.util.NoSuchElementException: when No value present
		System.out.println(value.get());
	}
}
