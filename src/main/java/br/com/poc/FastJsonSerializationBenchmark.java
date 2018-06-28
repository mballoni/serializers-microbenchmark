package br.com.poc;

import com.alibaba.fastjson.JSON;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.infra.Blackhole;

public class FastJsonSerializationBenchmark {


    @Benchmark
    @BenchmarkMode(value = {Mode.AverageTime, Mode.Throughput})
    public void testMethod(FastJsonState fastJsonState, Blackhole blackhole) {
        String jsonValue = JSON.toJSONString(fastJsonState.subject);

        blackhole.consume(jsonValue);
    }
}
