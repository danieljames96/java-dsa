package com.learning;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "Purple";
        colors[1] = "Blue";

        int[] numbers = {100,200};

        System.out.println(Arrays.toString(colors));

        for(int i=0; i < colors.length; i++)
        {
            System.out.println(numbers[i]);
        }

    }
}
