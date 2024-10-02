import java.util.logging.Logger;

public class StockClient implements Client {
    private final String clientName;
    private static final Logger logger = Logger.getLogger(StockClient.class.getName());

    public StockClient(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public void update(float price) {
        logger.info(clientName + " notified. New Stock Price: " + price);
        System.out.println(clientName + " received updated price: " + price);
    }
}
