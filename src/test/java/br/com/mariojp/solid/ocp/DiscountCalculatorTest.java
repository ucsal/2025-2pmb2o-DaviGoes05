package br.com.mariojp.solid.ocp;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiscountCalculatorTest {
    @Test
    void premium_gets_10_percent(){
        Map<CustomerType, DiscountPolicy> policies = new HashMap<>();
        policies.put(CustomerType.PREMIUM, new PremiumPolicy());
        DiscountCalculator calc = new DiscountCalculator(policies);

        assertEquals(90.0, calc.apply(100.0, CustomerType.PREMIUM), 0.0001);
    }
    }

