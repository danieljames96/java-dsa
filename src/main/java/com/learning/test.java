package com.learning;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        System.out.println(a.length);
        List<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(2);
        b.add(3);
        System.out.println(b.size());
    }
}
