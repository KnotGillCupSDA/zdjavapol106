package com.sda.advanced.solution.zad7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JacketImplTest {

	@Test
	void shouldBeEmptyByDefault() {
		//given
		JacketImpl jacket = new JacketImpl();

		//when
		boolean loaded = jacket.isLoaded();

		//then
		assertFalse(loaded);
	}

	@Test
	void shouldNotBeEmptyAfterLoad() {
		//given
		JacketImpl jacket = new JacketImpl();

		//when
		jacket.loadBullet("Pierwszy nabój");
		boolean loaded = jacket.isLoaded();

		//then
		assertTrue(loaded);
	}

}