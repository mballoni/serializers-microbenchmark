package br.com.poc;

import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Thread)
public class BenchmarkState {
    public String id = "1";
    public String name = "2";
    public String text = "3";
}
