package br.com.poc.gson;

import br.com.poc.BenchmarkState;
import br.com.poc.Subject;
import com.google.gson.Gson;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.infra.Blackhole;

public class GSONSerializationBenchmark {

    private static final Gson gson = new Gson();

    @Benchmark
    @BenchmarkMode(value = {Mode.AverageTime, Mode.Throughput})
    public void serializeGSON(BenchmarkState state, Blackhole blackhole) {
        Subject subject = new Subject(state.id, state.name, state.text);
        String jsonValue = gson.toJson(subject);

        blackhole.consume(jsonValue);
    }
}
