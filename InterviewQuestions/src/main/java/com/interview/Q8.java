package com.interview;

public class Q8<T> {
    T value;

    public Q8(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {


        Q8<String> first = new Q8<>("a string");
        Q8<Integer> two = new Q8<>(123);
        System.out.print(first.getValue());
        System.out.print(two.getValue());
    }
}




