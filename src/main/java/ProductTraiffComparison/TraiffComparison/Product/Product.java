package ProductTraiffComparison.TraiffComparison.Product;

/**
 *  Differentiate the tariff annual cost for two products (product-basic, -packaged tariff)
 */
public interface Product {

     public String getProductName();
	
	/**
     * calculationModel- implemented for annual cost
	 * @param consumption
	 * @return
	 */
 	public double calculationModel(int consumption);
	
}
