package br.com.poc.subject;

public class TradeID {
    private Exchange exchangeCode;
    private TradeDate tradeDate;
    private String side;
    private String ticker;
    private String tradeNumber;

    public TradeID() {
    }

    public TradeID(Exchange exchangeCode, TradeDate tradeDate, String side, String ticker, String tradeNumber) {
        this.exchangeCode = exchangeCode;
        this.tradeDate = tradeDate;
        this.side = side;
        this.ticker = ticker;
        this.tradeNumber = tradeNumber;
    }

    public Exchange getExchangeCode() {
        return exchangeCode;
    }

    public void setExchangeCode(Exchange exchangeCode) {
        this.exchangeCode = exchangeCode;
    }

    public TradeDate getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(TradeDate tradeDate) {
        this.tradeDate = tradeDate;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getTradeNumber() {
        return tradeNumber;
    }

    public void setTradeNumber(String tradeNumber) {
        this.tradeNumber = tradeNumber;
    }
}
