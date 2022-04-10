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

	@Test
	void shouldShotWithEmptyBulletWhenEmpty() {
		//given
		JacketImpl jacket = new JacketImpl();

		//when
		String shot = jacket.shot();

		//then
		assertEquals(Jacket.EMPTY, shot);
	}

	@Test
	void shouldShotWithEmptyBulletEventually() {
		//given
		JacketImpl jacket = new JacketImpl();
		jacket.loadBullet("anything");

		//when
		jacket.shot();
		String shot = jacket.shot();

		//then
		assertEquals(Jacket.EMPTY, shot);
	}

	@Test
	void shouldAlwaysShotWithEmptyBulletWhenEmpty() {
		//given
		JacketImpl jacket = new JacketImpl();

		//when
		//then
		assertEquals(Jacket.EMPTY, jacket.shot());
		assertEquals(Jacket.EMPTY, jacket.shot());
		assertEquals(Jacket.EMPTY, jacket.shot());
	}

	@Test
	void shouldThrowsExceptionWhenTryToLoadFullJacket() {
		int maxSize = 8;
		JacketImpl jacket = new JacketImpl(maxSize);

		for(int i = 0; i< maxSize; i++) {
			jacket.loadBullet(String.valueOf(i));
		}

		assertThrows(Exception.class, () -> jacket.loadBullet("8"));

	}
}