package com.dilip.optional;

import java.util.Optional;

public class OptionalMapVsFlatmap {

	public static void main(String[] args) {

		Optional<String> nameContainer = getName();
		System.out.println(nameContainer);

		// map will return, Optional Object.
		String result = nameContainer.map(String::toUpperCase).get();
		System.out.println(result);

		System.out.println("flatMap************8");
		
		//one More Example, faltMap
		result = nameContainer.flatMap(s -> Optional.of(s)).get().toUpperCase();
		System.out.println(result);
		
		// flatMap will return, Optional Object.
		Optional<Optional<String>> nestedOptional = 
				Optional.of(Optional.of("Dilip Singh"));
		
		result  = nestedOptional.map(s -> s.get()).get().toUpperCase();
		System.out.println(result);
		
		result  = nestedOptional.flatMap(s -> s).get().toUpperCase();
		System.out.println(result);
	

	}

	public static Optional<String> getName() {

		return Optional.of("Dilip Singh");

		// Return empty instead of null
		// return Optional.empty();

		// TODO : Don't return null.
		// return null;
	}

}
