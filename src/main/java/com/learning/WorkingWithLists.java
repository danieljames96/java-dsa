package com.learning;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        List colors = new ArrayList();
        colors.add("Purple");
        colors.add("Blue");
        colors.add(2);
        colors.add(new Object());

        List<String> colors2 = new ArrayList<>();
        colors2.add("Purple");
        colors2.add("Blue");
        colors2.add("Yellow");
        System.out.println(colors2);
        System.out.println(colors2.size());
        System.out.println(colors2.contains("Blue"));
        System.out.println(colors2.contains("Pink"));

        for(String color : colors2){
            System.out.println(color);
        }

        colors2.forEach(System.out::println);

        for (int i = 0; i < colors2.size(); i++) {
            System.out.println(colors2.get(i));
        }

        List<String> colors_unmodifiable = List.of( //List.of makes it immutable
                "blue",
                "yellow"
        );
    }
}
