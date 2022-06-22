package com.jmlengineering;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMap {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Mariam"));
        map.put(2, new Person("Mari"));
        map.put(3, new Person("Ian"));
        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        map.entrySet()
                .forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));
        map.forEach((key, person) -> {
            System.out.println(key + " - " + person);
        });
        System.out.println(map.getOrDefault(4, new Person("default")));
    }

    record Person(String name){}
}
