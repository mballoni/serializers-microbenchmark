package br.com.poc.subject;

public class Data {
    private String clientOrderID;
    private String exchangeExecutionID;
    private String orderID;
    private String side;
    private String ticker;
    private String orderValidityType;
    private TradeDate tradeDate;
    private TransactionTime transactionTime;
    private String secondaryOrderID;
    private String sessionID;
    private String tradeNumber;
    private String brokerDealerCode;
    private String enteringTrader;
    private String senderLocation;
    private Exchange exchangeCode;
    private double price;
    private double quantity;
    private String account;
    private String tradingSessionID;
    private String tradingSessionSubID;
    private String counterPartyBroker;
    private TradeID tradeID;

    public Data() {
    }

    public Data(String clientOrderID, String exchangeExecutionID, String orderID, String side, String ticker, String orderValidityType, TradeDate tradeDate, TransactionTime transactionTime, String secondaryOrderID, String sessionID, String tradeNumber, String brokerDealerCode, String enteringTrader, String senderLocation, Exchange exchangeCode, double price, double quantity, String account, String tradingSessionID, String tradingSessionSubID, String counterPartyBroker, TradeID tradeID) {
        this.clientOrderID = clientOrderID;
        this.exchangeExecutionID = exchangeExecutionID;
        this.orderID = orderID;
        this.side = side;
        this.ticker = ticker;
        this.orderValidityType = orderValidityType;
        this.tradeDate = tradeDate;
        this.transactionTime = transactionTime;
        this.secondaryOrderID = secondaryOrderID;
        this.sessionID = sessionID;
        this.tradeNumber = tradeNumber;
        this.brokerDealerCode = brokerDealerCode;
        this.enteringTrader = enteringTrader;
        this.senderLocation = senderLocation;
        this.exchangeCode = exchangeCode;
        this.price = price;
        this.quantity = quantity;
        this.account = account;
        this.tradingSessionID = tradingSessionID;
        this.tradingSessionSubID = tradingSessionSubID;
        this.counterPartyBroker = counterPartyBroker;
        this.tradeID = tradeID;
    }

    public String getClientOrderID() {
        return clientOrderID;
    }

    public void setClientOrderID(String clientOrderID) {
        this.clientOrderID = clientOrderID;
    }
}
