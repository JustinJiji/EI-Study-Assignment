public class Stock extends Subject {
    private float price;

    public void setPrice(float price) {
        this.price = price;
        notifyClient();
    }

    public float getPrice() {
        return price;
    }

    @Override
    public void notifyClient() {
        for (Client client : clients) {
            try {
                client.update(price);
            } catch (Exception e) {
                logger.warning("Error notifying client: " + e.getMessage());
            }
        }
    }
}
