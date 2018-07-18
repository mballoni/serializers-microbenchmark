package br.com.poc.gson;

import com.google.gson.Gson;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Thread)
public class GsonState {
    Gson gson = new Gson();
}
