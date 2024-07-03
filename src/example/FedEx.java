package example;

// send a courier using fedex
public class FedEx extends CourierSender {

    // courier sender name
    private static final String COURIER_SENDER_NAME = "FedEx";

    /**
     * {@inheritDoc}
     */
    @Override
    public void sendCourier(String pincode) {
        System.out.println("Sending courier to pincode ==> " + pincode + " using ==> " + COURIER_SENDER_NAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculateFees(String pincode) {
        return 10;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isFeasible(String pincode) {
        return true;
    }
}
