package com.dilip.optional;

import java.util.Optional;

public class OptionalOfAndOfNullable {

	public static void main(String[] args) {

		// This should be used when we are assigning a value to Optional.
		// If null value  passed, then NullPointerException will be thrown 
		// If not null value passed, then determined value Optional will be returned.

		//Optional<String> value1 = Optional.of("Dilip Singh");
		Optional<String> value1 = Optional.of(null); //Null Pinter Exception
		System.out.println(value1);

		// This should be used when we are assigning a value to Optional.
		// If value null passed, then empty Optional will be returned.
		// If value not null passed, then determined value Optional will be returned.
		Optional<String> value2 = Optional.ofNullable("Dilip Singh");
		//Optional<String> value2 = Optional.ofNullable(null); // Returns Empty Optional
		System.out.println(value2);

	}

}
