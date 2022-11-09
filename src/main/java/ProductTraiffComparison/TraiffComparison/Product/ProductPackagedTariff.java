package ProductTraiffComparison.TraiffComparison.Product;

/**
 * 
 * @author Roy
 *
 */
public class ProductPackagedTariff implements Product {

	@Override
	public String getProductName() {
		// TODO return- string constants (anti-patterns)
		return "Packaged tariff";  // Name- Product B
	}


	@Override
	public double calculationModel(int consumption) {

		//TODO:- Calculation: 800 € for up to 4000 kWh/year and above 4000 kWh/year "additionally" 30 cent/kWh. 

		double additionalCosts = 0;
		int additionalConsumption = consumption - 4000;
		if(additionalConsumption > 0)
			additionalCosts = additionalConsumption * 0.3;
		double result = 800 + additionalCosts;

		System.out.println(result);
		return result;
	}

}
