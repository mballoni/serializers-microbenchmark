package br.com.poc.fastjson;

import br.com.poc.BenchmarkState;
import br.com.poc.Subject;
import com.alibaba.fastjson.JSON;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.infra.Blackhole;

public class FastJsonSerializationBenchmark {

    @Benchmark
    @BenchmarkMode(value = {Mode.AverageTime, Mode.Throughput})
    public void serializeFastJson(BenchmarkState state, Blackhole blackhole) {
        Subject subject = new Subject(state.id, state.name, state.text);
        String jsonValue = JSON.toJSONString(subject);

        blackhole.consume(jsonValue);
    }
}
