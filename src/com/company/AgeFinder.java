package com.company;

public class AgeFinder {
    public static void main(String[] args) {
        int[] ages = {2, 4, 6, 8};
        String[] names = {"john", "mary", "bert", "nony"};

        int i=0;
        while (i<names.length){
            System.out.println(names[i] + " " +ages[i]);
            i++;
        }
    }

}


