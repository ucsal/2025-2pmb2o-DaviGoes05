import java.util.Map;

import br.com.mariojp.solid.ocp.*;

public class Main {
	public static void main(String[] args) {
		var regularPolicy = new RegularPolicy();
		var premiumPolicy = new PremiumPolicy();
		var partnerPolicy = new PartnerPolicy();

		Map<CustomerType, DiscountPolicy> policies = Map.of(
			CustomerType.REGULAR, regularPolicy,
			CustomerType.PREMIUM, premiumPolicy,
			CustomerType.PARTNER, partnerPolicy
		);

		var calc = new DiscountCalculator(policies);
		System.out.println("REGULAR 100 -> " + calc.apply(100, CustomerType.REGULAR));
		System.out.println("PREMIUM 100 -> " + calc.apply(100, CustomerType.PREMIUM));
		System.out.println("PARTNER 100 -> " + calc.apply(100, CustomerType.PARTNER));
	}
}
