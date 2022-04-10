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
		jacket.loadBullet("Pierwszy nabój");

		//when
		boolean loaded = jacket.isLoaded();

		//then
		assertTrue(loaded);
	}

	@Test
	void shouldShot() {
		//given
		JacketImpl jacket = new JacketImpl();
		String bullet = "Pierwszy nabój";
		jacket.loadBullet(bullet);

		//when
		String shot = jacket.shot();

		//then
		assertEquals(bullet, shot);
	}
}