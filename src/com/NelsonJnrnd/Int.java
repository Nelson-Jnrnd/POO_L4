package com.NelsonJnrnd;

public class Int implements Comparable<Int>{
    public void set_value(int _value) {
        this._value = _value;
    }

    public int get_value() {
        return _value;
    }

    @Override
    public String toString() {
        return "to_String() perso " + Integer.toString(_value);
    }

    private int _value;

    public Int(int value) {
        this._value = value;
    }

    @Override
    public int compareTo(Int o) {
        return Integer.compare(_value, o._value);
    }
}
