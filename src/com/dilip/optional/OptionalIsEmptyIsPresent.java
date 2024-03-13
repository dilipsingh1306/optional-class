package com.dilip.optional;

import java.util.Optional;

public class OptionalIsEmptyIsPresent {

	public static void main(String[] args) {
		Optional<String> nameContainer = Optional.empty();
		System.out.println(nameContainer.isPresent() + " " + nameContainer.isEmpty());
		
		if (nameContainer.isPresent()) {
			System.out.println(nameContainer.get());
		}

		// works when getting Optional.empty();
		if (nameContainer.isEmpty()) {
			System.out.println("No Value Present ");
		}
	}

	public static Optional<String> getName() {

		// return Optional.of("Dilip Singh");

		// Return empty instead of null
		return Optional.empty();

	}
}
