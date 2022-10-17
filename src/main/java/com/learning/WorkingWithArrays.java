package com.learning;

import java.util.Arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "Purple";
        colors[1] = "Blue";

        int[] numbers = {100,200};

        System.out.println(Arrays.toString(colors));

        for(int i=0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }

        for(String color : colors){
            System.out.println(color);
        }

        Arrays.stream(colors).forEach(System.out::println);

    }
}
