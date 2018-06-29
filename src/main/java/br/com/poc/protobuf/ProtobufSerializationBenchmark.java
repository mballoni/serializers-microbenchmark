package br.com.poc.protobuf;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.infra.Blackhole;

public class ProtobufSerializationBenchmark {

    @Benchmark
    @BenchmarkMode(value = {Mode.AverageTime, Mode.Throughput})
    public void serializeProtobuf(ProtobufState protobufState, Blackhole blackhole) {
        byte[] bytes = protobufState.subject.toByteArray();

        blackhole.consume(bytes);
    }
}
