package ProductTraiffComparison.TraiffComparison;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ProductTraiffComparison.TraiffComparison.Product.Product;
import ProductTraiffComparison.TraiffComparison.Product.ProductBasicTariff;
import ProductTraiffComparison.TraiffComparison.Product.ProductPackagedTariff;
import ProductTraiffComparison.TraiffComparison.Tariff.Tariff;
import ProductTraiffComparison.TraiffComparison.Tariff.TariffCompare;


class AppTest {

	private Product basicProductTraiff;
	private Product packagedProductTraiff;

	@BeforeEach
	void setUp() throws Exception {
		
		basicProductTraiff = new ProductBasicTariff();
		packagedProductTraiff = new ProductPackagedTariff();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	// ValidInput
	void testValidInput() {
		int consumption = 3000;
		assertEquals(consumption, 3000);
	}
	
	@Test
	void testInvalidInput() {
		int consumption = 3000;
		assertNotEquals(consumption, 4000);
	}
	
	
	@Test
	// basicProductcalConsumption
	void testBasicCalculateConsumption() {
		int consumption = 3500;
		int expectedCostsYearly = 830;
		Tariff tariff = new Tariff(basicProductTraiff, consumption);
		assertEquals(tariff.getAnnualCosts(),expectedCostsYearly);
	}
	
	@Test
	// packagedCalConsumption
	void testPackagedConsumptionCalculate() {
		int consumption = 4000;
		double expectedCostsYearly = 800.0;
		Tariff tariff = new Tariff(packagedProductTraiff, consumption);
		assertEquals(tariff.getAnnualCosts(),expectedCostsYearly);
	}


	@Test
	// CalculationSortedYearly
	void sortedTariffByAnnualCosts() {
		ProductBasicTariff productBasicTariff = new ProductBasicTariff();
		TariffCompare tariffs = new TariffCompare();
		tariffs.add(new Tariff(productBasicTariff, 2000));
		tariffs.add(new Tariff(productBasicTariff, 500));
		List<Tariff> sortedTariff = tariffs.sortByAnnualCosts().collect(Collectors.toList());
		assertThat(sortedTariff.get(0).getAnnualCosts())
					.isLessThan(sortedTariff.get(1).getAnnualCosts());
	}
}
