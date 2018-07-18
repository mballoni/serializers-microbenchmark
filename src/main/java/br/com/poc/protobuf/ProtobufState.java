package br.com.poc.protobuf;

import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Thread)
public class ProtobufState {
    Data data = Data.newBuilder()
            .build();

    TradeDate tradeDate = TradeDate.newBuilder()
            .build();
    TradeID tradeID = TradeID.newBuilder()
            .build();
    Exchange exchange = Exchange.newBuilder()
            .build();
    TradeTime tradeTime = TradeTime.newBuilder()
            .build();
    TransactionTime transactionTime = TransactionTime.newBuilder()
            .build();

    Subject subject = Subject.newBuilder()
            .setData(data)
            .setType("type1")
            .build();
}
