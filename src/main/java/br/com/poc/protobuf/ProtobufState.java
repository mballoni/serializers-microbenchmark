package br.com.poc.protobuf;

import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

import static br.com.poc.state.Constants.*;

@State(Scope.Thread)
public class ProtobufState {
    TradeDate tradeDate = TradeDate.newBuilder()
            .setDay(DAY)
            .setMonth(MONTH)
            .setYear(YEAR)
            .build();

    Exchange exchange = Exchange.newBuilder()
            .setValue(EXCHANGE)
            .build();

    TradeID tradeID = TradeID.newBuilder()
            .setExchangeCode(exchange)
            .setSide(SIDE)
            .setTicker(TICKER)
            .setTradeDate(tradeDate)
            .setTradeNumber(TRADE_NUMBER)
            .build();

    TradeTime tradeTime = TradeTime.newBuilder()
            .setHour(HOUR)
            .setMinute(MINUTE)
            .setSecond(SECOND)
            .setNano(NANO)
            .build();

    TransactionTime transactionTime = TransactionTime.newBuilder()
            .setDate(tradeDate)
            .setTime(tradeTime)
            .build();

    Data data = Data.newBuilder()
            .setTradeID(tradeID)
            .setTransactionTime(transactionTime)
            .setTradeDate(tradeDate)
            .setExchangeCode(exchange)
            .setClientOrderID(CLIENT_ORDER_ID)
            .setExchangeExecutionID(EXCHANGE_EXECUTION_ID)
            .setOrderID(ORDER_ID)
            .setSide(SIDE)
            .setTicker(TICKER)
            .setOrderValidityType(ORDER_VALIDITY_TYPE)
            .setSecondaryOrderID(SECONDARY_ORDER_ID)
            .setSessionID(SESSION_ID)
            .setTradeNumber(TRADE_NUMBER)
            .setBrokerDealerCode(BROKER_DEALER_CODE)
            .setEnteringTrader(ENTERING_TRADER)
            .setSenderLocation(SENDER_LOCATION)
            .setPrice(PRICE)
            .setQuantity(QUANTITY)
            .setAccount(ACCOUNT)
            .setTradingSessionID(TRADING_SESSION_ID)
            .setTradingSessionSubID(TRADING_SESSION_SUB_ID)
            .setCounterPartyBroker(COUNTER_PARTY_BROKER)
            .build();

    Subject subject = Subject.newBuilder()
            .setData(data)
            .setType(TYPE)
            .build();
}
