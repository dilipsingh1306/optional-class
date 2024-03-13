package com.dilip.optional;

import java.util.Optional;

public class OptionalFilter {

	public static void main(String[] args) {

		Optional<String> nameContainer = getName();

		String result = nameContainer.filter(
						name -> name.equals("Dilip Singh")
					).get();
		
		System.out.println(result);
		
		

	}

	public static Optional<String> getName() {

		return Optional.of("Dilip Singh");

		// Return empty instead of null
		// return Optional.empty();

	}

}
