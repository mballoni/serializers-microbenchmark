package br.com.poc.gson;

import br.com.poc.Subject;
import com.google.gson.Gson;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Thread)
public class GsonState {
    Subject subject = new Subject("1", "2", "3");
    Gson gson = new Gson();
}
