package com.sda.advanced.solution.zad7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

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
	void shouldShotInFiLoOrder() {
		//given
		JacketImpl jacket = new JacketImpl();
		String bullet1 = "Pierwszy nabój";
		jacket.loadBullet(bullet1);
		String bullet2 = "Drugi nabój";
		jacket.loadBullet(bullet2);
		String bullet3 = "Trzeci nabój";
		jacket.loadBullet(bullet3);

		//when
		//then
		assertEquals(bullet3, jacket.shot());
		assertEquals(bullet2, jacket.shot());
		assertEquals(bullet1, jacket.shot());
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