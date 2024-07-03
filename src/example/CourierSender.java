package example;

// contract to send courier
public abstract class CourierSender {

    // send a courier to desired pincode
    public abstract void sendCourier(String pincode);

    // calculate the fees to send courier to pincode
    public abstract double calculateFees(String pincode);

    // sending the courier to desired pincode is feasible or not
    public abstract boolean isFeasible(String pincode);

    // get instance of courier sender based on type
    public static CourierSender getCourierSender(String type) {
        if ("fedex".equalsIgnoreCase(type)) {
            return new FedEx();
        } else if ("dhl".equalsIgnoreCase(type)) {
            return new Dhl();
        }
        throw new IllegalArgumentException("invalid courier sender type");
    }
}
