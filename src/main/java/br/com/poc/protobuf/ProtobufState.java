package br.com.poc.protobuf;

import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Thread)
public class ProtobufState {
    TradeDate tradeDate = TradeDate.newBuilder()
            .setDay(2)
            .setMonth(12)
            .setYear(2018)
            .build();

    Exchange exchange = Exchange.newBuilder()
            .setValue("hadasokpp")
            .build();

    TradeID tradeID = TradeID.newBuilder()
            .setExchangeCode(exchange)
            .setSide("BUY")
            .setTicker("ABC3")
            .setTradeDate(tradeDate)
            .setTradeNumber("sdfsd")
            .build();

    TradeTime tradeTime = TradeTime.newBuilder()
            .setHour(14)
            .setMinute(25)
            .setMinute(13)
            .setNano(123_123_123L)
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
            .setClientOrderID("123454")
            .setExchangeExecutionID("12")
            .setOrderID("78")
            .setSide("BUY")
            .setTicker("ABC3")
            .setOrderValidityType("123")
            .setSecondaryOrderID("099")
            .setSessionID("8009")
            .setTradeNumber("7128")
            .setBrokerDealerCode("6589")
            .setEnteringTrader("589")
            .setSenderLocation("87655")
            .setPrice(145.12)
            .setQuantity(45.0)
            .setAccount("456")
            .setTradingSessionID("089128")
            .setTradingSessionSubID("3120")
            .setCounterPartyBroker("989")
            .build();

    Subject subject = Subject.newBuilder()
            .setData(data)
            .setType("type1")
            .build();
}
