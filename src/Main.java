import java.math.*;


public class Main {
    public static void main(String[] args) {
        BigDecimal Price_before_VAT = new BigDecimal("9.99");

        System.out.println("Price without VAT:" + Price_before_VAT);

        BigDecimal vatRate =new BigDecimal("0.23");


        BigDecimal Price_WithVAT = Price_before_VAT.multiply(BigDecimal.ONE.add(vatRate));
        System.out.println("Price with VAT:" + Price_WithVAT);


        BigDecimal totalExcludingVAT = Price_before_VAT.multiply(new BigDecimal("10000"));
        BigDecimal bg2 = Price_WithVAT.setScale(2, RoundingMode.FLOOR);

        System.out.println("Value with VAT : " + bg2);
        System.out.println("Value without VAT : " + totalExcludingVAT);


        int comparison = Price_WithVAT.compareTo(totalExcludingVAT);
        if (comparison > 0) {
            System.out.println("Price with VAT is greater than Value without VAT.");
        } else if (comparison < 0) {
            System.out.println("Value without VAT is greater than Gross Value.");
        } else {
            System.out.println("Price with VAT is equal to Value with VAT");
        }

    }
}
