package com.dilip.optional;

import java.util.Optional;

public class OptionalIfPresentOrElse {

	public static void main(String[] args) {

		Optional<String> nameContainer = getName();
		System.out.println(nameContainer);
		
		//ifPresent
		nameContainer.ifPresent(name -> System.out.println(name.toUpperCase()));

		//ifPresentOrElse
		nameContainer.ifPresentOrElse(
				//If Value Presented 
				(val) -> {
						//Logic
						System.out.println("Value Presented : " + val.toUpperCase());
					}, 
				//If Value Not Presented 
				() -> {
					//Logic
					System.out.println("Value Not Avilable");
				}
		);

	}

	public static Optional<String> getName() {

		//return Optional.of("Dilip Singh");

		// Return empty instead of null
		return Optional.empty();

		// TODO : Don't return null.
		// return null;
	}

}
