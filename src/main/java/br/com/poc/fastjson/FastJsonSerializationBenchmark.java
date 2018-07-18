package br.com.poc.fastjson;

import br.com.poc.state.DefaultState;
import com.alibaba.fastjson.JSON;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.infra.Blackhole;

public class FastJsonSerializationBenchmark {


    @Benchmark
    @BenchmarkMode(value = {Mode.AverageTime, Mode.Throughput})
    public void serializeFastJson(DefaultState state, Blackhole blackhole) {
        String jsonValue = JSON.toJSONString(state.subject);

        blackhole.consume(jsonValue);
    }
}
