package br.com.poc.jackson;

import br.com.poc.BenchmarkState;
import br.com.poc.Subject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.infra.Blackhole;

public class JacksonSerializationBenchmark {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    @Benchmark
    @BenchmarkMode(value = {Mode.AverageTime, Mode.Throughput})
    public void serializeJackson(BenchmarkState state, Blackhole blackhole) throws JsonProcessingException {
        Subject subject = new Subject(state.id, state.name, state.text);
        String jsonValue = objectMapper.writeValueAsString(subject);

        blackhole.consume(jsonValue);
    }
}
