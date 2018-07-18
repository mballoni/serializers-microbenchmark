package br.com.poc.gson;

import br.com.poc.state.DefaultState;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.infra.Blackhole;

public class GSONSerializationBenchmark {

    @Benchmark
    @BenchmarkMode(value = {Mode.AverageTime, Mode.Throughput})
    public void serializeGSON(GsonState gsonState, DefaultState state, Blackhole blackhole) {
        String jsonValue = gsonState.gson.toJson(state.subject);

        blackhole.consume(jsonValue);
    }
}
