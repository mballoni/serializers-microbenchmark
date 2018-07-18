package br.com.poc.state;

import br.com.poc.subject.*;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

import static br.com.poc.state.Constants.*;

@State(Scope.Thread)
public class DefaultState {
    private TradeDate tradeDate = new TradeDate(YEAR, MONTH, DAY);
    private Exchange exchange = new Exchange(EXCHANGE);
    private TradeID tradeID = new TradeID(exchange, tradeDate, SIDE, TICKER, TRADE_NUMBER);
    private TradeTime tradeTime = new TradeTime(HOUR, MINUTE, SECOND, NANO);
    private TransactionTime transactionTime = new TransactionTime(tradeDate, tradeTime);
    private Data data = new Data(CLIENT_ORDER_ID, EXCHANGE_EXECUTION_ID, ORDER_ID, SIDE, TICKER, ORDER_VALIDITY_TYPE, tradeDate, transactionTime, SECONDARY_ORDER_ID, SESSION_ID, TRADE_NUMBER, BROKER_DEALER_CODE, ENTERING_TRADER, SENDER_LOCATION, exchange, PRICE, QUANTITY, ACCOUNT, TRADING_SESSION_ID, TRADING_SESSION_SUB_ID, COUNTER_PARTY_BROKER, tradeID);

    public Subject subject = new Subject(TYPE, data);
}
