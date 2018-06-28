package br.com.poc.jackson;

import br.com.poc.Subject;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Thread)
public class JacksonState {
    Subject subject = new Subject("1", "2", "3");
    ObjectMapper objectMapper = new ObjectMapper();
}
