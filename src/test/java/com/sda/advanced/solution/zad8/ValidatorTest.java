package com.sda.advanced.solution.zad8;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class ValidatorTest {

	@ParameterizedTest
	@MethodSource("validators")
	void shouldValidateStandardParcel(Validator validator) {
		assertTrue(validator.validate(new Parcel(31, 32, 33, 19.0f, false)));
	}

	@ParameterizedTest
	@MethodSource("validators")
	void shouldValidateExpressParcel(Validator validator) {
		assertTrue(validator.validate(new Parcel(31, 32, 33, 14.0f, true)));
	}

	@ParameterizedTest
	@MethodSource("validators")
	void shouldDetectTooBigSumOfLengths(Validator validator) {
		assertFalse(validator.validate(new Parcel(150, 150, 1, 14.0f, false)));
		assertFalse(validator.validate(new Parcel(305, 1, 1, 14.0f, false)));
	}

	@ParameterizedTest
	@MethodSource("validators")
	void shouldDetectTooSmallDimensions(Validator validator) {
		assertFalse(validator.validate(new Parcel(29, 31, 32, 14.0f, false)));
		assertFalse(validator.validate(new Parcel(31, 29, 32, 14.0f, false)));
		assertFalse(validator.validate(new Parcel(30, 31, 29, 14.0f, false)));
	}

	@ParameterizedTest
	@MethodSource("validators")
	void shouldDetectTooHeavyStandardParcel(Validator validator) {
		assertFalse(validator.validate(new Parcel(31, 32, 33, 31.0f, false)));
	}

	@ParameterizedTest
	@MethodSource("validators")
	void shouldDetectTooHeavyExpressParcel(Validator validator) {
		assertFalse(validator.validate(new Parcel(31, 32, 33, 16.0f, true)));
	}

	public static Stream<Validator> validators() {
		return Stream.of(

		);
	}
}