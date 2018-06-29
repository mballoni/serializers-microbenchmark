package br.com.poc.protobuf;

import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Thread)
public class ProtobufState {
    Subject subject = Subject.newBuilder()
            .setId("1")
            .setName("2")
            .setText("3")
            .build();
}
