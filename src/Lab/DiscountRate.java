package Lab;

public class DiscountRate {
    private static final double serviceDiscountPremium = 0.2;
    private static final double serviceDiscountGold = 0.15;
    private static final double serviceDiscountSilver = 0.1;
    private static final double productDiscountPremium = 0.1;
    private static final double productDiscountGold = 0.1;
    private static final double productDiscountSilver = 0.1;

    public double getServiceDiscountRate(String type) {
        if (type == "Premium service") {
            return serviceDiscountPremium;
        }
        else if (type == "Gold service") {
            return serviceDiscountGold;
        }
        else if (type == "Silver service"){
            return serviceDiscountSilver;
        }
        else {
            return 0;
        }
    }

    public double getProductDiscountRate(String type) {
        if (type == "Premium product") {
            return productDiscountPremium;
        }
        else if (type == "Gold product") {
            return productDiscountGold;
        }
        else if (type == "Silver product"){
            return productDiscountSilver;
        }
        else {
            return 0;
        }
    }
}
