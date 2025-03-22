package com.example;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"Hello", "World", "Java"};

        Filter lengthFilter = new Filter() {
            @Override
            public Object apply(Object o) {
                String str = (String) o;
                return str.length();
            }
        };

        Object[] lengths = filter(strings, lengthFilter);
        for(Object o : lengths) {
            System.out.println(o);
        }
    }

    private static <T> Object[] filter(T[] array, Filter filter){
        Object[] filtered = new Object[array.length];
        for (int i = 0; i < array.length; i++) {
            filtered[i] = filter.apply(array[i]);
        }
        return filtered;
    }
}

