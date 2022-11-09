package ProductTraiffComparison.TraiffComparison.Tariff;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;


public class TariffCompare extends ArrayList<Tariff> {

	/**
	 * sort annualCosts; represent in List format.
	 * @return sorted annualCost
	 */
	public Stream<Tariff> sortByAnnualCosts() {
		return this.stream().sorted(Comparator.comparing(Tariff::getAnnualCosts));
	}

}
