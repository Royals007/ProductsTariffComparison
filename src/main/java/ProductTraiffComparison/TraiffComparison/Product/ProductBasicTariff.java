package ProductTraiffComparison.TraiffComparison.Product;

/**
 * 
 * @author Roy
 *
 */
public class ProductBasicTariff implements Product {

	@Override
	public String getProductName() {
		// TODO return- string constants (anti-patterns)
		return "basic electricity tariff"; // Name- Product A
	}


	@Override
	public double calculationModel(int consumption) {

		//TODO:- Calculation: base costs per year 60€ + consumption costs 22 cent/kWh (*). 

		consumption = consumption > 0 ? consumption : 0;
		double baseCostsPerYear = 60;
		double consumptionCosts = consumption * 0.22;
		double result = baseCostsPerYear + consumptionCosts;

		System.out.println(result);
		return result;
	}

}
