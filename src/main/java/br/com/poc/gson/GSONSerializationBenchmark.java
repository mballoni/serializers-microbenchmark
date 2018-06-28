package br.com.poc.gson;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.infra.Blackhole;

public class GSONSerializationBenchmark {

    @Benchmark
    @BenchmarkMode(value = {Mode.AverageTime, Mode.Throughput})
    public void serializeGSON(GsonState gsonState, Blackhole blackhole) {
        String jsonValue = gsonState.gson.toJson(gsonState.subject);

        blackhole.consume(jsonValue);
    }
}
