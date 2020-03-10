package br.com.thomas.tests;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import br.com.thomas.entities.Store;

class StoreTest {
	Store s = new Store();
	
	@Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
	@Test
	void loadingTest() {
		s.generateSales();
	}
	@Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
	@Test
	void loadingTest1() {
		s.generateSales();
	}
	
	@Disabled
	@Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
	@Test
	void loadingTest2() {
		s.generateSales();
	}

	
}
