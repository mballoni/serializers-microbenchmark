package br.com.poc.jackson;

import br.com.poc.state.DefaultState;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.infra.Blackhole;

public class JacksonSerializationBenchmark {

    @Benchmark
    @BenchmarkMode(value = {Mode.AverageTime, Mode.Throughput})
    public void serializeJackson(JacksonState jacksonState, DefaultState state, Blackhole blackhole) throws JsonProcessingException {
        String jsonValue = jacksonState.objectMapper.writeValueAsString(state.subject);

        blackhole.consume(jsonValue);
    }
}
