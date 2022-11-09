package ProductTraiffComparison.TraiffComparison.Tariff;

import java.text.NumberFormat;
import java.util.Locale;
import ProductTraiffComparison.TraiffComparison.Product.Product;


/**
 * 
 * @author Roy
 *
 */
public class Tariff {

	private String name;
	private double annualCosts;
	
	/**
	 * Construtor
	 * @param product
	 * @param consumption
	 */
	public Tariff(Product product, int consumption) {
		this.name = product.getProductName(); // get the name of product
		this.annualCosts = product.calculationModel(consumption);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAnnualCosts() {
		return annualCosts;
	}

	public void setAnnualCosts(double annualCosts) {
		this.annualCosts = annualCosts;
	}

	@Override
	public String toString() {
		NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("de", "DE"));
		return "Tariff - [Product_name : " + name + ", Annual_Costs : " + formatter.format(annualCosts) + "]";
	}
	
}
