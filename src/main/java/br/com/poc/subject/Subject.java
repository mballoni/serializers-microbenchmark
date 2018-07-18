package br.com.poc.subject;

public class Subject {
    private String type;
    private Data name;

    public Subject() {
    }

    public Subject(String type, Data name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Data getName() {
        return name;
    }

    public void setName(Data name) {
        this.name = name;
    }
}
