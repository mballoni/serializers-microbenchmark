package br.com.poc.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Thread)
public class JacksonState {
    ObjectMapper objectMapper = new ObjectMapper();
}
