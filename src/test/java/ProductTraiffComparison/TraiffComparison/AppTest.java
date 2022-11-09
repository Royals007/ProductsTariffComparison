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

	private Product product;

	@BeforeEach
	void setUp() throws Exception {
		product = new ProductPackagedTariff();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		//fail("Not yet implemented");
	}

	@Test
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
