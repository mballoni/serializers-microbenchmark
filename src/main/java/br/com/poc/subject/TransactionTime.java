package br.com.poc.subject;

public class TransactionTime {
    private TradeDate date;
    private TradeTime time;

    public TransactionTime() {
    }

    public TransactionTime(TradeDate date, TradeTime time) {
        this.date = date;
        this.time = time;
    }

    public TradeDate getDate() {
        return date;
    }

    public void setDate(TradeDate date) {
        this.date = date;
    }

    public TradeTime getTime() {
        return time;
    }

    public void setTime(TradeTime time) {
        this.time = time;
    }
}
