public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();

        Client client1 = new StockClient("Client 1");
        Client client2 = new StockClient("Client 2");

        
        stock.subscribe(client1);
        stock.subscribe(client2);

        // Simulating price change
        stock.setPrice(100.5f);
        stock.setPrice(105.75f);

        stock.unsubscribe(client1);

        // Simulating another price change
        stock.setPrice(110.0f);
    }
}
