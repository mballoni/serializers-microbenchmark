package br.com.poc.fastjson;

import br.com.poc.Subject;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Thread)
public class FastJsonState {
    Subject subject = new Subject("1", "2", "3");
}
