package ProductTraiffComparison.TraiffComparison;

import java.util.Scanner;

import ProductTraiffComparison.TraiffComparison.Product.ProductBasicTariff;
import ProductTraiffComparison.TraiffComparison.Product.ProductPackagedTariff;
import ProductTraiffComparison.TraiffComparison.Tariff.Tariff;
import ProductTraiffComparison.TraiffComparison.Tariff.TariffCompare;



public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Enter your annual consumption (kWh/year): ");

		Scanner s = new Scanner(System.in);
		int consumption = 0;
		while (true) {
			try {
				if (s.hasNextInt()) {
					consumption = s.nextInt();
					if (consumption > 0) {
						System.out.println("Thank you, Valid Input Entered!");

						TariffCompare tc = new TariffCompare();
						tc.add(new Tariff(new ProductBasicTariff(), consumption));
						tc.add(new Tariff(new ProductPackagedTariff(), consumption));
						tc.sortByAnnualCosts().forEach(System.out::println);
						break;

					}else {
						System.out.println("The Consumption Value should be >= 0. ");
						s.next();
					}

				} else {
					System.out.println("Interger values are only accepted! " + 
										"\n please try again..... ");
					break;
				}
			}catch (NumberFormatException e) {
				//System.out.println("Invalid");
				e.printStackTrace();
			}
		}

    }
}
