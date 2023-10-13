package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

class ThreadDemo {
    public static void main(String[] args) {
        Thread t = new Test() {
            public void run() {
                System.out.println(" foo");
            }
        };
        t.start();
    }
    ArrayList<? super Number> numbers = new ArrayList<>();
    Number n = Integer.valueOf(42);
    List<Number> aList = new ArrayList<>();
    Collection<Number> aCollection = aList;
    Iterable<Number> iterable = aCollection;

    List<Integer> ints = Arrays.asList(1,2,3);
 /*   List<Number> nums = ints; // compile-time error. Проблема обнаружилась на этапе компиляции
nums.set(2, 3.14);
assert ints.toString().equals("[1, 2, 3.14]");*/
}

public class Test extends Thread {
    Test() {
        System.out.println(" MyThread");
    }

    public void run() {
        System.out.println(" bar");
    }

    public void run(String s) {
        System.out.println(" baz");
    }
}