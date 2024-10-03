package model;

public class Counter {

    private int value;

    public Counter() {
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void increment() {
        this.value++;
    }

    public void decrement() {
        this.value--;
    }

    public void reset() {
        this.value = 0;
    }
}
