package br.com.poc;

import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Thread)
public class FastJsonState {
    Subject subject = new Subject("1", "2", "3");
}
