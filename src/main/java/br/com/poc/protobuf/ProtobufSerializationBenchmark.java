package br.com.poc.protobuf;

import br.com.poc.BenchmarkState;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.infra.Blackhole;

public class ProtobufSerializationBenchmark {

    @Benchmark
    @BenchmarkMode(value = {Mode.AverageTime, Mode.Throughput})
    public void serializeProtobuf(BenchmarkState state, Blackhole blackhole) {
        Subject subject = Subject.newBuilder()
                .setId(state.id)
                .setName(state.name)
                .setText(state.text)
                .build();

        byte[] bytes = subject.toByteArray();

        blackhole.consume(bytes);
    }
}
