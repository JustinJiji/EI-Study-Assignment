# Use Case: Stock Market System
## Description
This project implements a stock market system where multiple clients subscribe to receive notifications when the stock price changes.

## Structure
- `Client`: The interface that all clients implement. Each client is updated when the subject changes.
- `Subject`: The subject (Stock) that notifies the observers when its internal state (stock price) changes.
- `Stock`: A concrete implementation of the `Subject` class, which manages the list of clients and notifies them when the stock price changes.
- `StockClient`: A concrete implementation of the `Client` interface, representing a client receiving stock price updates.