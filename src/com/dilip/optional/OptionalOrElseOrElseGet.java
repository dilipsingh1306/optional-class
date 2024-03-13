package com.dilip.optional;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalOrElseOrElseGet {

	public static void main(String[] args) {

		Optional<String> nameContainer = getName();
		System.out.println(nameContainer);
		
		
		//or:
		//If a value is present, returns an Optional describing the value,
		//otherwise returns an Optional produced by the supplying function.
		String result = nameContainer.or(() -> Optional.of("Dilip Singh")).get();
		System.out.println(result);

		// orElse :
		// If Value Presents returns available value,
		// If empty returns configured value inside orElse()
		result = nameContainer.orElse("Dilip Singh When Empty Result");
		System.out.println(result);

		// orElseGet : with Supplier 
		// If Value Presents returns available value,
		// If empty, returns value from Supplier Function configured inside orElseGet()
		Supplier<String> supplier = () -> "Dilip Singh From Supplier When Empty Result";
		result = nameContainer.orElseGet(supplier);
		System.out.println(result);

		// orElseThrow :
		// If Value Presents returns available value,
		// If empty, throws No value present Exception
		result = nameContainer.orElseThrow();
		System.out.println(result);

		// orElseThrow : with Supplier 
		// If Value Presents returns available value,
		// If empty, throws an exception defined by Supplier
		Supplier<Exception> exSupplier = () -> new Exception("No Value inside Optinal");
		try {
			result = nameContainer.orElseThrow(exSupplier);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(result);
	}

	public static Optional<String> getName() {

		//return Optional.of("Dilip Singh");

		// Return empty instead of null
		return Optional.empty();

		// TODO : Don't return null.
		// return null;
	}

}
